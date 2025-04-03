class Solution {
    public int maxProfit(int[] prices) {
        int length = prices.length;
        if (prices == null || length == 0 ||length == 1) {
            return 0;
        }

        int min = prices[0];
        int max = 0;
        int result = 0;
        for (int i = 0; i < length; i++) {
            if (prices[i] > max) {
                max = prices[i];
                result = max - min > result ? max - min : result;
            } 
            if (prices[i] < min) {
                min = prices[i];
                max = 0;
            }
        }

        return result;
    }
}