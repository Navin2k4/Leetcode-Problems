import java.util.Arrays;

class Solution {
    public int[] searchRange(int[] nums, int target) {
        int ans[] = { -1, -1 };
        // check for first occourance of target first
        int start = search(nums, target, true);
        int end = search(nums, target, false);
        ans[0] = start;
        ans[1] = end;
        return ans;
    }
    
    static int search(int[] nums, int target, boolean findStartIndex) {
        int ans = -1;
        int start = 0;
        int end = nums.length - 1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if (target < nums[mid]) {
                end = mid - 1;
            } else if (target > nums[mid]) {
                start = mid + 1;
            } else {
                // potential answer found
                ans = mid;
                if (findStartIndex) {
                    end = mid - 1;
                } else {
                    start = mid + 1;
                }
            }
        }
        return ans;
    }

    public static void main(String[] args) {
        Solution sol = new Solution();
        int array[] = { 5, 7, 7, 8, 8, 10 };
        int ans[] = sol.searchRange(array, 8);
        System.out.println(Arrays.toString(ans));
    }
}

