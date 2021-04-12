package WallTests;
import static org.junit.Assert.*;

import java.util.List;
import org.junit.Test;
import Following.Following;
import Publishing.Publisher;
import Views.IViewManager;
import Views.WallView;

public class WallTest {
	
	
	/**@Author: Alok Ratnaparkhi
	 * @TestName: testWallFunctionality
	 * @Description: To verify whether the user is able to view posts on the wall
	 * @InputParam: None 
	 * @OutputParam: None
	 * @Date: 04/11/2021
	 */
	@Test
	public void testWallFunctionality() {
		
		String[] expectedMessage=new String[]{
		"I'm in New York today! Anyone wants to have a coffee?",		
		"Good game though.",
		"Darn! We lost!",
		"I love the weather today."		
		};
		Following fol=new Following();
		fol.follow("Charlie","Bob");
		fol.follow("Charlie","Alice");
		Publisher publisher=new Publisher();
		publisher.publish("Alice",expectedMessage[3]);
		publisher.publish("Bob",expectedMessage[2]);
		publisher.publish("Bob",expectedMessage[1]);
		publisher.publish("Charlie",expectedMessage[0]);
		IViewManager viewer=new WallView();	
		List<String> actualMessages=viewer.view("Charlie");
		for(int i=0; i<actualMessages.size();++i)
		{
			assertEquals(actualMessages.get(i),expectedMessage[i]);
		}
		
	}

}
