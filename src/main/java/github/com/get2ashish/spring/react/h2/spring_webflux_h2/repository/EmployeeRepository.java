package github.com.get2ashish.spring.react.h2.spring_webflux_h2.repository;

import github.com.get2ashish.spring.react.h2.spring_webflux_h2.model.EmployeeEntity;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;
import reactor.core.publisher.Flux;

@Repository
public interface EmployeeRepository extends R2dbcRepository<EmployeeEntity, Integer> {
    Flux<EmployeeEntity> findAllByFirstName(String firstName);
    Flux<EmployeeEntity> findAllByLastName(String lastName);
    Flux<EmployeeEntity> findAllByDepartment(String department);
}
