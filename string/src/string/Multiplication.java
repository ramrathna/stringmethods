package string;
class A
{
	public int multi(int i,int j,int k)
	{
		return i*j*k;
	}
}

 class B extends A
{
	public int multi(int a,int b,int c)
	{
		return a*b*c;
	}

}

public class Multiplication {
public static void main(String[] args) {
		
		B b = new B ();
		int d=b.multi(4,6,2);
		System.out.println(d);
		A a = new A ();
		int e =a.multi(9, 6, 4);
		System.out.println(e);
		
	}


}
