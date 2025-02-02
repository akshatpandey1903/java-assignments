package MatrixOperations;

import java.util.Scanner;

public class MatrixOperations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Rows (Matrix 1): ");
        int rowMatrixOne = scanner.nextInt();
        System.out.print("Columns (Matrix 1): ");
        int columnMatrixOne = scanner.nextInt();

        int[][] matrixOne = new int[rowMatrixOne][columnMatrixOne];
        readMatrix(scanner, matrixOne, "Matrix 1");

        System.out.print("Rows (Matrix 2): ");
        int rowMatrixTwo = scanner.nextInt();
        System.out.print("Columns (Matrix 2): ");
        int columnMatrixTwo = scanner.nextInt();

        int[][] matrixTwo = new int[rowMatrixTwo][columnMatrixTwo];
        readMatrix(scanner, matrixTwo, "Matrix 2");

        System.out.println("1: Addition  2: Subtraction  3: Multiplication  4: Transpose");
        System.out.print("Enter choice: ");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                if (isSameSize(matrixOne, matrixTwo)) {
                    printMatrix(addMatrices(matrixOne, matrixTwo), "Added Matrix");
                } else {
                    System.out.println("Matrix sizes do not match for addition.");
                }
                break;
            case 2:
                if (isSameSize(matrixOne, matrixTwo)) {
                    printMatrix(subtractMatrices(matrixOne, matrixTwo), "Subtracted Matrix");
                } else {
                    System.out.println("Matrix sizes do not match for subtraction.");
                }
                break;
            case 3:
                if (columnMatrixOne == rowMatrixTwo) {
                    printMatrix(multiplyMatrices(matrixOne, matrixTwo), "Multiplied Matrix");
                } else {
                    System.out.println("Matrix sizes do not match for multiplication.");
                }
                break;
            case 4:
                printMatrix(transposeMatrix(matrixOne), "Transpose of Matrix 1");
                printMatrix(transposeMatrix(matrixTwo), "Transpose of Matrix 2");
                break;
            default:
                System.out.println("Invalid choice.");
        }
        scanner.close();
    }

    private static void readMatrix(Scanner scanner, int[][] matrix, String name) {
        System.out.println("Enter elements for " + name);
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                matrix[i][j] = scanner.nextInt();
            }
        }
    }

    private static void printMatrix(int[][] matrix, String message) {
        System.out.println(message);
        for (int[] row : matrix) {
            for (int num : row) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
    }

    private static boolean isSameSize(int[][] matrixOne, int[][] matrixTwo) {
        return matrixOne.length == matrixTwo.length && matrixOne[0].length == matrixTwo[0].length;
    }

    private static int[][] addMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] + b[i][j];
            }
        }
        return result;
    }

    private static int[][] subtractMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][a[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[0].length; j++) {
                result[i][j] = a[i][j] - b[i][j];
            }
        }
        return result;
    }

    private static int[][] multiplyMatrices(int[][] a, int[][] b) {
        int[][] result = new int[a.length][b[0].length];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < b[0].length; j++) {
                for (int k = 0; k < a[0].length; k++) {
                    result[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return result;
    }

    private static int[][] transposeMatrix(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[0].length; j++) {
                result[j][i] = matrix[i][j];
            }
        }
        return result;
    }
}
