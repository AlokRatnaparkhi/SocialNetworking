/**
 * 
 */
package Publishing;
import java.util.Map;
import java.util.Stack;

import Database.DataUtil;

/**
 * @author Alok
 *
 */
public class Publisher {
	
	DataUtil util=null;
	
	public Publisher()
	{
		util=DataUtil.getInstance();
	}
	
	
	/**@Author: Alok Ratnaparkhi
	 * @MethodName: publish
	 * @Description: Simple service to publish message on timeline
	 * @InputParam: publisher: Name of user who is posting on timeline, message: Message to be posted on timeline
	 * @OutputParam: None
	 * @Date: 04/11/2021
	 */
		public void publish(String publisher,String message)
	{	
		Map<String,Stack<String>> mp=util.getUserMessage();
		Stack<String> messages=mp.get(publisher);
		messages.push(message);
		mp.put(publisher, messages);
		util.setUserMessage(mp);
		
		
	}
		
}
