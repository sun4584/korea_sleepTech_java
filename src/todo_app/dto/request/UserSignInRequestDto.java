package todo_app.dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor

public class UserSignInRequestDto {
	
	private String id;
	private String password;

}
