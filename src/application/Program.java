package application;

import java.text.ParseException;
import java.util.Locale;
import java.util.Scanner;

import entities.Address;
import entities.Department;
import entities.Employee;

public class Program {

	public static void main(String[] args) throws ParseException {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Scanner scan = new Scanner(System.in);

		System.out.print("Nome do departamento: ");
		String name = sc.nextLine();
		System.out.print("Dia do pagamento: ");
		int payday = sc.nextInt();
		System.out.print("Email: ");
		String email = scan.nextLine();
		System.out.print("Telefone: ");
		String phone = sc.next();

		Department dept = new Department(name, payday, new Address(email, phone));

		Address address = new Address(email, phone);

		System.out.print("Quantos funcionários tem o departamento? ");
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			System.out.println("Dados do funcionário " + (i + 1) + ":");
			System.out.print("Nome: ");
			String name1 = scan.nextLine();
			System.out.print("Salário: ");
			Double salary = sc.nextDouble();

			Employee employee = new Employee(name1, salary);
			dept.addItem(employee);
		}

		showReport(dept);

		sc.close();
	}

	private static void showReport(Department dept) {
		Address address = new Address();
		System.out.println();
		System.out.println("FOLHA DE PAGAMENTO");
		System.out.printf("Departamento Vendas = R$ %.2f ", dept.payroll());
		System.out.println("\nPagamento realizado no dia " + dept.getPayday());
		System.out.println("Funcionários: ");
		for (int i = 0; i < dept.getEmployee().size(); i++) {

			System.out.println(dept.getEmployee().get(i).getName());

		}
		System.out.println(dept.toString());

	}

}
