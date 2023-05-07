package cl.iacc.rodrigoespinozatarea6.repository;

import cl.iacc.rodrigoespinozatarea6.entity.Employee;

import java.util.List;

public interface EmployeeRepository {
    Employee create(Employee employee);
    Employee findById(String id);
    List<Employee> findAll();
    void remove(String id);
}
