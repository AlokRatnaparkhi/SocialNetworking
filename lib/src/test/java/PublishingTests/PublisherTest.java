package PublishingTests;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

import org.junit.Test;

import Publishing.Publisher;
import Views.IViewManager;
import Views.TimeLineView;

public class PublisherTest {
	
	
	/**@Author: Alok Ratnaparkhi
	 * @TestName: testPublishingFunctionality
	 * @Description: To verify whether the user is able to publish the posts on the timeline
	 * @InputParam: None 
	 * @OutputParam: None
	 * @Date: 04/11/2021
	 */
		
	@Test
	public void testPublishingFunctionality() {
		
		String expectedMessage="I love the weather today";
		Publisher p=new Publisher();
		p.publish("Alice", expectedMessage);
		IViewManager viewer=new TimeLineView();
		List<String> actualMessage=viewer.view("Alice");
		assertTrue(actualMessage.get(actualMessage.size()-1).equals(expectedMessage));
		
					
	}

}
