package todo_app.entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
	
	private Long id;
	private Long userid;
	private String title;
//	private String

}
