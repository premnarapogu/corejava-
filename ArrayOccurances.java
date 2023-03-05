
public class ArrayOccurances {

	public static void main(String[] args) {
		
		        int[] array = {1, 2, 3, 4, 5, 1, 2, 3, 4, 5};
		        int[] counts = new int[array.length];

		        // Count the occurrences of each element in the array
		        for (int i = 0; i < array.length; i++) {
		            int count = 1;
		            for (int j = i+1; j < array.length; j++) {
		                if (array[i] == array[j]) {
		                    count++;
		                    // Mark the element as counted so it is not counted again
		                    counts[j] = -1;
		                }
		            }
		            if (counts[i] != -1) {
		                counts[i] = count;
		            }
		        }

		        
		        for (int i = 0; i < array.length; i++) {
		            if (counts[i] != -1) {
		                System.out.println(array[i] + " occurs " + counts[i] + " times.");
		            }
		        }
		    }
		

	}


