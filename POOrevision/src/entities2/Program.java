package entities2;

import java.util.Locale;
import java.util.Scanner;
import entities2.Employee;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		
		Scanner sc = new Scanner(System.in);
		
		Employee x;
		x = new Employee();
		
		System.out.println("Digite seu nome: ");
		x.Name = sc.nextLine();
		System.out.println("Digite seu salário bruto: ");
		x.GrossSalary = sc.nextDouble();
		System.out.println("Digite o valor do imposto: ");
		x.Tax = sc.nextDouble();		
		
		double salarioLiquido = x.NetSalary();
		
		
		System.out.println("Employee: " + x.Name + ", $ " + salarioLiquido);
		
		System.out.println("Qual a porcentagem de aumento do salário: ");
		double percentage = sc.nextDouble();
		x.IncreaseSalary(percentage);
		
		System.out.println("Dados atualizados: " + x);
	
		
		
		sc.close();
		
		
	}

}
