package Views;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;
import Database.DataUtil;

public class TimeLineView implements IViewManager {
	
	DataUtil util=null;

	public TimeLineView()
	{
		util=DataUtil.getInstance();
	}
	
		
	/**@Author: Alok Ratnaparkhi
	 * @MethodName: view
	 * @Description: Simple service to view the posts on given user's timeline
	 * @InputParam: user: Name of user whose timeline Posts are to be viewed
	 * @OutputParam: List: List of posts on the given user's timeline
	 * @Date: 04/11/2021
	 */
	
	public List<String> view(String self)
	{	
		Stack<String> messages=util.getUserMessage().get(self);
		List<String> result=new ArrayList<>();
		
		while(!messages.isEmpty())
		{	String msg=messages.pop();
			result.add(msg);
			System.out.println(msg);
		}
		
		return result;
	}
	
	
	
}
