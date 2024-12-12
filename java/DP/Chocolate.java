public class Chocolate {
    static int calculateMaxChocolates(int currentRow, int robot1Col, 
                                      int robot2Col, int totalRows, int totalCols,
                                      int[][] chocolateGrid, int[][][] dp) {
        // If either robot is out of the grid, return a large negative number
        if (robot1Col < 0 || robot1Col >= totalCols || robot2Col < 0 || robot2Col >= totalCols) {
            return -10000000;
        }

        // If robots have reached the bottom row
        if (currentRow == totalRows - 1) {
            // If both robots are in the same cell, return chocolates in that cell
            if (robot1Col == robot2Col) {
                return chocolateGrid[currentRow][robot1Col];
            }
            // Else, return sum of chocolates in both cells
            else {
                return chocolateGrid[currentRow][robot1Col] + chocolateGrid[currentRow][robot2Col];
            }
        }

        // If this state has been computed before, return the stored result
        if (dp[currentRow][robot1Col][robot2Col] != -1) {
            return dp[currentRow][robot1Col][robot2Col];
        }

        // Initialize the maximum chocolates that can be collected from this state
        int maxChocolates = -10000000;

        // Explore all possible moves for both robots
        for (int dRobot1 = -1; dRobot1 <= 1; dRobot1++) {
            for (int dRobot2 = -1; dRobot2 <= 1; dRobot2++) {
                int chocolates = 0;
                // If both robots are in the same cell, only one robot collects the chocolates
                if (robot1Col == robot2Col) {
                    chocolates = chocolateGrid[currentRow][robot1Col];
                }
                // Else, both robots collect chocolates
                else {
                    chocolates = chocolateGrid[currentRow][robot1Col] + 
                      chocolateGrid[currentRow][robot2Col];
                }

                // Add the chocolates collected in the next state
                chocolates += calculateMaxChocolates(
                        currentRow + 1, robot1Col + dRobot1, robot2Col + dRobot2,
                        totalRows, totalCols, chocolateGrid, dp
                );

                // Update the maximum chocolates that can be collected
                maxChocolates = Math.max(maxChocolates, chocolates);
            }
        }

        // Store the result and return
        dp[currentRow][robot1Col][robot2Col] = maxChocolates;
        return maxChocolates;
    }

    public static void main(String[] args) {
        int totalRows = 4;
        int totalCols = 3;
        int[][] chocolateGrid = {
                {4, 1, 2}, {3, 6, 1}, {1, 6, 6}, {3, 1, 2}
        };

        // Initialize the dp table with -1
        int[][][] dp = new int[totalRows][totalCols][totalCols];
        for (int i = 0; i < totalRows; i++) {
            for (int j = 0; j < totalCols; j++) {
                for (int k = 0; k < totalCols; k++) {
                    dp[i][j][k] = -1;
                }
            }
        }

        int result = calculateMaxChocolates(0, 0, totalCols - 1, totalRows,
                                            totalCols, chocolateGrid, dp);
      
        System.out.println("The maximum number of chocolates that can be collected is: " + result);
    }
}