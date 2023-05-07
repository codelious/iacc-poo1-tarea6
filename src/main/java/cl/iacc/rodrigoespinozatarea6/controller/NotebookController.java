package cl.iacc.rodrigoespinozatarea6.controller;

import cl.iacc.rodrigoespinozatarea6.entity.Notebook;
import cl.iacc.rodrigoespinozatarea6.service.NotebookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/notebook")
public class NotebookController {

    final NotebookService notebookService;

    @Autowired
    public NotebookController(NotebookService notebookService) {
        this.notebookService = notebookService;
    }

    @PostMapping
    public ResponseEntity<Notebook> create(@RequestBody Notebook notebook) {
        return new ResponseEntity<>(notebookService.create(notebook), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Notebook> getById(@PathVariable String id) {
        return new ResponseEntity<>(notebookService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Notebook>> getAll() {
        return new ResponseEntity<>(notebookService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable String id) {
        notebookService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
