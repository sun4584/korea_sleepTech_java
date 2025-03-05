package todo_app.Dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserSignlnrequestDto {
	private Long id;
	private long password;
}
