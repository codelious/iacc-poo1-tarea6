package cl.iacc.rodrigoespinozatarea6.service;

import cl.iacc.rodrigoespinozatarea6.entity.Assignment;

import java.util.List;

public interface AssignmentService {
    Assignment create(Assignment assignment);
    Assignment findById(Long id);
    List<Assignment> findAll();
    void remove(Long id);
}
