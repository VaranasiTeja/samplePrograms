package practice;

import org.junit.Assert;
import org.junit.Test;

public class MatrixMultiplicationTest {

//	@Test
//	public void testMatrixMultiplicationPositiveCases() {
//		Matrix matA = new Matrix(2, 2);
//		Matrix matB = new Matrix(2, 2);
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				matA.matrix[i][j] = i + 1;
//			}
//		}
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				matB.matrix[i][j] = i + 1;
//			}
//		}
//		Matrix result = matA.add(matB);
//		for (int i = 0; i < 2; i++) {
//			for (int j = 0; j < 2; j++) {
//				System.out.print("  " + result.matrix[i][j]);
//			}
//			System.out.println();
//		}
//
//	}

	@Test(expected = RuntimeException.class)
	public void testMatrixMultiplicationNegativeCases() {
		MatrixMultiplication matMul = new MatrixMultiplication();
		int matrixA[][] = { { 2, 3 }, { 1, 4 }, { 2, 3 } };
		int matrixB[][] = { { 2, 3 }, { 1, 4 }, { 6, 7 } };
		matMul.multiplyMatrix(matrixA, matrixB);
	}

}
