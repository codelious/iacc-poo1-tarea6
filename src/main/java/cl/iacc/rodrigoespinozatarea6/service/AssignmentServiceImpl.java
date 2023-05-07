package cl.iacc.rodrigoespinozatarea6.service;

import cl.iacc.rodrigoespinozatarea6.entity.Assignment;
import cl.iacc.rodrigoespinozatarea6.repository.AssignmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AssignmentServiceImpl implements AssignmentService {

    final AssignmentRepository assignmentRepository;

    @Autowired
    public AssignmentServiceImpl(AssignmentRepository assignmentRepository) {
        this.assignmentRepository = assignmentRepository;
    }

    @Override
    public Assignment create(Assignment assignment) {
        return assignmentRepository.create(assignment);
    }

    @Override
    public Assignment findById(String id) {
        return assignmentRepository.findById(id);
    }

    @Override
    public List<Assignment> findAll() {
        return assignmentRepository.findAll();
    }

    @Override
    public void remove(String id) {
        assignmentRepository.remove(id);
    }
}
