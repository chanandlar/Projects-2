package com.example.FIrstWebApp.a6Todo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Service
public class TodoService {
    private static List<Todo> todos=new ArrayList<>();
    static{
        todos.add(new Todo(1,"Shoeb","AWS", LocalDate.now().plusYears(1),false));
        todos.add(new Todo(1,"Shoeb","Spring", LocalDate.now().plusYears(2),false));
        todos.add(new Todo(1,"Shoeb","Kafka", LocalDate.now().plusYears(3),false));
    }

    public List<Todo> getTodos(String username){
        return todos;
    }
}
