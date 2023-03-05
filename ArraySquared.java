
public class ArraySquared {

	public static void main(String[] args) {
		{
		        int[][] array = { {1, 2, 3}, {4, 5, 6}, {7, 8, 9} };

		        // Calculate and display the square of each element in the array
		        for (int i = 0; i < array.length; i++) {
		            for (int j = 0; j < array[i].length; j++) {
		                int square = array[i][j] * array[i][j];
		                System.out.print(square + " ");
		            }
		            System.out.println();
		        }
		    }
		}


	}


