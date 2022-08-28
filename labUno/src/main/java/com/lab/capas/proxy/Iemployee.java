package com.lab.capas.proxy;

import java.util.Optional;
import org.springframework.boot.CommandLineRunner;
import com.lab.capas.InitDataLoader;
import com.lab.capas.entity.Employee;

public interface Iemployee {

	public Employee addEmployee (Employee emp);
	public Optional findEmployeeById(Long empId);
	public Iterable findAllEmployee();
	public void deleteEmployeeById(Employee emp);
	public CommandLineRunner loadData(InitDataLoader loader) ;
}