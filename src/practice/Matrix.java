package practice;

public class Matrix implements IMatrix {
	private int[][] matrix;
	private int row;
	private int col;

	public Matrix(int row, int column) {
		if (row < 0 || col < 0)
			throw new RuntimeException("rows/Columns cant be negative");
		else {
			this.row = row;
			this.col = column;
			this.matrix = new int[row][column];
		}
	}

	public Matrix add(Matrix matrixB) {
		if ((this.row != matrixB.row) || (this.col != matrixB.col))
			throw new RuntimeException("Matrix addition can't be performed on give matrices");

		Matrix result = new Matrix(this.row, this.col);
		for (int i = 0; i < row; i++) {
			for (int j = 0; j < matrixB.getRow(); j++) {
				result.matrix[i][j] = this.matrix[i][j] + matrixB.matrix[i][j];
			}
		}
		return result;
	}

	public int[][] getMatrix() {
		return matrix;
	}

	public int getRow() {
		return row;
	}

	public int getCol() {
		return col;
	}

}