import java.util.Scanner;
// [00 01 02]
// [10 11 12]
// [20 21 22]
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix = new int[3][3];
        int[][] transpose = new int[3][3];

        // Input the 3x3 matrix
        System.out.println("Enter the elements of the 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix[i][j] = scanner.nextInt();
            }
        }

        // Calculate the transpose
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                transpose[j][i] = matrix[i][j];
            }
        }

        // Print the original matrix
        System.out.println("\nOriginal Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

        // Print the transpose of the matrix
        System.out.println("\nTranspose Matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(transpose[i][j] + " ");
            }
            System.out.println();
        }
        //Print Diagonal element
        System.out.println("\nDiagonal Matrix:");
        for(int i=0;i<3;i++){
            System.out.print(matrix[i][i] + " ");
        }

        scanner.close();
    }
}
