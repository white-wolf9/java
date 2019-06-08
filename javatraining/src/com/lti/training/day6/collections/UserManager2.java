package com.lti.training.day6.collections;

import java.util.HashMap;
import java.util.Map;

public class UserManager2 {
	
		private Map<String,String> users;

		public UserManager2() {
																					  // Array can also be input here
			users=new HashMap<String,String>();     //users=new HashMap<String,String[]>();
			users.put("majrul","123");							 //users.put("majrul",{"123"});
			users.put("dinesh","456");
			users.put("gaurav","789");
		}
		
		public boolean isValid(String username,String password) {
			
			if(users.containsKey(username)) {
				String pwd=users.get(username);			//getting the password of the fllowing username and comparing that with the parameter password passed 
				
				if(pwd.equals(password))
					return true;
			}
			return false;
		}
			
			
			/*ALTERNATIVE APPROACH
			 *  for(User user : users)
			 * 		if(user.getUsername().equals(username))
			 * 			if(user.getPassword().equals(password))
			 * 				if(user.isActive())
			 * 					return true;
			 * 		return false;
			 */
		
		
		
		public static void main(String[] args) {
			
			UserManager2 mgr=new UserManager2();
			boolean isValid = mgr.isValid("gaurav", "789");
			System.out.println(isValid);
		}
}
