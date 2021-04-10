package string;

public class typeconversion {
public static void main(String[] args) {
		
		long m = 9562146;
		int i = (int) m;
	
		System.out.println(i);
		
		//int to double
		
		int j = 686;
		double d = j;
		System.out.println(d);
		
		//int to double using valueof
		
		int k =62;
		double d1 = Double.valueOf(k);
		System.out.println(d1);
	
		//int to double using obj
		
		int l =32;
		double d3 = new Double(l);
		System.out.println(d3);
	
	
		//double to int 
		
		double d4 = 45.6;
		int n = (int) d4;
	    System.out.println(n);
	
	  //double to int using obj
	    
	    Double d6=new Double(30.8);  
	    int p=d6.intValue();  
	    System.out.println(p);  
	
	//boolean to string using valueof
	    
	    Boolean b1 = true;
	    Boolean b2 = false;
	    String s1 = String.valueOf(b1);
	    String s2 = String.valueOf(b2);
	    System.out.println(s1);
	    System.out.println(s2);
	
	   
	
	
	
	
	
	
	
	
	
	}

}
