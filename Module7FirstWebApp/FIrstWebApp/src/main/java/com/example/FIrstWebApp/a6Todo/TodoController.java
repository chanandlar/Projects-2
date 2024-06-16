package com.example.FIrstWebApp.a6Todo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
public class TodoController {
    TodoController(TodoService todoService){
        this.todoService=todoService;
    }

    private TodoService todoService;

    @RequestMapping("list-todos")
    public String listAllTodos(ModelMap model){
        List<Todo> todos=todoService.getTodos("Shoeb");
        model.addAttribute("todos",todos);
        return "Todos";
    }
}
