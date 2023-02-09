import java.util.ArrayList;
import java.util.List;

	public class ExampleListImplementation {
	    public static void main(String[] args) {
	    	System.out.println ("This is a List...");
	    	    	List<Object> mathstuff = new ArrayList<>();
	    	    	List<Object> part = new ArrayList<>();
	    	    	mathstuff.add(8);
	    	    	mathstuff.add(15);
	    	    	mathstuff.add("*");
	    	    	System.out.println("Original List : " + mathstuff);
	    	    	mathstuff.remove(1);
	    	    	System.out.println("Item Removed  : " + mathstuff);
	    	    	mathstuff.add(1,"LL");
	    	    	System.out.println("Item Added    : " + mathstuff);
	    	    	part.add("blue");
	    	    	part.add(9);
	    	    	mathstuff.add(part);
	    	    	System.out.println("List Added    : " + mathstuff);
	    	    	System.out.println("At index 2 we have " + mathstuff.get(2));
	    	    	System.out.println ("Program Ending...");
	  }// end mainline
}//end class
