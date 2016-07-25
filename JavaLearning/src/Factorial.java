// A simple example of recursion.
/*Recursion is the process of defining something in terms of itself. As
it relates to Java programming, recursion is the attribute that allows a method to call itself.
A method that calls itself is said to be recursive.*/

public class Factorial {
	
	int fact(int i)
	{
		int result;
		if (i==1)return i;
		else 
			result=fact(i-1)*i;
			return result;
	}
	
	public static void main(String[] args) {
	    Factorial num=new Factorial();
	    
	   System.out.println("The Factorial of number 3 is :" +num.fact(3));
	   System.out.println("The Factorial of number 5 is :" +num.fact(5));
	   System.out.println("The Factorial of number 8 is :" +num.fact(8));
	}

}
