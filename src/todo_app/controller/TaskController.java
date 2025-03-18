package todo_app.controller;

import todo_app.dto.request.TaskRequestDto;
import todo_app.service.TaskService;
import todo_app.service.Impl.TaskServiceImpl;

public class TaskController {
    private final TaskService taskService = new TaskServiceImpl();

    public void addTask(String userId, String title) {
        taskService.addTask(userId, new TaskRequestDto(title));
        System.out.println("할 일 추가 완료");
    }
}

