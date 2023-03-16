package jp.co.axa.apidemo.controllers;

import java.util.List;
import java.util.NoSuchElementException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.services.EmployeeService;

/**
 * Employee controller class
 * 
 * @author ALJ Devops
 * @version 1.0
 */
@RestController
@RequestMapping("/api/v1")
public class EmployeeController {

	/**
	 * Employee service
	 */
	@Autowired
	private EmployeeService employeeService;

	/**
	 * Get list of employees
	 * 
	 * This method returns all the existing employees
	 * and their details
	 * 
	 * @return List the list of employees
	 */
	@GetMapping("/employees")
	public List<Employee> getEmployees() {
		List<Employee> employees = employeeService.retrieveEmployees();
		return employees;
	}

	/**
	 * Get a certain employee
	 * 
	 * This method returns the employee details using id
	 * 
	 * @param employeeId the employee id
	 * @return employee the employee details
	 */
	@GetMapping("/employees/{employeeId}")
	public Employee getEmployee(@PathVariable(name = "employeeId") Long employeeId) {
		Employee emp = null;
		try {
			emp = employeeService.getEmployee(employeeId);
		} catch (NoSuchElementException e) {
			System.out.println("Employee does not exist");
			return null;
		}
		return emp;

	}

	/**
	 * Save new employee
	 * 
	 * This method inserts new employee record.
	 * 
	 * @param employee the employee details
	 */
	@PostMapping("/employees")
	public void saveEmployee(@RequestBody Employee employee) {
		employeeService.saveEmployee(employee);
		System.out.println("Employee Saved Successfully");
	}

	/**
	 * Delete an employee
	 * 
	 * This method deletes an existing record of an employee
	 * 
	 * @param employeeId the employee id
	 */
	@DeleteMapping("/employees/{employeeId}")
	public void deleteEmployee(@PathVariable(name = "employeeId") Long employeeId) {
		try {
		employeeService.deleteEmployee(employeeId);
		} catch (EmptyResultDataAccessException e) {
			System.out.println("Employee does not exist");
			return;
		}
		System.out.println("Employee Deleted Successfully");
	}

	/**
	 * Save/Update an employee
	 * 
	 * This method inserts/updates new employee record
	 * 
	 * @param employee the employee details
	 * @param employeeId the employee id
	 */
	@PutMapping("/employees/{employeeId}")
	public void updateEmployee(@RequestBody Employee employee, @PathVariable(name = "employeeId") Long employeeId) {
		Employee emp = null;

		try {
			emp = employeeService.getEmployee(employeeId);
		} catch (NoSuchElementException e) {
			employeeService.saveEmployee(employee);
			System.out.println("Employee Saved Successfully");
			return;
		}

		employee.setId(employeeId);
		employeeService.updateEmployee(employee);
		System.out.println("Employee Updated Successfully");
	}

}
