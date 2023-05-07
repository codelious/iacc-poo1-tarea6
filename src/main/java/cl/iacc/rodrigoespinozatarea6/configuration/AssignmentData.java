package cl.iacc.rodrigoespinozatarea6.configuration;

import cl.iacc.rodrigoespinozatarea6.entity.Assignment;

import java.util.ArrayList;
import java.util.List;

public class AssignmentData {

    private final List<Assignment> assignmentList;

    public AssignmentData() {
        this.assignmentList = new ArrayList<>();
    }

    public Assignment add(Assignment assignment) {
        assignmentList.add(assignment);
        return assignment;
    }

    @SuppressWarnings("OptionalGetWithoutIsPresent")
    public Assignment get(Long id) {
        return assignmentList.stream().filter(assignment -> assignment.getId().equals(id)).findFirst().get();
    }

    public List<Assignment> getAll() {
        return assignmentList;
    }

    public void delete(Long id) {
        this.assignmentList.remove(get(id));
    }

    public Long getNextId() {
        Long maxId = 0L;
        for (Assignment assignment : assignmentList) {
            Long actualId = assignment.getId();
            if (actualId > maxId) {
                maxId = actualId;
            }
        }
        return maxId + 1;
    }
}
