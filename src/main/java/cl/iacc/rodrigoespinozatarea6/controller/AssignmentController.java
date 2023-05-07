package cl.iacc.rodrigoespinozatarea6.controller;

import cl.iacc.rodrigoespinozatarea6.entity.Assignment;
import cl.iacc.rodrigoespinozatarea6.service.AssignmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
@RequestMapping("/assignment")
public class AssignmentController {

    final AssignmentService assignmentService;

    @Autowired
    public AssignmentController(AssignmentService assignmentService) {
        this.assignmentService = assignmentService;
    }

    @PostMapping
    public ResponseEntity<Assignment> create(@RequestBody Assignment assignment) {
        return new ResponseEntity<>(assignmentService.create(assignment), HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Assignment> getById(@PathVariable Long id) {
        return new ResponseEntity<>(assignmentService.findById(id), HttpStatus.OK);
    }

    @GetMapping
    public ResponseEntity<List<Assignment>> getAll() {
        return new ResponseEntity<>(assignmentService.findAll(), HttpStatus.OK);
    }
    @DeleteMapping("/{id}")
    public ResponseEntity<Void> remove(@PathVariable Long id) {
        assignmentService.remove(id);
        return new ResponseEntity<>(HttpStatus.OK);
    }
}
