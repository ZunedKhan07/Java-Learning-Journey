// Backtracking : Find all posible solutions and used the one you want.



                    //    N-Queens chese problem
// import java.util.ArrayList;
// import java.util.List;

// public class BackTracking {

//     // Check if it's safe to place a Queen at board[row][col]
//     public static boolean isSafe(int row, int col, char[][] board) {
//         int n = board.length;

//         // Check horizontal (row)
//         for (int j = 0; j < n; j++) {
//             if (board[row][j] == 'Q') return false;
//         }

//         // Check vertical (col)
//         for (int i = 0; i < n; i++) {
//             if (board[i][col] == 'Q') return false;
//         }

//         // Upper left diagonal
//         for (int r = row, c = col; r >= 0 && c >= 0; r--, c--) {
//             if (board[r][c] == 'Q') return false;
//         }

//         // Upper right diagonal
//         for (int r = row, c = col; r >= 0 && c < n; r--, c++) {
//             if (board[r][c] == 'Q') return false;
//         }

//         // Lower left diagonal
//         for (int r = row, c = col; r < n && c >= 0; r++, c--) {
//             if (board[r][c] == 'Q') return false;
//         }

//         // Lower right diagonal
//         for (int r = row, c = col; r < n && c < n; r++, c++) {
//             if (board[r][c] == 'Q') return false;
//         }

//         return true;
//     }

//     // Save the current board configuration
//     public static void saveBoard(char[][] board, List<List<String>> allBoards) {
//         List<String> newBoard = new ArrayList<>();
//         for (int i = 0; i < board.length; i++) {
//             String row = "";
//             for (int j = 0; j < board[0].length; j++) {
//                 row += board[i][j];
//             }
//             newBoard.add(row);
//         }
//         allBoards.add(newBoard);
//     }

//     // Recursive helper
//     public static void helper(char[][] board, List<List<String>> allBoards, int col) {
//         if (col == board.length) {
//             saveBoard(board, allBoards);
//             return;
//         }

//         for (int row = 0; row < board.length; row++) {
//             if (isSafe(row, col, board)) {
//                 board[row][col] = 'Q';
//                 helper(board, allBoards, col + 1);
//                 board[row][col] = '.';
//             }
//         }
//     }

//     // Main solve function
//     public static List<List<String>> solveNQueens(int n) {
//         List<List<String>> allBoards = new ArrayList<>();
//         char[][] board = new char[n][n];

//         // Fill board with '.'
//         for (int i = 0; i < n; i++) {
//             for (int j = 0; j < n; j++) {
//                 board[i][j] = '.';
//             }
//         }

//         helper(board, allBoards, 0);
//         return allBoards;
//     }

//     public static void main(String[] args) {
//         int n = 4; // Example: 4 Queens
//         List<List<String>> solutions = solveNQueens(n);

//         // Print all solutions
//         for (List<String> board : solutions) {
//             for (String row : board) {
//                 System.out.println(row);
//             }
//             System.out.println();
//         }
//     }
// }







// public class BackTracking {  // TimeComp. : n*n!
//     public static void printPermutation(String str, String perm, int idx){
//         if (str.length() == 0) {
//             System.out.println(perm);
//             return;
//         }

//         for(int i=0; i<str.length(); i++){
//             char currChar = str.charAt(i);
//             String newStr = str.substring(0, i) + str.substring(i+1);
//             printPermutation(newStr, perm+currChar, idx+1);
//         }
//     }

//     public static void main(String[] args) {
//         String str = "ABC";
//         printPermutation(str, "", 0);
//     }
// }
