package net.javaguides.springboot.repository;

import net.javaguides.springboot.modal.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository <Employee, Long> {
    //all crud database methods
}
