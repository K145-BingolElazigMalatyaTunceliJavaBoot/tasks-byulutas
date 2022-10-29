package com.example.todolist.dto;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class TodoItemDto {
    @NotBlank
    private String description;
    private String day;
    private String time;
    private boolean complete;

    public TodoItemDto() {
    }

    public TodoItemDto(String description, String day, String time, boolean complete) {
        this.description = description;
        this.day = day;
        this.time = time;
        this.complete = complete;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public boolean isComplete() {
        return complete;
    }

    public void setComplete(boolean complete) {
        this.complete = complete;
    }
}