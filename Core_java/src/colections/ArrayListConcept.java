package colections;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	public static <E> void main(String[] args) {
		

		ArrayList ar = new ArrayList();
		ar.add(30);
		ar.add(40);
		ar.add(50);
		
		System.out.println(ar.size());
		System.out.println(ar.get(1));
		
		System.out.println("*******");
		
		for(int i = 0; i<ar.size(); i++) {
			System.out.println(ar.get(i));
		}
		System.out.println("*******");
		
		
		ArrayList <Integer> arInt = new ArrayList<Integer>();
		arInt.add(60);
		arInt.add(70);
		System.out.println(arInt.get(1));
		// need to be learn ArrayList <E>
		
		System.out.println("*******");
		//object of employee class
		
		Employee e1 = new Employee("Rajive", 35, "QA");
		Employee e2 = new Employee("Ali", 40, "dev");
		Employee e3 = new Employee("Pathan", 45, "admin");
		ArrayList <Employee> emp = new ArrayList<Employee>();
		
		emp.add(e1);
		emp.add(e2);
		emp.add(e3);
		

		
		Iterator<Employee> it = emp.iterator();
		
		while(it.hasNext()) {
			Employee employe=it.next();
			System.out.print(employe.Name +" ");
			System.out.print(employe.Age +" ");
			System.out.println(employe.Dept);
			
		}
		
		

	}
 
}
