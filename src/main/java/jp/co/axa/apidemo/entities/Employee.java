package jp.co.axa.apidemo.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/**
 * Employee entity class
 * 
 * @author ALJ Devops
 * @version 1.0
 */
@Entity
@Table(name = "EMPLOYEE")
@Data
public class Employee {

	/**
	 * Represents employee id
	 */
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	/**
	 * Represents employee name
	 */
	@Column(name = "EMPLOYEE_NAME")
	private String name;

	/**
	 * Represents employee salary
	 */
	@Column(name = "EMPLOYEE_SALARY")
	private Integer salary;

	/**
	 * Represents employee department
	 */
	@Column(name = "DEPARTMENT")
	private String department;

}
