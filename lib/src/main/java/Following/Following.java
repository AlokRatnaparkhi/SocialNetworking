package Following;

import java.util.List;
import java.util.Map;
import Database.DataUtil;

public class Following {
	DataUtil util=null;
	
	public Following()
	{
		util=DataUtil.getInstance();
	}
	
	/**@Author: Alok Ratnaparkhi
	 * @MethodName: follow
	 * @Description: Simple service to add target user to the given user's following list
	 * @InputParam: follower: Name of the user who is going to follow, following: Name of the user to be followed 
	 * @OutputParam: List: List of posts on the given user's wall
	 * @Date: 04/11/2021
	 */
	
	public void follow(String follower,String following)
	{
		Map <String,List<String>> data=util.getFollowing();
		List<String> followinglist=data.get(follower);
		if(!followinglist.contains(following)) {
		followinglist.add(following);
		data.put(follower, followinglist);
		util.setFollowing(data);
		}
		else
		{
			System.out.println("You are already following "+following+" !!");
		}
	}
}
