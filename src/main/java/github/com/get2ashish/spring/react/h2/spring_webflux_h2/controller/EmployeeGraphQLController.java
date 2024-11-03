package github.com.get2ashish.spring.react.h2.spring_webflux_h2.controller;

import github.com.get2ashish.spring.react.h2.spring_webflux_h2.model.EmployeeEntity;
import github.com.get2ashish.spring.react.h2.spring_webflux_h2.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.graphql.data.method.annotation.Argument;
import org.springframework.graphql.data.method.annotation.QueryMapping;
import org.springframework.stereotype.Controller;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Controller
@RequiredArgsConstructor
public class EmployeeGraphQLController {

    private final EmployeeRepository employeeRepository;
    @QueryMapping
    public Mono<EmployeeEntity> getEmployeeById(@Argument Integer id) {
        return employeeRepository.findById(id);
    }

    @QueryMapping
    public Flux<EmployeeEntity> getEmployees() {
        return employeeRepository.findAll();
    }

    @QueryMapping
    public Flux<EmployeeEntity> getEmployeesByFirstName(@Argument String firstName) {
        return employeeRepository.findAllByFirstName(firstName);
    }

    @QueryMapping
    public Flux<EmployeeEntity> getEmployeesByLastName(@Argument String lastName) {
        return employeeRepository.findAllByLastName(lastName);
    }

    @QueryMapping
    public Flux<EmployeeEntity> getEmployeesByDepartment(@Argument String department) {
        return employeeRepository.findAllByDepartment(department);
    }
}
