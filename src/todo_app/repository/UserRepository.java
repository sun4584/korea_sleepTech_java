package todo_app.repository;

import java.util.ArrayList;
import java.util.List;

import chapter15.signUp.User;

public class UserRepository {
	private final List<User> users = new ArrayList<>();

	public void save(User user) {
		users.add(user);
	}

	public User findById(String id) {
		return users.stream().filter(user -> user.getId().toString().equals(id)).findFirst().orElse(null);
	}

	public List<User> findAll() {
		return users;
	}

	public void deleteById(String id) {
		users.removeIf(user -> user.getId().toString().equals(id));
	}
}
