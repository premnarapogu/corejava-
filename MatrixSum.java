
public class MatrixSum {

	public static void main(String[] args) {
		
		        int[][] matrix1 = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };
		        int[][] matrix2 = { {9, 8, 7}, {6, 5, 4}, {3, 2, 1} };
		        int[][] sumMatrix = new int[3][3];

		        // Calculate the sum of the two matrices
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                sumMatrix[i][j] = matrix1[i][j] + matrix2[i][j];
		            }
		        }

		        // Display the sum matrix
		        System.out.println("The sum of the matrices is:");
		        for (int i = 0; i < 3; i++) {
		            for (int j = 0; j < 3; j++) {
		                System.out.print(sumMatrix[i][j] + " ");
		            }
		            System.out.println();
		        }
		    }
		

	}

