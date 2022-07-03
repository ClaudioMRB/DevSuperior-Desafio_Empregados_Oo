package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	// private Address address;
	private String name;
	private int payday;
	String email;
	String phone;

	List<Employee> employee = new ArrayList<>();

	public Department() {

	}

	public Department(String name, int payday, String email, String phone) {

		this.name = name;
		this.payday = payday;
		this.email = email;
		this.phone = phone;
	}

	public Department(String name, int payday) {

		this.name = name;
		this.payday = payday;
	}

	public void Address(Address address) {
		this.email = address.getEmail();

	}

	public String getEmail() {
		return email;
	}

	public String getName() {

		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPayday() {
		return payday;
	}

	public void setPayday(int payday) {
		this.payday = payday;
	}

	public Double payroll() {
		double sum = 0.0;
		for (Employee x : employee) {
			sum += x.getSalary();
		}
		return sum;
	}

	public void addItem(Employee dept) {
		employee.add(dept);
	}

	public void removeItem(Employee dept) {
		employee.remove(dept);
	}

	public List<Employee> getEmployee() {
		return employee;
	}

}
