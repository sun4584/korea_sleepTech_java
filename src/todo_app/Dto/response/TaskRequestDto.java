package todo_app.Dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TaskRequestDto {
	private String name;
	private String gender;
}
