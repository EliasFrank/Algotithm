package hl2020_09_27;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class GetImportance {
	public static void main(String[] args) {
		List<Employee> employees = new ArrayList<Employee>();
		
		Employee employee = new Employee();
		employee.id = 1;
		employee.importance = 5;
		ArrayList<Integer> ids = new ArrayList<Integer>();
		ids.add(2);
		ids.add(3);
		employee.subordinates = ids;
		
		Employee employee2 = new Employee();
		employee2.id = 2;
		employee2.importance = 3;
		
		Employee employee3 = new Employee();
		employee3.id = 3;
		employee3.importance = 3;
		
		employees.add(employee);
		employees.add(employee2);
		employees.add(employee3);
		
		int result = new GetImportance().getImportance(employees, 1);
		System.out.println(result);
	}
	public int getImportance(List<Employee> employees, int id) {
		Map<Integer, Employee> map = new HashMap<Integer, Employee>();
		Queue<Integer> list = new LinkedList<Integer>();
		Employee top;
		int sum = 0;
		for (Employee employee : employees) {
			map.put(employee.id, employee);
		}
		top = map.get(id);
		list.add(top.id);
		while(!list.isEmpty()) {
			int tempId = list.poll();
			Employee employee = map.get(tempId);
//			if(employee == null) return sum;
			sum += employee.importance;
			if(employee.subordinates != null)
				list.addAll(employee.subordinates);
		}
		return sum;
	}
}
class Employee {
 public int id;
 public int importance;
 public List<Integer> subordinates;
 @Override
	public String toString() {
		return id + "  " + importance + "  " + subordinates.toString();
	}
};