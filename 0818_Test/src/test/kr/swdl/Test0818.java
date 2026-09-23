package test.kr.swdl;

import kr.swdl.Employee;
import kr.swdl.Manager;

public class Test0818 {

	public static void main(String[] args) {
		Employee[] persons = new Employee[3];
		persons[0] = new Employee("S001", "seokgi", 2100000);
		persons[1] = new Employee("S002", "jian", 3300000);
		persons[2] = new Manager("M002", "dayoung", 3200000, "1급 관리자");
		
		for (int i = 0; i < persons.length; i++) {
			if (persons[i] instanceof Employee) {
				Employee tmp = persons[i];
				System.out.println(tmp.getName() + "는 일반 사원입니다.");
			} else {
				Manager tmp = (Manager) persons[i];
				System.out.println(tmp.getName() + "는 " + tmp.getRank() + "입니다.");
			}
		}
		int maxSalary = 0;
		String text = "";
		for (int i = 0; i < persons.length; i++) {
			if (persons[i].getSalary() > maxSalary) {
				maxSalary = persons[i].getSalary();
				text = persons[i].toString();
				}
		}
		
        System.out.println("");
	}

}
