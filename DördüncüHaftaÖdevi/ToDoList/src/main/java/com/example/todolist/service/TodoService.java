package com.example.todolist.service;

import com.example.todolist.config.TodoConfiguration;
import com.example.todolist.model.TodoItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    List<TodoItem> todoList;

    public TodoService(List<TodoItem> todoList) {
        this.todoList = todoList;
    }

    public TodoService() {
    }

    public List<TodoItem> findAllToDoByStatus(boolean status) {
        todoList = TodoConfiguration.todoList;
        List<TodoItem> filteredToDo = new ArrayList<>();
        for (TodoItem todo :
                todoList) {
            if (todo.isComplete() == status) {
                filteredToDo.add(todo);
            }
        }
        return filteredToDo;
    }

    public List<TodoItem> findAllToDoByDay(String day) {
        todoList = TodoConfiguration.todoList;
        List<TodoItem> filteredToDo = new ArrayList<>();
        for (TodoItem todo :
                todoList) {
            if (todo.getDay() == day) {
                filteredToDo.add(todo);
            }
        }
        return filteredToDo;
    }
    public List<TodoItem> findAllToDoByWeekly() {
        todoList = TodoConfiguration.todoList;
        List<TodoItem> filteredToDo = new ArrayList<>();
        for (TodoItem todo :
                todoList) {
            if (todo.getDay() == "Pazartesi" || todo.getDay() == "Salı" || todo.getDay() == "Çarşamba" || todo.getDay() == "Perşembe" || todo.getDay() == "Cuma" || todo.getDay() == "Cumartesi" || todo.getDay() == "Pazar") {
                filteredToDo.add(todo);
            }
        }
        return filteredToDo;
    }
}
