package todo_app.service;

import java.util.List;

import todo_app.dto.request.TaskRequestDto;
import todo_app.dto.response.TaskResponseDto;

public interface TaskService {
    void addTask(String userId, TaskRequestDto request);
    List<TaskResponseDto> getTasks(String userId);
    void updateTask(String taskId, TaskRequestDto request);
    void deleteTask(String taskId);
}
