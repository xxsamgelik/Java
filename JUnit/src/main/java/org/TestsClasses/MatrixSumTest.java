package org.TestsClasses;
import org.MainClasses.MatrixProcessor;
import org.TestsClasses.MatrixSumTest;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
public class MatrixSumTest {
    @Test
    public void testSumOfElementsAboveMainDiagonalForEmptyMatrix() {
        MatrixProcessor processor = new MatrixProcessor();
        int[][] matrix = new int[0][0];
        int expected = 0;
        int actual = processor.sumOfElementsAboveMainDiagonal(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void testSumOfElementsAboveMainDiagonal() {
        MatrixProcessor processor = new MatrixProcessor();
        int[][] matrix = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };
        int expected = 11;
        int actual = processor.sumOfElementsAboveMainDiagonal(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoByTwoMatrixAllAboveMin() {
        int[][] matrix = {{0, 1}, {0, 0}};
        MatrixProcessor processor = new MatrixProcessor();
        int expected = 1;
        int actual = processor.sumOfElementsAboveMainDiagonal(matrix);
        assertEquals(expected, actual);
    }

    @Test
    public void testTwoByTwoMatrixSomeAboveMin() {
        int[][] matrix = {{0, 2}, {1, 3}};
        MatrixProcessor processor = new MatrixProcessor();
        int expected = 2;
        int actual = processor.sumOfElementsAboveMainDiagonal(matrix);
        assertEquals(expected, actual);
    }
    @Test
    public void testThreeByThreeMatrixAllEqualMin() {
        int[][] matrix =
                {{1, 3, 3},
                {3, 1, 3},
                {3, 3, 3}};
        MatrixProcessor processor = new MatrixProcessor();
        int expected = 9;
        int actual = processor.sumOfElementsAboveMainDiagonal(matrix);
        assertEquals(expected, actual);
    }
    @Test
    public void testThreeByThreeMatrixSomeAboveMin() {
        int[][] matrix =
                {{1, 2, 1},
                {1, 5, 2},
                {2, 1, 3}};
        MatrixProcessor processor = new MatrixProcessor();
        int expected = 2;
        int actual = processor.sumOfElementsAboveMainDiagonal(matrix);
        assertEquals(expected, actual);
    }


}
