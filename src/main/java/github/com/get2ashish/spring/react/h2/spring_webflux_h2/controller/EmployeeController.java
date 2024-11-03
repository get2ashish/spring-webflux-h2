package github.com.get2ashish.spring.react.h2.spring_webflux_h2.controller;

import github.com.get2ashish.spring.react.h2.spring_webflux_h2.model.EmployeeEntity;
import github.com.get2ashish.spring.react.h2.spring_webflux_h2.service.EmployeeService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/employee")
@RequiredArgsConstructor
@Slf4j
public class EmployeeController {

    private final EmployeeService employeeService;
    @GetMapping
    public Flux<EmployeeEntity> getEmployees(){
        log.info("Controller find all employees");
        return employeeService.getAllEmployees();
    }
    @GetMapping("/id/{employeeId}")
    public Mono<EmployeeEntity> getEmployeesByID(@PathVariable("employeeId") Integer id) {
        log.info("Finding employee by ID {}", id);
        return employeeService.findEmployeeById(id);
    }

    @PostMapping
    public Mono<EmployeeEntity> getEmployeesByID(@RequestBody EmployeeEntity employeeEntity) {
        log.info("Saving employee {}", employeeEntity);
        return employeeService.saveEmployee(employeeEntity);
    }

    @DeleteMapping("/id/{employeeId}")
    public Mono<Void> deleteEmployeesByID(@PathVariable("employeeId") Integer employeeId) {
        log.info("Deleting employee by ID {}", employeeId);
        return employeeService.deleteById(employeeId);
    }

}
