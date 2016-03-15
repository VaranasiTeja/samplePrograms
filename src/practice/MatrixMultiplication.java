package practice;

public class MatrixMultiplication {
	public int[][] multiplyMatrix(int[][] matrixA, int[][] matrixB) {
		if (matrixA[1].length == matrixB.length) {
			int[][] result = new int[matrixA.length][matrixB[1].length];
			for (int i = 0; i < matrixA.length; i++) {
				for (int j = 0; j < matrixB[1].length; j++) {
					for (int k = 0; k < matrixA[1].length; k++) {
						result[i][j] = result[i][j] + matrixA[i][k] * matrixB[k][j];
					}
				}
			}
			return result;
		} else {
			throw new RuntimeException("Provided matrices cant be multiplied");
		}
	}
}
