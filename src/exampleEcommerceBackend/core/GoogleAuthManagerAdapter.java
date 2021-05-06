package exampleEcommerceBackend.core;

import exampleEcommerceBackend.googleAuth.GoogleAuthManager;

public class GoogleAuthManagerAdapter implements AuthService{

	@Override
	public void addUserAuth(String message) {
		GoogleAuthManager gAuthManager = new GoogleAuthManager();
		gAuthManager.addUser(message);
	}

}
