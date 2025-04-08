class Solution {
    public int rob(int[] nums) {
        int len = nums.length;
        if (nums == null || len == 0) {
            return 0;
        }

        if (len == 1) {
            return nums[0];
        }

        int[] arr = new int[len + 1];
        arr[0] = nums[0];
        arr[1] = Math.max(nums[0], nums[1]);

        for (int i = 2; i < len; i++) {
            arr[i] = Math.max(arr[i - 1], arr[i - 2] + nums[i]);
        }
        return arr[len -1];
    }
}