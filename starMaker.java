import java.util.*;

class StarMaker {
    public static void main(String[] args) {
        // Takes user input
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an odd number greater than 0: ");
        int n = scanner.nextInt();
        System.out.println();

        // Error message if input is less than 1 or even
        if (n % 2 == 0 || n < 1) {
            System.out.println("Error, number must greater than 1 and Odd: ");
            System.exit(1);
        }

        // Creates 2d String array
        String[][] twoDimArray = new String[n][n];

        // For each loop that fills 2d Array with "."
        for (String[] row : twoDimArray) {
            Arrays.fill(row, ".");
        }

        // Counter to keep track of how many rows from the middle
        int rowFromMid = n / 2;

        // For loop to create the star pattern for all rows besides middle
        for (int i = 0; i < n; i++) {
            if (i == n / 2 + rowFromMid || i == n / 2 - rowFromMid && i != n / 2) {
                twoDimArray[i][n / 2] = "*";
                twoDimArray[i][n / 2 + rowFromMid] = "*";
                twoDimArray[i][n / 2 - rowFromMid] = "*";
                rowFromMid--;
            }
            // Nested For loop to fill middle row
            for (int j = 0; j < n; j++) {
                if (i == n / 2) {
                    twoDimArray[i][j] = "*";
                }

                //Prints array
                System.out.print(twoDimArray[i][j]);
                if (i != n) {
                    System.out.print(" ");
                }
            }
            System.out.println("");
        }
    }
}
