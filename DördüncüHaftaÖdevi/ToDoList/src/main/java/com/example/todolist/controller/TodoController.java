package com.example.todolist.controller;

import com.example.todolist.model.TodoItem;
import com.example.todolist.repo.TodoRepo;
import com.example.todolist.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;

@RestController
@RequestMapping(value = "/todo")
public class TodoController {

    private TodoService todoService;

    @Autowired
    private TodoRepo todoRepo;

    public TodoController(TodoService todoService, TodoRepo todoRepo) {
        this.todoService = todoService;
        this.todoRepo = todoRepo;
    }

    @GetMapping
    public List<TodoItem> findAll(){
        return todoRepo.findAll();
    }
    @PostMapping
    public TodoItem save(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
    @PutMapping
    public TodoItem update(@Valid @NotNull @RequestBody TodoItem todoItem){
        return todoRepo.save(todoItem);
    }
    @DeleteMapping(value = "/(id)")
    public  void  delete(@PathVariable Long id){
        todoRepo.deleteById(id);
    }
    @GetMapping("/sort-by-status")
    public List<TodoItem> getAllToDoByStatus(@RequestParam boolean status){
        return todoService.findAllToDoByStatus(status);
    }
    @GetMapping("/sort-by-day")
    public List<TodoItem> getAllToDoByDay(@RequestParam String day){
        return todoService.findAllToDoByDay(day);
    }
    @GetMapping("/sort-by-weekly")
    public List<TodoItem> getAllToDoByDay(){
        return todoService.findAllToDoByWeekly();
    }
}
