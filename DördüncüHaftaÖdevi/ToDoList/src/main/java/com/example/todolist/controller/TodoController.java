package com.example.todolist.controller;

import com.example.todolist.dto.TodoItemDto;
import com.example.todolist.model.TodoItem;
import com.example.todolist.service.TodoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoService todoService;

    public TodoController(TodoService todoService) {
        this.todoService = todoService;
    }

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<TodoItem> findAll(){
        return todoService.findAll();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public TodoItem save(@Valid @NotNull @RequestBody TodoItemDto todoItemDto){
        return todoService.save(todoItemDto);
    }

    @PutMapping
    @ResponseStatus(HttpStatus.OK)
    public TodoItem update(@Valid @NotNull @RequestBody TodoItemDto todoItemDto){
        return todoService.save(todoItemDto);
    }

    @DeleteMapping(value = "/(id)")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public  void  delete(@PathVariable Long id) {
        todoService.delete(id);
    }

    @GetMapping("/sort-by-status")
    @ResponseStatus(HttpStatus.OK)
    public List<TodoItemDto> getAllToDoByStatus(@RequestParam boolean status){
        return todoService.findAllToDoByStatus(status);
    }

    @GetMapping("/sort-by-day")
    @ResponseStatus(HttpStatus.OK)
    public List<TodoItemDto> getAllToDoByDay(@RequestParam String day){
        return todoService.findAllToDoByDay(day);
    }

    @GetMapping("/sort-by-weekly")
    @ResponseStatus(HttpStatus.OK)
    public List<TodoItemDto> getAllToDoByWeekly(){
        return todoService.findAllToDoByWeekly();
    }
}