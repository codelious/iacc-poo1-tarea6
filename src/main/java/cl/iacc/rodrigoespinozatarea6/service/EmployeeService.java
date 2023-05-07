package cl.iacc.rodrigoespinozatarea6.service;

import cl.iacc.rodrigoespinozatarea6.entity.Employee;

import java.util.List;

public interface EmployeeService {
    Employee create(Employee employee);
    Employee findById(String id);
    List<Employee> findAll();
    void remove(String id);
}
