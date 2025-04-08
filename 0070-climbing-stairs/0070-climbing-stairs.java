class Solution {
    public int climbStairs(int n) {
        int arr[] = new int[n + 1];
        return f(arr, n);
    }

    public int f(int arr[], int n) {
        if (n == 1) {
            return 1;
        }
        if (n == 2) {
            return 2;
        }

        if (arr[n] != 0) {
            return arr[n];
        }
        arr[n] = f(arr, n - 1) + f(arr, n - 2) ;
        return arr[n];
    }
}