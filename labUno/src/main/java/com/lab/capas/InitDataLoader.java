package com.lab.capas;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.lab.capas.entity.Employee;
import com.lab.capas.repository.EmployeeRepositiry;

@Component
public class InitDataLoader {
	@Autowired
	private EmployeeRepositiry rep;

	public void loadData() {
		createData().forEach(
				emp->{
					rep.save(emp);
					System.out.println("Successfully saved ::" + emp);
				}

				);

	}

	private List<Employee> createData() {

		List<Employee> employees = new ArrayList<Employee>();

		Employee emp = new Employee();
		emp.setName("Shamik Mitra");
		emp.setSex("M");
		emp.setAddress("BagBazar");
		Employee emp1 = new Employee();
		emp1.setName("Samir Mitra");
		emp1.setSex("M");
		emp1.setAddress("BagBazar");
		Employee emp2 = new Employee();
		emp2.setName("Swastika Basu");
		emp2.setSex("F");
		emp2.setAddress("Baranagar");

		employees.add(emp);
		employees.add(emp1);
		employees.add(emp2);
		return employees;
	}

}

