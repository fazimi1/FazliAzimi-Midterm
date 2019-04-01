package design;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FortuneEmployee {

	/**
	 * FortuneEmployee class has a main methods where you will be able to create Object from
	 * EmployeeInfo class to use fields and attributes.Demonstrate as many methods as possible 
	 * to use with proper business work flow.Think as a Software Architect, Product Designer and 
	 * as a Software Developer.(employee.info.system) package is given as an outline,you need to elaborate
	 * more to design an application that will meet for fortune 500 Employee Information
	 * Services.
	 *
	 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
	 *
	 **/
	public static void main(String[] args) throws Exception {



		EmployeeInfo employee1 = new EmployeeInfo("Bob Garcia", 12);
		EmployeeInfo employee2 = new EmployeeInfo("Anthony Milton", 13);
		EmployeeInfo employee3 = new EmployeeInfo("Tony Stark", 10);
		EmployeeInfo employee4 = new EmployeeInfo("Dave Jefferson", 15);


		employee1.assignDepartment("Marketing");
		employee2.assignDepartment("Information Technology");
		employee3.assignDepartment("Accounting");
		employee4.assignDepartment("Finance");
	;

		employee1.setSalary(40000);
		employee1.calculateSalary(employee1.getSalary());
		employee2.setSalary(30000);
		employee2.calculateSalary(employee2.getSalary());
		employee3.setSalary(50000);
		employee3.calculateSalary(employee3.getSalary());
		employee4.setSalary(110000);
		employee4.calculateSalary(employee4.getSalary());

		employee1.setPerformance(5);
		EmployeeInfo.calculateEmployeeBonus(employee1.getSalary(), employee1.getPerformance());

		employee2.setPerformance(3);
		EmployeeInfo.calculateEmployeeBonus(employee2.getSalary(), employee2.getPerformance());

		employee3.setPerformance(5);
		EmployeeInfo.calculateEmployeeBonus(employee3.getSalary(), employee3.getPerformance());

		employee4.setPerformance(3);
		EmployeeInfo.calculateEmployeeBonus(employee4.getSalary(), employee4.getPerformance());


		EmployeeInfo.calculateEmployeePension(employee1.getSalary());



		ArrayList<Object> emp1Record = new ArrayList<Object>();

		emp1Record.add(employee1.getEmployeeId());
		emp1Record.add(employee1.getEmployeeName());
		emp1Record.add(employee1);
		emp1Record.add(employee1.getSalary());
		emp1Record.add(EmployeeInfo.calculateEmployeeBonus(employee1.getSalary(), employee1.getPerformance()));


		ArrayList<Object> emp2Record = new ArrayList<Object>();
		emp2Record.add(employee2.getEmployeeId());
		emp2Record.add(employee2.getEmployeeName());
		emp2Record.add(employee2);
		emp2Record.add(employee2.getSalary());
		emp2Record.add(EmployeeInfo.calculateEmployeeBonus(employee2.getSalary(), employee2.getPerformance()));



		Map<Integer, ArrayList<Object>> employeeRecord = new HashMap<>();

		employeeRecord.put(1, emp1Record);
		employeeRecord.put(2, emp2Record);



		for (Map.Entry<Integer, ArrayList<Object>> data :
				employeeRecord.entrySet()) {

			System.out.println(data.getKey());
			System.out.println(data.getValue());
		}



	}
	}


