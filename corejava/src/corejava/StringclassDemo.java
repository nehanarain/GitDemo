package corejava;

public class StringclassDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a =" javatraining";
		System.out.println(a.charAt(3));
		System.out.println(a.indexOf("t"));
		System.out.println(a.substring(3, 5));
		
		System.out.println(a.substring(6));
		System.out.println(a.concat(" rahul teaches"));
		System.out.println(a.trim());
	String arr[]=a.split("t");
	System.out.println(a.toUpperCase());
	System.out.println(a.toLowerCase());
	System.out.println(arr[0]);
	System.out.println(arr[1]);
	}

}
