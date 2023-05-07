package cl.iacc.rodrigoespinozatarea6.repository;

import cl.iacc.rodrigoespinozatarea6.entity.Assignment;

import java.util.List;

public interface AssignmentRepository {
    Assignment create(Assignment assignment);
    Assignment findById(Long id);
    List<Assignment> findAll();
    void remove(Long id);
}
