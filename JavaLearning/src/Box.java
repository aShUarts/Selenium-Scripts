/* Here, Box defines three constructors to initialize
the dimensions of a box various ways.
*/
public class Box {
    double width;
    double height;
    double length;
    
   Box(double w, double h, double l)
   {
	 width=w;
	 height=h;
	 length=l;
	   
   }

   Box()
   {
	   width=-1;
	   height=-1;
	   length=-1;
   }
   
   Box(double len)
   {
	   width=length=height=len;
   
   }

   double volume()
   {
	   return width*length*height;
   }
   public static void main(String args[])
   {
	   Box mybox=new Box(10,11,12);
	   Box mybox1=new Box();
	   Box mybox2=new Box(2);
	   
	   System.out.println("The Volume of Box is " + mybox.volume());
	   System.out.println("The Volume of Box is " + mybox1.volume());
	   System.out.println("The Volume of Box is " + mybox2.volume());
	   
   }
}
