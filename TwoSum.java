class Solution {
    public int[] twoSum(int[] a, int t) {
        int x, y = 0;
        int op[] = new int[2];
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i + 1; j < a.length; j++) {
                if (a[i] + a[j] == t) {
                    op[0] = i;
                    op[1] = j;
                }
            }
        }
        return op;
    }
}