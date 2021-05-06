package exampleEcommerceBackend.dataAccess.concretes;

import exampleEcommerceBackend.dataAccess.abstracts.UserDao;
import exampleEcommerceBackend.entities.concretes.User;

public class HibernateUserDao implements UserDao{

	@Override
	public void add(User user) {
		// TODO Auto-generated method stub
		System.out.println(user.getFirstName() + " kaydedildi.");
		System.out.println(user.getFirstName() + " kiþisinin " + user.geteMail() + " mailine doðrulama e postasý gönderildi.");
		System.out.println("Doðrulama linkine týklandý ve üyelik tamamlandý.");
		
	}

}
