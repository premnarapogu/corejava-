import java.util.Scanner;

public class flowexercise6 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		System.out.println("Enter Product Id:");
		int productId = in.nextInt();
		System.out.println("Enter Product Name:");
		String productName = in.next();
		System.out.println("Enter Product Price:");
		float productPrice = in.nextFloat();
		System.out.println("Enter Product Desc:");
		String productDesc = in.next();
		System.out.println("Enter Product Quantity:");
		int productQuantity = in.nextInt();
		System.out.println("Enter category:");
		String category = in.next();
		System.out.println("Enter brand Name:");
		String brandName = in.next();
		System.out.println("Enter display:");
		boolean display = in.nextBoolean();
		System.out.println("Product Info :");
		System.out.println(
				productId + " " + productName + " " + productPrice + " " + productDesc + " " + productQuantity+" "+category+" "+brandName+" "+display);
		in.close();

	}

}
