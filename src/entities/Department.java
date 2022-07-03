package entities;

import java.util.ArrayList;
import java.util.List;

public class Department {

	// private Address address;
	private String name;
	private int payday;
	entities.Address email;
	entities.Address phone;

	List<Employee> employee = new ArrayList<>();

	public Department(String name, int payday, entities.Address address) {
		this.name = name;
		this.payday = payday;
		this.email = address;
		this.phone = address;
	}

	public void Address(Address address) {
		this.email = address;

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

	@Override
	public String toString() {
		return "Para dúvidas favor entrar em contato: " + email.getEmail();
	}

}
