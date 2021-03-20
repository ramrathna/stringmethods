package string;

public class stringmethods {
	public static void main(String args[]) {
		String name="I am working in Vee Technology";
		System.out.println("Example for String Contains");
		System.out.println(name.contains("am working"));
		System.out.println(name.contains("in Vee"));
		System.out.println(name.contains("not"));
		System.out.println(name.contains("vee technology"));
		System.out.println(name.contains("Vee Technology"));
		System.out.println(name.contains("hello world"));
		
		System.out.println("Example for String compare");
		String s1="naveen";
		String s2=" ";
		String s3="kumar";
		String s4="Ravi";
		String s5=null;
		System.out.println(s1.compareTo(s2));
		System.out.println(s3.compareTo(s4));
		System.out.println(s3.compareTo(s5));
		System.out.println(s2.compareTo(s5));
		System.out.println("Example for String replace");
		String replace=name.replace("Vee", "Zee");
		System.out.println(replace);
		String replace1=name.replace('o', 'i');
		System.out.println(replace1);
		
	}

}
