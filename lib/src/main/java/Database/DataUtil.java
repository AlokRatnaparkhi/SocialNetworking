package Database;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Stack;

/*	Class Name:Users
 * 	Description:This is the dummy database for sake of simple implementation in given time constraints
	In real world, choice of Database Management System is encouraged to store 
	and manipulate the data
 * 	Author: Alok Ratnaparkhi
 * 	Date: 04/10/2021
 * 
 * */

public class DataUtil {
	
	private static Map<String,Stack<String>> userMessage;
	private static  Map<String,List<String>> following;
	private static DataUtil util=null;
	
	private DataUtil()
	{	userMessage=new HashMap();
		following=new HashMap();
		userMessage.put("Alice", new Stack<>());
		userMessage.put("Bob", new Stack<>());
		userMessage.put("Charlie", new Stack<>());
		
		following.put("Alice", new ArrayList<>());
		following.put("Bob", new ArrayList<>());
		following.put("Charlie", new ArrayList<>());
		
	}
	
	public static DataUtil getInstance()
	{	if(util==null)
		{	util=new DataUtil();
		}
		
		
	return util;
	}
	
	
	
	public  Map<String, Stack<String>> getUserMessage() {
		return userMessage;
	}


	public  void setUserMessage(Map<String, Stack<String>> userMessage) {
		DataUtil.userMessage = userMessage;
	}


	public  Map<String, List<String>> getFollowing() {
		return following;
	}


	public  void setFollowing(Map<String, List<String>> following) {
		DataUtil.following = following;
	}
	
	
	
	
	
	
	
	
	
}
