package com.example.todolist.service;

import com.example.todolist.config.TodoConfiguration;
import com.example.todolist.converter.TodoConverter;
import com.example.todolist.dto.TodoItemDto;
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

    public TodoItem save(TodoItemDto todoItemDto){
        TodoItem todoItem= TodoConverter.convertTodoItemDtoToTodoItem(todoItemDto);
        return todoRepo.save(todoItem);
    }

    public TodoItem update(TodoItemDto todoItemDto){
        TodoItem todoItem= TodoConverter.convertTodoItemDtoToTodoItem(todoItemDto);
        return todoRepo.save(todoItem);
    }
    public  void  delete(Long id){
        todoRepo.deleteById(id);
    }

    public List<TodoItemDto> findAllToDoByStatus(boolean status) {
        todoList = TodoConfiguration.todoList;
        List<TodoItemDto> filteredToDoDto=new ArrayList<>();

        for (TodoItem todo :
                todoList) {
            if (todo.isComplete() == status) {
                TodoItemDto tododto=new TodoItemDto();
                tododto.setDescription(todo.getDescription());
                tododto.setDay(todo.getDay());
                tododto.setTime(todo.getTime());
                tododto.setComplete(todo.isComplete());
                filteredToDoDto.add(tododto);
            }
        }
        return filteredToDoDto;
    }

    public List<TodoItemDto> findAllToDoByDay(String day) {
        todoList = TodoConfiguration.todoList;
        List<TodoItemDto> filteredToDoDto = new ArrayList<>();
        for (TodoItem todo : todoList){
            if (todo.getDay() == day){
                TodoItemDto tododto=new TodoItemDto();
                tododto.setDescription(todo.getDescription());
                tododto.setDay(todo.getDay());
                tododto.setTime(todo.getTime());
                tododto.setComplete(todo.isComplete());
                filteredToDoDto.add(tododto);
            }
        }
        return filteredToDoDto;
    }

    public List<TodoItemDto> findAllToDoByWeekly() {
        todoList = TodoConfiguration.todoList;
        List<TodoItemDto> filteredToDoDto = new ArrayList<>();
        for (TodoItem todo : todoList){
            if (todo.getDay() == "Pazartesi" || todo.getDay() == "Salı" || todo.getDay() == "Çarşamba" || todo.getDay() == "Perşembe" || todo.getDay() == "Cuma" || todo.getDay() == "Cumartesi" || todo.getDay() == "Pazar"){
                TodoItemDto tododto=new TodoItemDto();
                tododto.setDescription(todo.getDescription());
                tododto.setDay(todo.getDay());
                tododto.setTime(todo.getTime());
                tododto.setComplete(todo.isComplete());
                filteredToDoDto.add(tododto);
            }
        }
        return filteredToDoDto;
    }

}
