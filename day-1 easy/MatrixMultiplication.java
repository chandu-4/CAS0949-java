import java.util.Scanner;
public class MatrixMultiplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows1 = 2; 
        int cols1 = 2; 
        int rows2 = 2; 
        int cols2 = 2; 
        int[][] mat1 = new int[rows1][cols1];
        int[][] mat2 = new int[rows2][cols2];
        int[][] matResult = new int[rows1][cols2]; 
        System.out.println("Enter elements for Matrix 1 (2x2):");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols1; j++) {
                System.out.print("mat1[" + i + "][" + j + "] = ");
                mat1[i][j] = scanner.nextInt();
            }
        }
        System.out.println("Enter elements for Matrix 2 (2x2):");
        for (int i = 0; i < rows2; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print("mat2[" + i + "][" + j + "] = ");
                mat2[i][j] = scanner.nextInt();
            }
        }
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                matResult[i][j] = 0; 
                for (int k = 0; k < cols1; k++) {
                    matResult[i][j] += mat1[i][k] * mat2[k][j];
                }
            }
        }
        System.out.println("\nMatrix Multiplication Result:");
        for (int i = 0; i < rows1; i++) {
            for (int j = 0; j < cols2; j++) {
                System.out.print(matResult[i][j] + "\t");
            }
            System.out.println();
        }

        scanner.close();
    }
}
