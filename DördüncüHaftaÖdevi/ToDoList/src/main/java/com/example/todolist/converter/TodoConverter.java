package com.example.todolist.converter;

import com.example.todolist.dto.TodoItemDto;
import com.example.todolist.model.TodoItem;
import org.springframework.stereotype.Component;

@Component
public class TodoConverter {
    public static TodoItem convertTodoItemDtoToTodoItem(TodoItemDto todoItemDto) {
        TodoItem todoItem=new TodoItem();
        todoItem.setDescription(todoItemDto.getDescription());
        todoItem.setDay(todoItemDto.getDay());
        todoItem.setTime(todoItemDto.getTime());
        todoItem.setComplete(false);
        return todoItem;

    }
}