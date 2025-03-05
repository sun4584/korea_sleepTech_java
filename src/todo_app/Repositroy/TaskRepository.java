package todo_app.Repositroy;

import java.util.ArrayList;
import java.util.List;

import todo_app.Entity.Task;

public class TaskRepository {

private final List<Task> tasks = new ArrayList<Task>();
	
	public void save(Task task) {
		tasks.add(task);
	}
	
	public boolean findById(Long id) {
		return tasks.add(null);
	}
		
	public List<Task> findAll() {
		return tasks;
	}
	
	public void deleteById() {
		
	}






}
