package controllerCRUD;

import modelCRUD.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import serviceCRUD.EmployeeService;

import java.util.Collections;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public List<Employee> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @GetMapping("/{id}")
    public ResponseEntity<?> getEmployeeById(@PathVariable Long id) {
        Optional<Employee> optEmployee = employeeService.getEmployeeById(id);
        if (optEmployee.isPresent()) {
            return ResponseEntity.ok(optEmployee.get());
        } else {
            return ResponseEntity.status(404)
                    .body(Collections.singletonMap("errorMessage", "Employee with id " + id + " not found"));
        }
    }

    @PostMapping
    public Employee createEmployee(@RequestBody Employee employee) {
        return employeeService.saveEmployee(employee);
    }

    @PutMapping("/{id}")
    public ResponseEntity<?> updateEmployee(@PathVariable Long id, @RequestBody Employee employeeData) {
        Optional<Employee> optEmployee = employeeService.getEmployeeById(id);
        if (optEmployee.isPresent()) {
            Employee employee = optEmployee.get();
            employee.setName(employeeData.getName());
            employee.setSalary(employeeData.getSalary());
            employeeService.saveEmployee(employee);
            return ResponseEntity.ok(employee);
        } else {
            return ResponseEntity.status(404)
                    .body(Collections.singletonMap("errorMessage", "Employee with id " + id + " not found"));
        }
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<?> deleteEmployee(@PathVariable Long id) {
        Optional<Employee> optEmployee = employeeService.getEmployeeById(id);
        if (optEmployee.isPresent()) {
            employeeService.deleteEmployee(id);
            return ResponseEntity.ok().build();
        } else {
            return ResponseEntity.status(404)
                    .body(Collections.singletonMap("errorMessage", "Employee with id " + id + " not found"));
        }
    }
}
