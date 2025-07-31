public class NQueens {

    // Check if it's safe to place a queen at board[row][col]
    public static boolean isSafe(char board[][], int row, int col) {

        // Vertical up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // Diagonal left up
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // Diagonal right up
        for (int i = row - 1, j = col + 1; i >= 0 && j < board.length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    // Solve the N-Queens problem recursively
    public static void nQueens(char board[][], int row) {
        // Base case: All rows filled
        if (row == board.length) {
            printBoard(board);
            return;
        }

        // Try placing a queen in each column
        for (int j = 0; j < board.length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q'; // Place queen
                nQueens(board, row + 1); // Recur
                board[row][j] = 'x'; // Backtrack
            }
        }
    }

    // Print the chess board
    public static void printBoard(char board[][]) {
        System.out.println("_________ Chess Board _________");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board.length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method
    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];

        // Initialize the board with 'x'
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = 'x';
            }
        }

        nQueens(board, 0);
    }
}