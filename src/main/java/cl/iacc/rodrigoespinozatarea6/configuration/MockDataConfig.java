package cl.iacc.rodrigoespinozatarea6.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MockDataConfig {

    @Bean
    public EmployeeData employeeDataBean() {
        return new EmployeeData();
    }

    @Bean
    public NotebookData notebookDataBean() {
        return new NotebookData();
    }

    @Bean
    public AssignmentData assignmentDataBean() {
        return new AssignmentData();
    }
}
