package jp.co.axa.apidemo.services;

import jp.co.axa.apidemo.entities.Employee;

import java.util.List;

/**
 * Employee service class interface
 * 
 * @author ALJ Devops
 * @version 1.0
 */
public interface EmployeeService {

	/**
	 * Get list of employees
	 * 
	 * This method returns all the employees that will
	 * be fetched from the database. 
	 * 
	 * @return the list of employees
	 */
    public List<Employee> retrieveEmployees();

	/**
	 * Get a certain employee
	 * 
	 * This method returns the employee using id that will
	 * be fetched from the database. 
	 * 
	 * @param employeeId the employee id
	 * @return employee the employee details
	 */
    public Employee getEmployee(Long employeeId);
    
	/**
	 * Save new employee
	 * 
	 * This method inserts new employee to the database
	 * 
	 * @param employee the employee details
	 */
    public void saveEmployee(Employee employee);

	/**
	 * Delete an employee
	 * 
	 * This method deletes an existing record of
	 * an employee in the database
	 * 
	 * @param employeeId the employee id
	 */
    public void deleteEmployee(Long employeeId);

	/**
	 * Save/Update an employee
	 * 
	 * This method inserts a new employee records if the employeeId
	 * is already existing in the database, else it will update the
	 * existing record.
	 * 
	 * @param employee the employee details
	 * @param employeeId the employee id
	 */
    public void updateEmployee(Employee employee);
}