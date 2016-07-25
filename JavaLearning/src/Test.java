// Objects may be passed to methods.
public class Test {
  int a,b;
  
  Test (int i, int j)
  {
	  a=i;
	  b=j;
  }

  //return true if o is equal to the invoking object
  boolean equals(Test o)
  {
	  if(o.a==a && o.b==b)
		  return true;
		  else return false;
  }

  public static void main(String args[])
  {
	  Test obj1=new Test(10,12);
	  Test obj2=new Test(10,12);
	  Test obj3=new Test(-1,-1);
	  
	  System.out.println("obj1==obj2" +(obj1.equals(obj2)));
	  System.out.println("obj2==obj3"+(obj2.equals(obj3)));
	  
	  
  }
  
}
