import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("Enter product ID :" );
		int productId  = scan.nextInt();
		System.out.println("Enter product Name :" );
		String productName  = scan.next();
		System.out.println("Enter product Price:" );
		float productPrice  = scan.nextFloat();
		    
		
		System.out.println("Enter product Description :" );
		String productDescription  = scan.next();
		System.out.println("Enter product Availability :" );
		boolean productAvailability = scan.nextBoolean();
		    
		System.out.println(" product info :");
		
		scan.close();
		System.out.println(productId+""+ productName +""+ productPrice +""+ productDescription +""+ productAvailability  ) ;   
		
	}

}
