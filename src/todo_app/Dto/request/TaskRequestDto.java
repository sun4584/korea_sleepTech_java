package todo_app.Dto.request;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class TaskRequestDto {
	private String name;
	private int age;
	private String gender;
	private int residentRegistrationNumber;
}
