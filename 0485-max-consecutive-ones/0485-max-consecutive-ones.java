class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int globalCount = 0;

        for (int i : nums) {
            if (i == 1) {
                count++;
                globalCount = Math.max(globalCount, count);
            } else {
                count = 0;
            }
        }
        return globalCount;
    }
}