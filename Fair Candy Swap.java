class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumA = 0, sumB = 0;

        for (int x : aliceSizes) sumA += x;
        for (int x : bobSizes) sumB += x;

        int diff = (sumA - sumB) / 2;

        HashSet<Integer> set = new HashSet<>();
        for (int x : aliceSizes) set.add(x);

        for (int y : bobSizes) {
            if (set.contains(y + diff))
                return new int[]{y + diff, y};
        }

        return new int[0];
    }
}