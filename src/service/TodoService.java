package service;

import vo.Todo;

import java.util.List;
import java.util.Map;

public interface TodoService {
    void addTodo(String date, String time, String task);

    List<Todo> getTodosByDate(String date);

    Map<String, List<Todo>> getAllTodos();

    void updateTodo(String date, int index, String time, String task);

    void deleteTodo(String date, int index);

    void completeTodo(String date, int index);
}