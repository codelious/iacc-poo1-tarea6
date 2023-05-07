package cl.iacc.rodrigoespinozatarea6.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Notebook {
    private String serial;
    private String model;
    private String processor;
    private String brand;
    private String operatingSystem;
}
