class Solution {
    public boolean isValidSudoku(char[][] board) {
        int[] rowMark = new int[9], colMark = new int[9], subboxMark = new int[9];
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                if (Character.isDigit(board[i][j])) {
                    int num = board[i][j] - '0';
                    int subboxIdx = 3 * (i / 3) + j / 3;
                    int mask = 1 << num;
                    if ((mask & rowMark[i]) != 0 || (mask & colMark[j]) != 0 || (mask & subboxMark[subboxIdx]) != 0) {
                        return false;
                    }
                    rowMark[i] |= mask;
                    colMark[j] |= mask;
                    subboxMark[subboxIdx] |= mask;
                }
            }
        }
        return true;
    }
}