package controller;

public class CheckLogin {

	public boolean checkDetails(String name, String password) {
		if (name.equals("raja") && password.equals(password)) {
			return true;
		}
		return false;
	}

	

}
