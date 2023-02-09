import java.util.LinkedList;
import java.util.Queue;

public class ExampleQueueImplementation {
    public static void main(String[] args) {
    	Queue<String> line = new LinkedList<>();
    	char let = 'A';
    	int time = 0;
    	int rn;
    	String person = "" + let + let + let;
    	line.add(person);
    	
    	while (time < 40)
    	{	
    		rn = (int)(Math.random() * 6);
    		if ((rn == 1) || (rn == 2)) {let++; person = "" + let + let + let; line.add(person);}
    		if ((rn == 3) || (rn == 4) || (rn == 5)) {line.poll();}
    		System.out.println("Time " + time + " : "  + line);
    		time ++;
    	}

    }
}
