import java.util.HashSet;

class Solution {

    // ✅ Approach 1: Using a single HashSet with string identifiers
    public static boolean isValidSudoku(char[][] board) {
        HashSet<String> seen = new HashSet<>();

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                char number = board[i][j];

                if (number == '.') continue;

                // Try to add unique identifiers for row, column, and box
                if (
                        !seen.add(number + " found in row " + i) ||
                        !seen.add(number + " found in col " + j) ||
                        !seen.add(number + " found in box " + (i / 3) + "-" + (j / 3))
                ) {
                    return false; // Duplicate found
                }
            }
        }

        return true; // No duplicates found, board is valid
    }

    /*
    // ❌ Approach 2: Separate HashSets for row, column, and 3x3 box
    // ✅ This also works, but is commented out in favor of the cleaner version above

    public static boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < 9; i++) {
            HashSet<Character> row = new HashSet<>();
            HashSet<Character> col = new HashSet<>();
            HashSet<Character> box = new HashSet<>();

            for (int j = 0; j < 9; j++) {
                // Row check
                if (board[i][j] != '.') {
                    if (!row.add(board[i][j])) return false;
                }

                // Column check
                if (board[j][i] != '.') {
                    if (!col.add(board[j][i])) return false;
                }

                // Box check
                int rowIndex = 3 * (i / 3);
                int colIndex = 3 * (i % 3);
                char boxChar = board[rowIndex + j / 3][colIndex + j % 3];
                if (boxChar != '.') {
                    if (!box.add(boxChar)) return false;
                }
            }
        }

        return true;
    }
    */

    public static void main(String[] args) {
        char[][] board = {
                {'5','3','.','.','7','.','.','.','.'},
                {'6','.','.','1','9','5','.','.','.'},
                {'.','9','8','.','.','.','.','6','.'},
                {'8','.','.','.','6','.','.','.','3'},
                {'4','.','.','8','.','3','.','.','1'},
                {'7','.','.','.','2','.','.','.','6'},
                {'.','6','.','.','.','.','2','8','.'},
                {'.','.','.','4','1','9','.','.','5'},
                {'.','.','.','.','8','.','.','7','9'}
        };

        System.out.println(isValidSudoku(board)); // Expected output: true
    }
}
