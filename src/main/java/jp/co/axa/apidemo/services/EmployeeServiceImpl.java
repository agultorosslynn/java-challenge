package jp.co.axa.apidemo.services;

import jp.co.axa.apidemo.entities.Employee;
import jp.co.axa.apidemo.repositories.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 * Employee service implementation class
 * 
 * @author ALJ Devops
 * @version 1.0
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	/**
	 * Employee repository DAO
	 */
	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<Employee> retrieveEmployees() {
		List<Employee> employees = employeeRepository.findAll();
		return employees;
	}

	@Override
	public Employee getEmployee(Long employeeId) {
		Optional<Employee> optEmp = employeeRepository.findById(employeeId);
		return optEmp.get();
	}

	@Override
	public void saveEmployee(Employee employee) {
		employeeRepository.save(employee);
	}

	@Override
	public void deleteEmployee(Long employeeId) {
		employeeRepository.deleteById(employeeId);
	}

	@Override
	public void updateEmployee(Employee employee) {
		employeeRepository.save(employee);
	}
}