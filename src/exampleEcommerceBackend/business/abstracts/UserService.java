package exampleEcommerceBackend.business.abstracts;

import java.util.List;

import exampleEcommerceBackend.entities.concretes.User;

public interface UserService {
	boolean add(User user , List<User> userList);
}
