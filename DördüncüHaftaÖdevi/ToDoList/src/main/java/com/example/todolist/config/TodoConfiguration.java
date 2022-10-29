package com.example.todolist.config;

import com.example.todolist.model.TodoItem;
import org.springframework.context.annotation.Configuration;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

@Configuration
public class TodoConfiguration {
    public static List<TodoItem> todoList = new CopyOnWriteArrayList<>();


}