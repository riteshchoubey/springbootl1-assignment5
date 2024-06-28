package com.sprigL1.assignment5.service;

import java.util.Collection;
import java.util.HashMap;

import java.util.Map;

import org.springframework.stereotype.Service;

import com.sprigL1.assignment5.model.Employee;

@Service
public class EmployeeService {

	private final Map<Long, Employee> employeeMap = new HashMap<>();

	public Collection<Employee> getAllEmployee() {
		return employeeMap.values();
	}

	public Employee getEmployeeById(Long id) {
		return employeeMap.get(id);
	}

	public Employee saveEmployee(Employee employee) {
		return employeeMap.put(employee.getEmployeeId(), employee);
	}

	public Employee updateEmployee(Long id, Employee employeeDetials) {
		Employee emp = employeeMap.get(id);
		if (emp != null) {
			emp.setEmployeeName(employeeDetials.getEmployeeName());
			emp.setEmployeeEmail(employeeDetials.getEmployeeEmail());
			emp.setLocation(employeeDetials.getLocation());
			return employeeMap.put(id, emp);
		}
		return null;
	}

	public void deleteEmployee(Long id) {
		employeeMap.remove(id);
	}
}
