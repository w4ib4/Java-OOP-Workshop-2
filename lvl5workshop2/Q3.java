package lvl5workshop2;
class Person{
	protected String address;
	
	public Person(String address) {
		this.address = address;
	}
	
	public void displayAddress() {
		System.out.println("Address: " + address);
	}
	
}
class Employee extends Person{
	String department;
	
	public Employee(String address, String department) {
		super(address);
		this.department = department;
	}
	
	public void displayEmployeeAddress() {
		System.out.println("Address: " + address);
		System.out.println("Department: " + department);
	}
	
	
}
public class Q3 {
	public static void main(String[] args) {
		Employee emp = new Employee("Koteshwor","IT");
		emp.displayEmployeeAddress();
		
	}

}
