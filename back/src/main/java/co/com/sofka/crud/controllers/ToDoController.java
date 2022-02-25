package co.com.sofka.crud.controllers;

import co.com.sofka.crud.entities.ToDo;
import co.com.sofka.crud.services.ToDoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin(origins = "http://localhost:3000")
public class ToDoController {

    @Autowired
    private ToDoService service;

    @GetMapping(value = "api/todos")
    public Iterable<ToDo> list(){
        return service.list();
    }

    @PostMapping(value = "api/todo")
    public ToDo save(@RequestBody ToDo todo){
        return service.save(todo);
    }

    @PutMapping(value = "api/todo")
    public ToDo update(@RequestBody ToDo todo){
        if(todo.getId() != null){
            return service.save(todo);
        }
        return todo;
    }

    @GetMapping(value = "api/{id}/todo")
    public ToDo get(@PathVariable("id") Long id){
        return service.get(id);
    }
}