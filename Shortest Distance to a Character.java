class Solution {
    public int[] shortestToChar(String s, char c) {
        int n = s.length();
        int[] arr = new int[n];
        int last = Integer.MAX_VALUE / 2;
        for (int i = n - 1; i >= 0; i--) {
            if (s.charAt(i) == c)
                last = i;
            arr[i] = last - i;
        }
        last = -Integer.MAX_VALUE / 2;
        for (int i = 0; i < n; i++) {
            if (s.charAt(i) == c)
                last = i;
            arr[i] = Math.min(i - last, arr[i]);
        }
        return arr;
    }
}