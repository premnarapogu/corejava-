
public class ArraySumAndAverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		

		   
		        int[] arr = {2, 4, 6, 8, 10};
		        int sum = 0;

		        // Calculate the sum of the elements in the array
		        for (int i = 0; i < arr.length; i++) {
		            sum += arr[i];
		        }

		        // Calculate the average of the elements in the array
		        double average = (double) sum / arr.length;

		        // Display the sum and average
		        System.out.println("The sum of the elements in the array is: " + sum);
		        System.out.println("The average of the elements in the array is: " + average);
		    }
		

	}


