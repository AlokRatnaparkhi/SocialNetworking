package TimelineTests;

import static org.junit.Assert.assertEquals;

import java.util.List;
import org.junit.*;
import Publishing.Publisher;
import Views.IViewManager;
import Views.TimeLineView;

public class TimelineTest {
	
	/**@Author: Alok Ratnaparkhi
	 * @TestName: testTimeLineFunctionality
	 * @Description: To verify whether the user is able to view other's timeline
	 * @InputParam: None 
	 * @OutputParam: None
	 * @Date: 04/11/2021
	 */
		
	@Test
	public void testTimeLineFunctionality() {
		
		String[] expectedMessages=new String[] {"Good game though.","Darn! We lost!"};
		Publisher p=new Publisher();
		p.publish("Bob",expectedMessages[1]);
		p.publish("Bob",expectedMessages[0]);
		IViewManager viewer=new TimeLineView();
		List<String> actualMessage=viewer.view("Bob");
		
		for(int i=0;i<actualMessage.size();++i)
		{	assertEquals(actualMessage.get(i),expectedMessages[i]);
			
		}
					
	}
	
	
	
	
	
}
