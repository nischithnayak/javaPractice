public class RatMaze {
    
    // Method to print the solution matrix
    public static void printSolution(int sol[][]) {
        for (int i = 0; i < sol.length; i++) {
            for (int j = 0; j < sol.length; j++) {
                System.out.print(" " + sol[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Method to check if it's safe to move to (x, y)
    public static boolean isSafe(int maze[][], int x, int y) {
        // Check if (x, y) is within bounds and is a valid path (1)
        return (x >= 0 && x < maze.length && y >= 0 && y < maze.length && maze[x][y] == 1);
    }

    // Main method to solve the maze
    public static boolean solveMaze(int maze[][]) {
        int N = maze.length;
        int sol[][] = new int[N][N]; // Solution matrix initialization
        
        // Start solving the maze from (0, 0)
        if (solveMazeUtil(maze, 0, 0, sol) == false) {
            System.out.print("Solution doesn't exist");
            return false;
        }
        
        printSolution(sol); // Print the solution if found
        return true;
    }

    // Utility method to solve the maze using backtracking
    public static boolean solveMazeUtil(int maze[][], int x, int y, int sol[][]) {
        // Check if the destination (bottom-right corner) is reached
        if (x == maze.length - 1 && y == maze.length - 1 && maze[x][y] == 1) {
            sol[x][y] = 1; // Mark the solution path
            return true;
        }

        // Check if (x, y) is a valid move
        if (isSafe(maze, x, y) == true) {
            // Check if this cell is already part of the solution path
            if (sol[x][y] == 1) return false;

            // Mark this cell as part of the solution path
            sol[x][y] = 1;

            // Move forward in the x direction
            if (solveMazeUtil(maze, x + 1, y, sol)) return true;

            // Move down in the y direction
            if (solveMazeUtil(maze, x, y + 1, sol)) return true;

            // If neither movement works, backtrack
            sol[x][y] = 0;
            return false;
        }
        return false; // Return false if no valid moves are possible
    }

    // Main method to run the code
    public static void main(String args[]) {
        int maze[][] = { 
            {1, 0, 0, 0},
            {1, 1, 0, 1},
            {0, 1, 0, 0},
            {1, 1, 1, 1} 
        };
        solveMaze(maze); // Solve the maze
    }
}

