class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rows = new int[9];
        int[] cols = new int[9];
        int[] boxes = new int[9];

        for (int r = 0; r < 9; r++) {
            for (int c = 0; c < 9; c++) {
                if (board[r][c] == '.') continue;

                int digit = board[r][c] - '1';
                int mask = 1 << digit;
                int box = (r / 3) * 3 + (c / 3);

                if ((rows[r] & mask) != 0 ||
                    (cols[c] & mask) != 0 ||
                    (boxes[box] & mask) != 0) {
                    return false;
                }

                rows[r] |= mask;
                cols[c] |= mask;
                boxes[box] |= mask;
            }
        }

        return true;
    }
}







//clean code
// class Solution {
//     public boolean isValidSudoku(char[][] board) {
//         boolean[][] rows = new boolean[9][9];
//         boolean[][] cols = new boolean[9][9];
//         boolean[][] boxes = new boolean[9][9];

//         for (int r = 0; r < 9; r++) {
//             for (int c = 0; c < 9; c++) {
//                 if (board[r][c] == '.') {
//                     continue;
//                 }

//                 int num = board[r][c] - '1';
//                 int box = (r / 3) * 3 + (c / 3);

//                 if (rows[r][num] || cols[c][num] || boxes[box][num]) {
//                     return false;
//                 }

//                 rows[r][num] = true;
//                 cols[c][num] = true;
//                 boxes[box][num] = true;
//             }
//         }

//         return true;
//     }
// }