package corejava;

public class stringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String a="hello";//literal string 
		String b="hello";
		a.concat("world");
		
		String ab= new String("hello");
		String sb= new String("hello");
		System.out.println(a==b);
		System.out.println(a.equals(b));
		System.out.println(a==ab);//false
		System.out.println(a.equals(ab));

       StringBuffer ac =new StringBuffer("hello");
		ac.append("world");
		System.out.println(ac);
		ac.insert(2, "she");
		System.out.println(ac);
		ac.replace(5, 7, "aa");
		System.out.println(ac);
		
		ac.reverse();
		System.out.println(ac);
		
		
		
		
		
		
		
		
		
	}
}
