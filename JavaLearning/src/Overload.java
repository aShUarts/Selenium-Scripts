// Demonstrate method overloading.

public class Overload {

 void test()
 {
	 System.out.println("With No Argument");
		 
 }

 void test(int a)
 {
	 System.out.println("With Single Argument" + a);
 }

 void test(int a, int b)
 {
	 System.out.println("With two Argument" +a +b);
 }
 
 double test (double a)
 {
	System.out.println("The Square of "+a +" is");
	return a*a;
	
 }




	public static void main(String args[])
	{
		Overload var1=new Overload();
		var1.test();
		var1.test(2);
		var1.test(1, 3);
		System.out.println(+ var1.test(5.5));
		
	}
}
