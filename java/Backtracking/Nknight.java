public class Nknight {
    
    static int N = 8; // Size of the chessboard

    // Method to check if (x, y) is a valid move for the Knight
    public static boolean isSafe(int x, int y, int sol[][]) {
        return (x >= 0 && x < N && y >= 0 && y < N && sol[x][y] == -1);
    }

    // Method to print the solution matrix
    public static void printSolution(int sol[][]) {
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                System.out.print(sol[x][y] + " ");
            }
            System.out.println();
        }
    }

    // Method to solve the Knight's Tour problem
    public static boolean solveKT() {
        int sol[][] = new int[N][N]; // Initialize solution matrix
        
        // Set all positions in the solution matrix to -1
        for (int x = 0; x < N; x++) {
            for (int y = 0; y < N; y++) {
                sol[x][y] = -1;
            }
        }

        // Possible moves for the Knight in x and y directions
        int xMove[] = {2, 1, -1, -2, -2, -1, 1, 2};
        int yMove[] = {1, 2, 2, 1, -1, -2, -2, -1};

        // The Knight starts from position (0, 0)
        sol[0][0] = 0;

        // Start solving the problem using a utility function
        if (!solveKTUtil(0, 0, 1, sol, xMove, yMove)) {
            System.out.println("Solution does not exist");
            return false;
        } else {
            printSolution(sol); // Print the solution if found
        }
        return true;
    }

    // Utility method to solve the Knight's Tour problem using backtracking
    public static boolean solveKTUtil(int x, int y, int movei, int sol[][], int xMove[], int yMove[]) {
        int k, next_x, next_y;

        // If all squares are visited, return true
        if (movei == N * N) return true;

        // Try all next moves from the current position
        for (k = 0; k < 8; k++) {
            next_x = x + xMove[k];
            next_y = y + yMove[k];

            // Check if the next move is safe
            if (isSafe(next_x, next_y, sol)) {
                sol[next_x][next_y] = movei; // Make the move

                // Recursively check if this move leads to a solution
                if (solveKTUtil(next_x, next_y, movei + 1, sol, xMove, yMove)) return true;

                // If the move doesn't lead to a solution, backtrack
                sol[next_x][next_y] = -1;
            }
        }
        return false; // If no moves work, return false
    }

    // Main method to execute the solution
    public static void main(String args[]) {
        solveKT(); // Solve the Knight's Tour problem
    }
}
