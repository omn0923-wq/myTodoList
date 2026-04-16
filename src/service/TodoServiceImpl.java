package service;

import repository.TodoRepository;
import vo.Todo;

import java.util.List;
import java.util.Map;

public class TodoServiceImpl implements TodoService {
    private final TodoRepository todoRepository;
    public TodoServiceImpl(TodoRepository todoRepository) {
        this.todoRepository = todoRepository;
    }

    @Override
    public void addTodo(String date, String time, String task) {
        // 빈 생성자로 Todo 만들기
//        Todo todo = new Todo();
//        todo.setTask(time);
//        todo.setTask(task);
//        todo.setCompleted(false);
//        todoRepository.add(date, todo);
        todoRepository.add(date, new Todo(time, task, false));
    }

    @Override
    public List<Todo> getTodosByDate(String date) {
        return List.of();
    }

    @Override
    public Map<String, List<Todo>> getAllTodos() {
        return Map.of();
    }

    @Override
    public void updateTodo(String date, int index, String time, String task) {

    }

    @Override
    public void deleteTodo(String date, int index) {

    }

    @Override
    public void completeTodo(String date, int index) {

    }
}