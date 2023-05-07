package cl.iacc.rodrigoespinozatarea6.repository;

import cl.iacc.rodrigoespinozatarea6.entity.Assignment;

import java.util.List;

public interface AssignmentRepository {
    Assignment create(Assignment assignment);
    Assignment findById(String id);
    List<Assignment> findAll();
    void remove(String id);
}
