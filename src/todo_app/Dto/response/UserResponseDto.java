package todo_app.Dto.response;

import lombok.AllArgsConstructor;
import lombok.Data;

@AllArgsConstructor
@Data
public class UserResponseDto {
	private String visit; 
	private String caseFilingTime; 
	private String dateOfVisit; 
	private String Register;
}