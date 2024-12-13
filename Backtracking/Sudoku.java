// public class Sudoku {

//     public static boolean sudokuSolver(int sudoku[][], int row, int col) {
//         // base case: if we've gone past the last row, the sudoku is solved
//         if (row == 9) {
//             return true;
//         }

//         // recursion: move to the next column or next row if needed
//         int nextRow = row, nextCol = col + 1;
//         if (col + 1 == 9) {
//             nextRow = row + 1;
//             nextCol = 0;
//         }

//         // if the current cell is already filled, skip to the next one
//         if (sudoku[row][col] != 0) {
//             return sudokuSolver(sudoku, nextRow, nextCol);
//         }

//         // try filling the cell with digits 1 to 9
//         for (int digit = 1; digit <= 9; digit++) {
//             if (isSafe(sudoku, row, col, digit)) {
//                 sudoku[row][col] = digit;  // place the digit
//                 if (sudokuSolver(sudoku, nextRow, nextCol)) {
//                     return true;  // if solution found, return true
//                 }
//                 sudoku[row][col] = 0;  // backtrack if no solution
//             }
//         }
//         return false;  // if no digit is valid, return false to backtrack
//     }

//     public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
//         // Check the row
//         for (int i = 0; i < 9; i++) {
//             if (sudoku[row][i] == digit) {
//                 return false;
//             }
//         }

//         // Check the column
//         for (int i = 0; i < 9; i++) {
//             if (sudoku[i][col] == digit) {
//                 return false;
//             }
//         }

//         // Check the 3x3 subgrid
//         int startRow = (row / 3) * 3;
//         int startCol = (col / 3) * 3;
//         for (int i = startRow; i < startRow + 3; i++) {
//             for (int j = startCol; j < startCol + 3; j++) {
//                 if (sudoku[i][j] == digit) {
//                     return false;
//                 }
//             }
//         }

//         return true;
//     }

//     public static void printSudoku(int sudoku[][]) {
//         for (int i = 0; i < 9; i++) {
//             for (int j = 0; j < 9; j++) {
//                 System.out.print(sudoku[i][j] + " ");
//             }
//             System.out.println();
//         }
//     }

//     public static void main(String args[]) {
//         int sudoku[][] = {
//             {0, 0, 8, 0, 0, 0, 0, 0, 0},
//             {4, 0, 9, 1, 5, 7, 0, 0, 2},
//             {0, 0, 0, 0, 0, 0, 4, 1, 9},
//             {1, 8, 5, 0, 6, 0, 0, 2, 0},
//             {0, 0, 0, 0, 2, 0, 0, 6, 0},
//             {9, 6, 4, 0, 5, 3, 0, 0, 0},
//             {0, 3, 0, 0, 7, 2, 0, 0, 4},
//             {0, 4, 9, 0, 3, 0, 0, 5, 7},
//             {8, 2, 7, 0, 0, 9, 0, 1, 3}
//         };

//         if (sudokuSolver(sudoku, 0, 0)) {
//             System.out.println("Solution exists:");
//             printSudoku(sudoku);
//         } else {
//             System.out.println("No solution exists");
//         }
//     }
// }
public class Sudoku {

    // Method to solve the Sudoku puzzle
    public static boolean sudokuSolver(int[][] sudoku, int row, int col) {
        // Base case: if we've gone past the last row, the Sudoku is solved
        if (row == 9) {
            return true;
        }

        // Calculate the next position
        int nextRow = row, nextCol = col + 1;
        if (col + 1 == 9) {
            nextRow = row + 1;
            nextCol = 0;
        }

        // If the current cell is already filled, skip to the next one
        if (sudoku[row][col] != 0) {
            return sudokuSolver(sudoku, nextRow, nextCol);
        }

        // Try filling the cell with digits 1 to 9
        for (int digit = 1; digit <= 9; digit++) {
            if (isSafe(sudoku, row, col, digit)) {
                sudoku[row][col] = digit; // Place the digit

                // Recursively attempt to fill the next cell
                if (sudokuSolver(sudoku, nextRow, nextCol)) {
                    return true; // If solution found, return true
                }

                // Backtrack if no solution
                sudoku[row][col] = 0;
            }
        }
        return false; // If no digit is valid, return false to backtrack
    }

    // Method to check if placing a digit in the given cell is safe
    public static boolean isSafe(int[][] sudoku, int row, int col, int digit) {
        // Check the row
        for (int i = 0; i < 9; i++) {
            if (sudoku[row][i] == digit) {
                return false;
            }
        }

        // Check the column
        for (int i = 0; i < 9; i++) {
            if (sudoku[i][col] == digit) {
                return false;
            }
        }

        // Check the 3x3 subgrid
        int startRow = (row / 3) * 3;
        int startCol = (col / 3) * 3;
        for (int i = startRow; i < startRow + 3; i++) {
            for (int j = startCol; j < startCol + 3; j++) {
                if (sudoku[i][j] == digit) {
                    return false;
                }
            }
        }

        return true; // Safe to place the digit
    }

    // Method to print the Sudoku grid
    public static void printSudoku(int[][] sudoku) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(sudoku[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Main method to execute the Sudoku solver
    public static void main(String[] args) {
        int[][] sudoku = {
            {5, 3, 0, 0, 7, 0, 0, 0, 0},
            {6, 0, 0, 1, 9, 5, 0, 0, 0},
            {0, 9, 8, 0, 0, 0, 0, 6, 0},
            {8, 0, 0, 0, 6, 0, 0, 0, 3},
            {4, 0, 0, 8, 0, 3, 0, 0, 1},
            {7, 0, 0, 0, 2, 0, 0, 0, 6},
            {0, 6, 0, 0, 0, 0, 2, 8, 0},
            {0, 0, 0, 4, 1, 9, 0, 0, 5},
            {0, 0, 0, 0, 8, 0, 0, 7, 9}
        };

        // Solve the Sudoku puzzle
        if (sudokuSolver(sudoku, 0, 0)) {
            System.out.println("Solution exists:");
            printSudoku(sudoku);
        } else {
            System.out.println("No solution exists");
        }
    }
}
