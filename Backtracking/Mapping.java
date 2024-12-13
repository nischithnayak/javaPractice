public class Mapping {
    
    // Mapping of digits to corresponding letters on a phone keypad
    final static char[][] L = {
        {}, 
        {}, 
        {'a', 'b', 'c'}, 
        {'d', 'e', 'f'}, 
        {'g', 'h', 'i'}, 
        {'j', 'k', 'l'}, 
        {'m', 'n', 'o'}, 
        {'p', 'q', 'r', 's'}, 
        {'t', 'u', 'v'}, 
        {'w', 'x', 'y', 'z'}
    };

    // Method to generate letter combinations from the given digit string
    public static void letterCombinations(String D) {
        int len = D.length();
        if (len == 0) {
            System.out.println(""); // Print empty line if input is empty
            return;
        }
        bfs(0, len, new StringBuilder(), D); // Start the breadth-first search
    }

    // Helper method to perform BFS for generating combinations
    public static void bfs(int pos, int len, StringBuilder sb, String D) {
        // If the current position reaches the length of the input string, print the combination
        if (pos == len) {
            System.out.println(sb.toString());
        } else {
            // Get letters corresponding to the current digit
            char[] letters = L[Character.getNumericValue(D.charAt(pos))];
            // Iterate through each letter and call bfs for the next position
            for (int i = 0; i < letters.length; i++) {
                bfs(pos + 1, len, new StringBuilder(sb).append(letters[i]), D);
            }
        }
    }

    // Main method to run the code
    public static void main(String args[]) {
        letterCombinations("2"); // Generate letter combinations for digit '2'
    }
}
