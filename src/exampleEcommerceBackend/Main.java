package exampleEcommerceBackend;

import java.util.ArrayList;

import exampleEcommerceBackend.business.abstracts.UserService;
import exampleEcommerceBackend.business.concretes.UserManager;
import exampleEcommerceBackend.core.GoogleAuthManagerAdapter;
import exampleEcommerceBackend.dataAccess.concretes.HibernateUserDao;
import exampleEcommerceBackend.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<User> listUser = new ArrayList<User>();
		
		User yigit = new User(0, "Yiðit", "Yeler", "yigit@gmail.com", "123456");
		User ozan = new User(1, "Ozan", "Durgut", "ozanAAA", "123456");
		User dame = new User(2, "Ozan", "D", "yeigitba@gmail.com", "1");
		User yigit2 = new User(3, "Yiðit", "Yeler", "yigit@gmail.com", "123456");
		
		UserService userService = new UserManager(new HibernateUserDao(), new GoogleAuthManagerAdapter());
		
		if(userService.add(yigit, listUser)) {
			listUser.add(yigit);
		}
		if(userService.add(ozan, listUser)) {
			listUser.add(ozan);
		}
		if(userService.add(dame, listUser)) {
			listUser.add(dame);
		}
		if(userService.add(yigit2, listUser)) {
			listUser.add(yigit2);
		}
	}

}
