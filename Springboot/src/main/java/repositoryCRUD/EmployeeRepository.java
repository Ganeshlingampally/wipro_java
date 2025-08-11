package repositoryCRUD;
import org.springframework.data.jpa.repository.JpaRepository;

import modelCRUD.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
