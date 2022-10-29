package com.example.todolist.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class TodoItem {
    private  Long id;
    @NotBlank
    private String description;
    private String day;
    private String time;
    private boolean complete;

    public TodoItem() {
    }

    public TodoItem(Long id, String description, String day, String time, boolean complete) {
        this.id = id;
        this.description = description;
        this.day = day;
        this.time = time;
        this.complete = complete;
    }

    @Id
    @GeneratedValue
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
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
