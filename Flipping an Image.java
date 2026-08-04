class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int n = image.length;
        
        for (int[] row : image) {
            int left = 0, right = n - 1;
            
            while (left <= right) {
                if (row[left] == row[right]) {
                    // If elements are the same, both flip values (0->1, 1->0)
                    row[left] ^= 1;
                    if (left != right) {
                        row[right] ^= 1;
                    }
                }
                left++;
                right--;
            }
        }
        
        return image;
    }
}