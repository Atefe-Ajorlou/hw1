package isc1;

import java.util.Random;

public class MatrixPrinter {

    public static void printMatrix(int n) {
        Random random = new Random();
        int[][] matrix = new int[n][n];

        // پر کردن ماتریس با اعداد تصادفی 0 و 1
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = random.nextInt(2); // تولید عدد تصادفی 0 یا 1
            }
        }

        // چاپ ماتریس
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println(); // رفتن به خط بعدی پس از هر ردیف
        }
    }

    public static void main(String[] args) {
        int n = 5; // می‌توانید مقدار n را تغییر دهید
        printMatrix(n);
    }
}
