package todo_app.service.Impl;

import todo_app.dto.request.UserSignInRequestDto;
import todo_app.dto.request.UserSignUpRequestDto;
import todo_app.dto.response.UserResponseDto;
import todo_app.entity.User;
import todo_app.repository.UserRepository;
import todo_app.service.UserService;

public abstract class UserServiceImpl implements UserService {
    private final UserRepository userRepository = new UserRepository();

    @Override
    public void signUp(UserSignUpRequestDto request) {
        userRepository.save(new User(
            null, request.getName(), request.getUsername(), request.getPassword(), request.getPhonenumber(), request.getGender(), request.getAge()
        ));
    }
    
    @Override
    public UserResponseDto signIn(UserSignInRequestDto request) {
        chapter15.signUp.User user = userRepository.findById(request.getId());
        if (user != null && user.getPassword().equals(request.getPassword())) {
            return new UserResponseDto(user.getId().toString(), user.getName(), user.getUsername());
        }
        return null;
    }
}
