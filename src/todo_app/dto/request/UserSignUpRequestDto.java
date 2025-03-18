package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;
import todo_app.entity.User;

@Data
@AllArgsConstructor
public class UserSignUpRequestDto {
	
//	private Long id;
	private String password;
	private String name;
	private String username;
	private String phonenumber;
	private String gender;
	private int age;
}
