package github.com.get2ashish.spring.react.h2.spring_webflux_h2.service;

import github.com.get2ashish.spring.react.h2.spring_webflux_h2.model.EmployeeEntity;
import github.com.get2ashish.spring.react.h2.spring_webflux_h2.repository.EmployeeRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Service
@RequiredArgsConstructor
@Slf4j
public class EmployeeService {

    private final EmployeeRepository employeeRepository;

    public Flux<EmployeeEntity> getAllEmployees() {
        log.info("Finding all employees");
        Flux<EmployeeEntity> employeeFlux = employeeRepository.findAll();
        return employeeFlux;
    }

    public Mono<EmployeeEntity> saveEmployee(EmployeeEntity employeeEntity) {
        log.info("saving employees {}", employeeEntity);
        return employeeRepository.save(employeeEntity);
    }

    public Mono<EmployeeEntity> findEmployeeById(Integer id) {
        log.info("Find employee by ID {}", id);
        return employeeRepository.findById(id);
    }

    public Mono<Void> deleteById(Integer id) {
        log.info("Deleting employee by ID {}", id);
        return employeeRepository.deleteById(id);
    }

}
