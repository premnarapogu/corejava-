
public class StringAssign1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1 = new String("hello");
		String str2 = new String("hello");

		// Using == operator to compare the references of str1 and str2
		if (str1 == str2) {
		    System.out.println("str1 and str2 are the same object");
		} else {
		    System.out.println("str1 and str2 are different objects");
		}

		// Using equals() method to compare the contents of str1 and str2
		if (str1.equals(str2)) {
		    System.out.println("str1 and str2 have the same contents");
		} else {
		    System.out.println("str1 and str2 have different contents");
		}

		
		
	}

}
