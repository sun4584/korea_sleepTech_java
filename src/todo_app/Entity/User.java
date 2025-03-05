package todo_app.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	private int age;
	private String name;
	private Long id;
	private Long password;
	private String gender;
}
