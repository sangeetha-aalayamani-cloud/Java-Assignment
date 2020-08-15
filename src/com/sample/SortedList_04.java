package com.sample;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/**
 * 
 * @author Sangeetha
 *
 */
public class SortedList_04 {

	public static void main(String[] args) {
		
		   List<Employee> emp = new ArrayList<Employee>();
		   
		   emp.add(new Employee(200, "Priya", "Manager"));
		   emp.add(new Employee(101, "Raja", "Developer"));
		   emp.add(new Employee(105, "Ayesha", "Architect"));
		   emp.add(new Employee(111, "Jessi", "Tester"));
		   emp.add(new Employee(121, "Ravi", "Developer"));
		   emp.add(new Employee(115, "Ayesha", "Architect"));
		   emp.add(new Employee(100, "Kennie", "Developer"));
		   emp.add(new Employee(102, "Rekha", "Developer"));
		   emp.add(new Employee(104, "Nisha", "Tester"));
		   emp.add(new Employee(122, "Varsha", "Developer"));
		   
		   Collections.sort(emp);

		   for(Employee e: emp){
				System.out.println(e);
		   }
	}
}