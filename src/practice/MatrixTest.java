package practice;

import static org.junit.Assert.*;

import org.junit.Assert;
import org.junit.Test;

public class MatrixTest {

	@Test
	public void testMatrixOperationsPositiveCases() {
		Matrix matrixA = new Matrix(2, 2);
		Matrix matrixB = new Matrix(2, 2);
		for (int i = 0; i < matrixA.getRow(); i++) {
			for (int j = 0; j < matrixB.getRow(); j++) {
				matrixA.getMatrix()[i][j] = i + 1;
			}
		}
		for (int i = 0; i < matrixA.getRow(); i++) {
			for (int j = 0; j < matrixB.getRow(); j++) {
				matrixB.getMatrix()[i][j] = i + 1;
			}
		}
		int[][] actualResult = { { 2, 2 }, { 4, 4 } };
		Assert.assertArrayEquals(matrixA.add(matrixB).getMatrix(), actualResult);
	}

	@Test(expected = RuntimeException.class)
	public void testMatrixOperationsNegativeCases() {
		Matrix matrixA = new Matrix(2, 3);
		Matrix matrixB = new Matrix(2, 2);
		matrixA.add(matrixB);
		new Matrix(-2, -10);
	}

}
