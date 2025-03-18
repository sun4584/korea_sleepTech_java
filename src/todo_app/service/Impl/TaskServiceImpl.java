package todo_app.service.Impl;

import java.util.List;
import java.util.stream.Collectors;

import todo_app.dto.request.TaskRequestDto;
import todo_app.dto.response.TaskResponseDto;
import todo_app.entity.Task;
import todo_app.repository.TaskRepository;
import todo_app.service.TaskService;

public class TaskServiceImpl implements TaskService {
    private final TaskRepository taskRepository = new TaskRepository();
    private int taskCounter = 1;

    @Override
    public void addTask(String userId, TaskRequestDto request) {
        taskRepository.save(new Task(String.valueOf(taskCounter++), userId, request.getTitle()));
    }
    
    @Override
    public List<TaskResponseDto> getTasks(String userId) {
        return TaskRepository.findAll().stream()
                .filter(task -> task.getId().equals(userId))
                .map(task -> new TaskResponseDto(task.getId(), task.getTitle()))
                .collect(Collectors.toList());
    }
    
}