package assignment;

public class Employee {
	private int id;
	private String name;
	private int sal;
	
	public Employee(int id, String name, int sal) {
		this.id=id;
		this.name=name;
		this.sal=sal;
	}
	
	public void view() {
		System.out.println("ID: "+id+"\nName: "+name+"\nSalary: "+sal);
	}
	
	public static void main(String[] args) {
		System.out.println("Employee details are: ");
		Employee e1 = new Employee(123, "ABC", 10000);
		Employee e2 = new Employee(890, "XYZ", 20000);
		e1.view();
		e2.view();
	}
	

}

