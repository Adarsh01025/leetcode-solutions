class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int left = 0, right = nums.length - 1;

        while (left < right) {
            if ((nums[left] & 1) > (nums[right] & 1)) {
                int temp = nums[left];
                nums[left] = nums[right];
                nums[right] = temp;
            }

            if ((nums[left] & 1) == 0) left++;
            if ((nums[right] & 1) == 1) right--;
        }

        return nums;
    }
}