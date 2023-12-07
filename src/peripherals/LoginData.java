package peripherals;

public class LoginData {
	
	boolean checkPassword(String username, String passwd) { 
		if( username.equals("admin") && passwd.equals("admin123")) return true; 
		return false; 
		
	}
}
