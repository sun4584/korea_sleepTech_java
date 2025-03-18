package todo_app.repository;

import java.util.ArrayList;
import java.util.List;

import todo_app.entity.Task;

public interface TaskRepository {
	public final List<Task>tasks = new ArrayList<>();
	
	public static void save(Task task) {
		tasks.add(task);
	}
	@SuppressWarnings("unlikely-arg-type")
	public static Task findById(String id) {
		return tasks.stream().filter(task -> 
					task.getId().equals(id))
				.findFirst().orElse(null);
	}
	public static List<Task>findAll(){
		return tasks;
	}
	public void update(Task task);
}
