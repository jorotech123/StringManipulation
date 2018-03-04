
public class MNMatrixZeroIFElementZero {
	// 2 3 77
	// 5 8 99
	// 33 55 76
	public static void main(String[] args) {
		int[][] matrix = new int[3][3];
		matrix[0][0] = 2;
		matrix[0][1] = 3;
		matrix[0][2] = 77;
		matrix[1][0] = 99;
		matrix[1][1] = 8;
		matrix[1][2] = 99;
		matrix[2][0] = 33;
		matrix[2][1] = 0;
		matrix[2][2] = 76;
		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				int indexrow = 0;
				int indexcolumn = 0;
				if (matrix[i][j] == 0) {
					while (indexrow < matrix.length) {
						matrix[i][indexrow] = 5555;
						indexrow++;
					}

					if (matrix[i][j] == 5555) {
						while (indexcolumn < matrix.length) {
							matrix[indexcolumn][j] = 5555;
							indexcolumn++;
						}
					}
				}

			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				if (matrix[i][j] == 5555) {
					matrix[i][j] = 0;
				}
			}
		}

		for (int i = 0; i < matrix.length; i++) {
			for (int j = 0; j < matrix.length; j++) {
				System.out.print(matrix[i][j] + "    ");

			}
			System.out.println("\n");
		}

	}
}