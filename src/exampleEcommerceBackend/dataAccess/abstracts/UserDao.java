package exampleEcommerceBackend.dataAccess.abstracts;

import exampleEcommerceBackend.entities.concretes.User;

public interface UserDao {
	void add(User user);
}