package com.codingcure.code_cure_devops.repo;

import com.codingcure.code_cure_devops.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
