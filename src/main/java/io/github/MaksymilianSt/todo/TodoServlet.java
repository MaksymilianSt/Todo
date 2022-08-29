package io.github.MaksymilianSt.todo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/todos")
class TodoServlet {
    private Logger logger = LoggerFactory.getLogger(TodoServlet.class);
    private TodoRepository repository;


    TodoServlet(TodoRepository repository) {
        this.repository = repository;

    }

    @GetMapping()
    ResponseEntity<List<Todo>> findAllTodos() {
        logger.info("Got request");
        return ResponseEntity.ok(repository.findAll());
    }

    @PutMapping("/{id}")
    ResponseEntity<Todo> toggleTodo(@PathVariable Integer id) {
         var todo =repository.findById(id);
         todo.ifPresent(t ->{
            t.setDone(!todo.get().isDone());
            repository.save(t);
         });
         return todo.map(ResponseEntity::ok).orElse(ResponseEntity.notFound().build());
    }
@PostMapping()
   ResponseEntity<Todo> saveTodo(@RequestBody Todo todo) {
        return ResponseEntity.ok(repository.save(todo));
    }
    @GetMapping(params = {"isDone"})
    ResponseEntity<List<Todo>> findAllDoneOrUndoneTodo(@RequestParam("isDone") Boolean isDone) {
            logger.info("got Request");
            return ResponseEntity.ok(repository.findAll()
                    .stream()
                    .filter(t -> t.isDone() == isDone)
                    .collect(Collectors.toList()));

    }
}
