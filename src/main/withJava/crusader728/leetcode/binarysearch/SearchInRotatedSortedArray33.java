package withJava.crusader728.leetcode.binarysearch;

public class SearchInRotatedSortedArray33 {
    public int search(int[] nums, int target) {
        if(nums == null || nums.length == 0) {
            return -1;
        }

        int l = 0;
        int r = nums.length - 1;
        while(l <= r) {
            int mid = l + (r - l) / 2;
            if(nums[mid] == target) {
                return mid;
            } else {
                if(nums[mid] < nums[l]) {
                    if(target < nums[mid]) {
                        r = mid - 1;
                    } else if(target > nums[mid] && target <= nums[r]) {
                        l = mid + 1;
                    } else {
                        r = mid - 1;
                    }
                } else {
                    if(target < nums[mid] && nums[l] <= target) {
                        r = mid - 1;
                    } else {
                        l = mid + 1;
                    }
                }
            }
        }
        return -1;
    }
}
