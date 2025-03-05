package todo_app.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Task {
	private String visit; // 방문
	private String userId;
	private String dateOfVisit; // 방문 날짜
	private String Register; // 접수 
	private Long id;
}
