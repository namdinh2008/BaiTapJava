import java.util.Scanner;

public class MatrixAddition {
    public static void main(String[] args) {
        int[][] matrix1 = new int[2][2];

        int[][] matrix2 = new int[2][2];

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter elements for matrix1: ");

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix1[i][j] = scanner.nextInt();
            }
        }

        System.out.print("Enter elements for matrix2: ");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                matrix2[i][j] = scanner.nextInt();
            }
        }

        System.out.println("Matrix 1:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Matrix 2:");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(matrix2[i][j] + " ");
            }
            System.out.println();
        }

        scanner.close();
    }
}
