package com.prototype;

import java.util.List;

public class PrototypeTest {

	public static void main(String[] args) {
		Employees emp = new Employees();
		emp.loadData();

		Employees emp1 = (Employees) emp.clone();
		Employees emp2 = (Employees) emp.clone();
		List<String> emplist1 = emp1.getEmpList();
		emplist1.add("John");
		List<String> emplist2 = emp2.getEmpList();
		emplist2.remove("Pankaj");
		System.out.println("emps List: " + emp.getEmpList());
		System.out.println("emplist1 List: " + emplist1);
		System.out.println("emplist2 List: " + emplist2);

	}

}
