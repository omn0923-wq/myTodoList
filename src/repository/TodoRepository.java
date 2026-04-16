package repository;

import vo.Todo;

import java.util.List;
import java.util.Map;

public interface TodoRepository {
    void add(String date, Todo todo);

    List<Todo> findByDate(String date);

    Map<String, List<Todo>> findAll();

    void update(String date, int index, Todo todo);

    void delete(String date, int index);

    void complete(String date, int index);
}