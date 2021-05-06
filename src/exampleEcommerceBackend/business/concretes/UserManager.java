package exampleEcommerceBackend.business.concretes;

import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import exampleEcommerceBackend.business.abstracts.UserService;
import exampleEcommerceBackend.core.AuthService;
import exampleEcommerceBackend.dataAccess.abstracts.UserDao;
import exampleEcommerceBackend.entities.concretes.User;

public class UserManager implements UserService{
	
	private UserDao userDao;
	private AuthService authService;

	public UserManager(UserDao userDao, AuthService authService) {
		this.userDao = userDao;
		this.authService = authService;
	}

	@Override
	public boolean add(User user , List<User> userList) {
		String regex = "(.+)@(.+)$";
		
		Pattern pattern = Pattern.compile(regex);
		
		Matcher matcher = pattern.matcher(user.geteMail());
		
		if(user.getPassword().length() >= 6 && matcher.matches() && user.getFirstName().length() >= 2 && user.getLastName().length() >= 2) {
			for (User userFor : userList) {
				if(user.geteMail() == userFor.geteMail()) {
					System.out.println("Bu email zaten kullanýlýyor");
					return false;
				}
			}
			userDao.add(user);
			authService.addUserAuth(user.getFirstName());
			return true;
		}
		else {
			System.out.println("Girdiðiniz bilgileri kontrol ediniz. Tekrar deneyiniz");
			return false;
		}
	}

}
