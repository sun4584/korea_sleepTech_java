package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class User {
	
	private Long id;
	private String password;
	private String name;
	private String username;
	private String phonenumber;
	private String gender;
	private int age;

}
