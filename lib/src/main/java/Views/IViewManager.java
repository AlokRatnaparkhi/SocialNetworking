package Views;

import java.util.List;


public interface IViewManager {
	
	
	/**@Author: Alok Ratnaparkhi
	 * @MethodName: view
	 * @Description: Simple service to view the posts 
	 * @InputParam: user: Name of user whose Posts are to be viewed
	 * @OutputParam: List: List of posts
	 * @Date: 04/11/2021
	 */
	
	
	public abstract List<String> view(String user);
	
}
