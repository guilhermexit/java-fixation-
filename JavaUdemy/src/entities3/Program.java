package entities3;

import java.util.Locale;
import java.util.Scanner;
import entities3.Aluno;

public class Program {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Aluno aluno;
		aluno = new Aluno();
		
		System.out.println("Nome: ");
		aluno.Nome = sc.nextLine();
		System.out.println("Nota do primeiro trimestre: ");
		aluno.Nota1 = sc.nextDouble();
		System.out.println("Nota do segundo trimestre: ");
		aluno.Nota2 = sc.nextDouble();
		System.out.println("Nota do terceiro trimestre: ");
		aluno.Nota3 = sc.nextDouble();
		
		double notaFinal = aluno.finalGrade();
		String passou = aluno.estaAprovado(notaFinal);
		
		System.out.println("Nota final: " + notaFinal);
		System.out.println(passou);
		
		
		sc.close();
	}

}
