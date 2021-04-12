package Views;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Stack;

import Database.DataUtil;

public class WallView implements IViewManager {
	
	DataUtil util=null;
	
	public WallView()
	{
		util=DataUtil.getInstance();
		
	}
	
	/**@Author: Alok Ratnaparkhi
	 * @MethodName: view
	 * @Description: Simple service to view the posts on given user's wall
	 * @InputParam: user: Name of user whose wall Posts are to be viewed
	 * @OutputParam: List: List of posts on the given user's wall
	 * @Date: 04/11/2021
	 */

	@Override
	public List<String> view(String user) {
		
		Stack<String> messages=util.getUserMessage().get(user);
		List<String> result=new ArrayList<>();
		
		while(!messages.isEmpty())
		{	String msg=messages.pop();
			result.add(msg);
			System.out.println(msg);
		}
		
		List<String> followingList=util.getFollowing().get(user);
		
		for(String followingUser: followingList)
		{	
			 messages=util.getUserMessage().get(followingUser);
			 while(!messages.isEmpty())
				{	String msg=messages.pop();
					result.add(msg);
					System.out.println(msg);
				}
			 	 
			
		}
		
		return result;
		
	}

}
