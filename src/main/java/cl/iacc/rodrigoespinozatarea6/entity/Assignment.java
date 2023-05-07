package cl.iacc.rodrigoespinozatarea6.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Assignment {

    private Long id;
    private LocalDate date;
    private Employee employee;
    private Notebook notebook;

}
