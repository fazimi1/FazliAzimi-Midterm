package design;

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
	public static void main(String[] args) {



		EmployeeInfo employee1 = new EmployeeInfo("Bob Garcia", 123456);
		EmployeeInfo employee2 = new EmployeeInfo("Anthony Milton", 123457);
		EmployeeInfo employee3 = new EmployeeInfo("Tony Stark", 123458);
		EmployeeInfo employee4 = new EmployeeInfo("Dave Jefferson", 123459);


		employee1.assignDepartment("Marketing");
		employee2.assignDepartment("Information Technology");
		employee3.assignDepartment("Accounting");
		employee4.assignDepartment("Finance");
	;

		employee1.setSalary(10000);
		employee2.setSalary(12000);
		employee3.setSalary(10000);
		employee4.setSalary(1100);


	}

}
