package org.MainClasses;

public class MatrixProcessor {
    public int sumOfElementsAboveMainDiagonal(int[][] matrix) {
        if (matrix.length == 0) {
            return 0;
        }

        int sum = 0;
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix[i].length; j++) {
                if (matrix[i][j] > matrix[i][i]) {
                    sum += matrix[i][j];
                }
            }
        }
        return sum;
    }


}