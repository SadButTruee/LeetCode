class Solution {
    public int climbStairs(int n) {

        return f(n);
    }

    public int f(int n) {
        if (n <= 2) {
            return n;
        }
        int a = 1;
        int b = 2;
        int f = 0;
        for (int i = 3; i <= n; i++) {
            f = a + b;
            a = b;
            b = f;
        }
        return f;
    }
}