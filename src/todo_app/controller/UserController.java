package todo_app.controller;

import todo_app.dto.request.UserSignInRequestDto;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.UserResponseDto;
import todo_app.service.UserService;
import todo_app.service.Impl.UserServiceImpl;

public class UserController {
    private final UserService userService = new UserServiceImpl();

    public void signUp(String name, String username, String password, String phonenumber, String gender, int age) {
        UserService.signUp(new UserSignUpRequestDto(name, username, password, phonenumber, gender, age));
        System.out.println("회원가입 성공");
    }
    
    public UserResponseDto signIn(String id, String password) {
        return userService.signIn(new UserSignInRequestDto(id, password));
    }
}
