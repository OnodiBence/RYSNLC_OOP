package harmadik;

public class main {

	public static void main(String[] args) {
		int matrix[][] = { {1, 2, 3}, {4, 5, 6}, {69, 70, 71} };
		System.out.println("3x3 matrix:");
		printMatrix(matrix);
		
		int[][] jagged = { { 1, 2 }, { 1, 2, 3, 4 }, { 69, 420, 666, 0, 99 }, { 0 } };
        System.out.println("Jagged array:");
        printMatrix(jagged);
        
	}
	
	public static void printMatrix(int[][] matrix) {
		for (int row = 0; row < matrix.length; row++) {
			System.out.print("[");
			for (int column =0; column < matrix[row].length; column++) {
				System.out.print(matrix[row][column]);
				if (column < matrix[row].length - 1) {
                    System.out.print(", ");
				}
			}
			System.out.print("]");
		}
	}

}

