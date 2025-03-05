package todo_app.Repositroy;

import java.util.ArrayList;
import java.util.List;

import user_reservation.entity.User;

public class UserRepository {
private final List<User> users = new ArrayList<User>();
	
	public void save(User user) {
		users.add(user);
	}
	
	public boolean findById(Long id) {
		return users.add(null);
	}
		
	public List<User> findAll() {
		return users;
	}
	
	public void deleteById() {
		
	}
	
}	
