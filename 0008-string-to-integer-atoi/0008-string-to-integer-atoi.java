class Solution {
    public int myAtoi(String s) {
        int index = 0;
        int len = s.length();
        int sign = 1;
        int res = 0;


        while (index < len && s.charAt(index) == ' ') {
            index++;
        }

        if (index < len && (s.charAt(index) == '+' || s.charAt(index) == '-')) {
            sign = s.charAt(index++) == '+' ? sign : -1;
        }

        while (index < len && s.charAt(index) >= '0' && s.charAt(index) <= '9') {
            if (Integer.MAX_VALUE / 10 < res || (res == Integer.MAX_VALUE / 10 && s.charAt(index) - '0' > 7)) {
                return sign == 1 ? Integer.MAX_VALUE : Integer.MIN_VALUE;
            }
            res = res * 10 + (s.charAt(index++) - '0');
        }

        return res * sign;
    }
}