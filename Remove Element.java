class Solution {
    public int removeElement(int[] nums, int val) {
        // int res[] = new int[nums.length];
        // int j = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (!(nums[i] == val)) {
        //         res[j] = nums[i];
        //         j++;
        //     } else {
        //         res[j] = '_';
        //     }
        // }
        // int k = 0;
        // for (int i = 0; i < nums.length; i++) {
        //     if (res[i] != '_') {
        //         k++;
        //     }
        // }
        // return k;
        int index = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) {
                nums[index] = nums[i];
                index++;
            }
        }
        return index;
    }
}