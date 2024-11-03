package github.com.get2ashish.spring.react.h2.spring_webflux_h2.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.math.BigDecimal;

@Getter
@Setter
@ToString
@Table("EMPLOYEE")
public class EmployeeEntity {
    @Id
    private int id;
    private String firstName;
    private String lastName;
    private BigDecimal salary;
    private String department;
}
