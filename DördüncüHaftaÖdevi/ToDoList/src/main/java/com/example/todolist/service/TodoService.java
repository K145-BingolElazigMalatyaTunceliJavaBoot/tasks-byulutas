package com.example.todolist.service;

import com.example.todolist.config.TodoConfiguration;
import com.example.todolist.model.TodoItem;
import com.example.todolist.repo.TodoRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    @Autowired
    private TodoRepo todoRepo;
    List<TodoItem> todoList;

    public TodoService(TodoRepo todoRepo, List<TodoItem> todoList) {
        this.todoRepo = todoRepo;
        this.todoList = todoList;
    }

    public TodoService() {

    }

    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }

    public TodoItem save(TodoItem todoItem){
        return todoRepo.save(todoItem);
    }

    public TodoItem update(TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
    public  void  delete(Long id){
        todoRepo.deleteById(id);
    }

    public List<TodoItem> findAllToDoByStatus(boolean status){
        todoList = TodoConfiguration.todoList;
        List<TodoItem> filteredToDo = new ArrayList<>();
        for (TodoItem todo : todoList){
            if (todo.isComplete() == status){
                filteredToDo.add(todo);
            }
        }
        return filteredToDo;
    }

    public List<TodoItem> findAllToDoByDay(String day){
        todoList = TodoConfiguration.todoList;
        List<TodoItem> filteredToDo = new ArrayList<>();
        for (TodoItem todo : todoList){
            if (todo.getDay() == day){
                filteredToDo.add(todo);
            }
        }
        return filteredToDo;
    }

    public List<TodoItem> findAllToDoByWeekly(){
        todoList = TodoConfiguration.todoList;
        List<TodoItem> filteredToDo = new ArrayList<>();
        for (TodoItem todo : todoList){
            if (todo.getDay() == "Pazartesi" || todo.getDay() == "Salı" || todo.getDay() == "Çarşamba" || todo.getDay() == "Perşembe" || todo.getDay() == "Cuma" || todo.getDay() == "Cumartesi" || todo.getDay() == "Pazar"){
                filteredToDo.add(todo);
            }
        }
        return filteredToDo;
    }

}
