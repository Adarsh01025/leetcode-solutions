class Solution {
    public int[] intersect(int[] nums1, int[] nums2) {
        if (nums1.length > nums2.length)
            return intersect(nums2, nums1);

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums1)
            map.put(num, map.getOrDefault(num, 0) + 1);

        int[] temp = new int[nums1.length];
        int index = 0;

        for (int num : nums2) {
            Integer count = map.get(num);
            if (count != null && count > 0) {
                temp[index++] = num;
                if (count == 1)
                    map.remove(num);
                else
                    map.put(num, count - 1);
            }
        }

        return Arrays.copyOf(temp, index);
    }
}