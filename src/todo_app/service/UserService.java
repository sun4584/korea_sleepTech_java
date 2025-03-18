package todo_app.service;

import chapter15.signUp.UserSignUpRequestDto;
import todo_app.dto.request.UserSignInRequestDto;
import todo_app.dto.response.UserResponseDto;

public interface UserService {
    void signUp(UserSignUpRequestDto request);
    UserResponseDto signIn(UserSignInRequestDto request);
	static void signUp(todo_app.dto.request.UserSignUpRequestDto request) {
		// TODO Auto-generated method stub
		
	}
}
