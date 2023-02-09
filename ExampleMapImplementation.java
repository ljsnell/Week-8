import java.util.HashMap;
import java.util.Map;

public class ExampleMapImplementation {	
    public static void main(String[] args) {    	
    	Map<Integer,String> mathstuff = new HashMap<>();
    	mathstuff.put(97653241, "Jim");
    	mathstuff.put(91118729, "Anna");
    	mathstuff.put(95263722, "Jill");
    	System.out.println("Original Map: " + mathstuff.toString());
    	mathstuff.remove(91118729);
    	System.out.println("Item Removed: " + mathstuff.toString());
    	System.out.println("ID # 95263722 is " + mathstuff.get(95263722));
    	
    }
}
