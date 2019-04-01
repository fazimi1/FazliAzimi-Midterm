package design;

import java.util.Scanner;

public class EmployeeInfo extends CompanyInfo implements Employee{
	
 /*This class can be implemented from Employee interface then add additional methods in EmployeeInfo class.
 * Also, Employee interface can be implemented into an abstract class.So create an Abstract class
 * then inherit that abstract class into EmployeeInfo class.Once you done with designing EmployeeInfo class,
 * go to FortuneEmployee class to apply all the fields and attributes.
 * 
 * Important: YOU MUST USE the 
 * OOP(abstraction,Encapsulation, Inheritance and Polymorphism) concepts in every level possible.
 * Use all kind of keywords(super,this,static,final........)
 * Implement Nested class.
 * Use Exception Handling.
 *
 */

	/*
	 * declare few static and final fields and some non-static fields
	 */
	static String companyName;
	int employeeId;
	String employeeName;
	String departmentName;

	String benefit;
	private static int yearsWithCompany;
	private int salary;
	private String performance;
	
	/*
	 * You must implement the logic for below 2 methods and 
	 * following 2 methods are prototype as well for other methods need to be design,
	 * as you will come up with the new ideas.
	 */
	
	/*
	 * you must have multiple constructor.
	 * Must implement below constructor.
	 */
	public EmployeeInfo(int employeeId, int salary) {

		this.employeeId = employeeId;
		this.salary = salary;
	}

    public EmployeeInfo(String bob_garcia, int yearsWithCompany){
		this.yearsWithCompany= yearsWithCompany;
	}
	public void assignDepartment(String departmentName) {
		this.departmentName = departmentName;
	}



	/*
	 * This methods should calculate Employee bonus based on salary and performance.
	 * Then it will return the total yearly bonus. So you need to implement the logic.
	 * Hints: 10% of the salary for best performance, 8% of the salary for average performance and so on. 
	 * You can set arbitrary number for performance.
	 * So you probably need to send 2 arguments.
	 * 
	 */
	public String setPerformance (int score){

		if (score == 5)
			performance = "Best performance";

		if (score == 3)
			performance = "Average performance";

		if (score == 1)
			performance = "Poor performance";

		return performance;
	}

	public String getPerformance (){

		return this.performance;


	}
	public static int calculateEmployeeBonus(int numberOfYearsWithCompany, String yearlySalary){
		double Bonus = 0.00;
		if (numberOfYearsWithCompany == 5) {
			Bonus = yearlySalary* 0.1;
		} else if (numberOfYearsWithCompany == 4) {
			Bonus = yearlySalary * 0.08;
		} else if (numberOfYearsWithCompany == 3) {
			Bonus = yearlySalary * 0.06;
		} else if (numberOfYearsWithCompany == 2) {
			Bonus = 0;
			System.out.println("Your performance is poor, try to improve.");
		} else {
			Bonus = 0;
			System.out.println("You don't deserve bonus.");
		}
		return (int) Bonus;



	}
	
	/*
	 * This methods should calculate Employee Pension based on salary and numbers of years with the company.
	 * Then it will return the total pension. So you need to implement the logic.
	 * Hints: pension will be 5% of the salary for 1 year, 10% for 2 years with the company and so on.
	 * 
	 */
	public static int calculateEmployeePension(int salary){
		int total=0;
		Scanner sc  = new Scanner(System.in);
		System.out.println("Please enter start date in format (example: May,2015): ");
		String joiningDate = sc.nextLine();
		System.out.println("Please enter today's date in format (example: August,2017): ");
		String todaysDate = sc.nextLine();
        String convertedJoiningDate = DateConversion.convertDate(joiningDate);
        String convertedTodaysDate = DateConversion.convertDate(todaysDate);
		String startYear = convertedJoiningDate.substring(convertedJoiningDate.length() - 4, convertedJoiningDate.length());
		String currentYear = convertedTodaysDate.substring(convertedTodaysDate.length() - 4, convertedTodaysDate.length());
        //implement numbers of year from above two dates
		//Calculate pension
		int start = Integer.parseInt(startYear);
		int current = Integer.parseInt(currentYear);

		yearsWithCompany = (current - start);



		total = (int) (yearsWithCompany * 0.05 * salary);

		System.out.println("Total yearly pension: $"  + total);

		return total;
	}

	@Override
	public int employeeId() {
		return 0;
	}

	@Override
	public String employeeName() {
		return null;
	}

	@Override
	public void assignDepartment() {

	}

	@Override
	public int calculateSalary(int salary) {
		return 0;
	}

	@Override
	public void benefitLayout() {

	}
	public String getEmployeeName() {
		return employeeName;
	}

	public int getEmployeeId() {
		return employeeId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	private static class DateConversion {

		public DateConversion(Months months){}
		public static String convertDate(String date) {
			String [] extractMonth = date.split(",");
			String givenMonth = extractMonth[0];
			int monthDate = whichMonth(givenMonth);
			String actualDate = monthDate + "/" + extractMonth[1];
			return actualDate;
		}

		public static int whichMonth(String givenMonth) {
			Months months = Months.valueOf(givenMonth);
			int date = 0;
			switch (months) {
				case January:
					date = 1;
					break;
				case February:
					date = 2;
					break;
				case March:
					date = 3;
					break;
				case April:
					date = 4;
					break;
				case May:
					date = 5;
					break;
				case June:
					date = 6;
					break;
				case July:
					date = 1;
					break;
				case August:
					date = 1;
					break;
				case September:
					date = 1;
					break;
				case October:
					date = 1;
					break;
				case November:
					date = 1;
					break;
				case December:
					date = 1;
					break;
				default:
					date = 0;
					break;
			}
			return date;

		}
	}
}
