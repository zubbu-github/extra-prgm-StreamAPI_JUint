import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.function.Consumer;

import org.junit.jupiter.api.Test;

public class StreamAPI_JUnit {
	@Test
	void i() {
	List<Integer> values = Arrays.asList(1,2,3,4,5,6); {
		
		//Lamda Expression
		 values.forEach(i-> System.out.println(i));
		
		//Anonymous Method
	/*	for(int i : values) {
			values.forEach(new Consumer<Integer>(){
		public void accept(Integer i) {
			System.out.println(i);
			
		}
	});
	
	//Iterator Method
		/*Iterator<Integer> ivalues = values.iterator();
	     while(ivalues.hasNext()) {
	    	 System.out.println(ivalues.next());
	     }
		*/	
   
   }
  }
}
