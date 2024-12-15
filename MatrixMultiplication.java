import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int[][] matrix1 = new int[3][3];
        int[][] matrix2 = new int[3][3];
        int[][] product = new int[3][3];

        // Input the first 3x3 matrix
        System.out.println("Enter the elements of the first 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Input the second 3x3 matrix
        System.out.println("\nEnter the elements of the second 3x3 matrix:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Element [" + i + "][" + j + "]: ");
                matrix2[i][j] = scanner.nextInt();
            }
        }

        // Multiply the two matrices
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                product[i][j] = 0; // Initialize the product cell
                for (int k = 0; k < 3; k++) {
                    product[i][j] += matrix1[i][k] * matrix2[k][j];
                }
            }
        }

        // Print the first matrix
        System.out.println("\nFirst Matrix:");
        printMatrix(matrix1);

        // Print the second matrix
        System.out.println("\nSecond Matrix:");
        printMatrix(matrix2);

        // Print the product matrix
        System.out.println("\nProduct of the Matrices:");
        printMatrix(product);

        scanner.close();
    }

    // Utility function to print a 3x3 matrix
    public static void printMatrix(int[][] matrix) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
