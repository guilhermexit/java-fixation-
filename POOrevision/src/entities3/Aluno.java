package entities3;

public class Aluno {

	public String Nome;
	public double Nota1, Nota2, Nota3;
	
	
	
	public double finalGrade() {
		return Nota1 + Nota2 + Nota3;
	}
	
	public String estaAprovado(double notaFinal) {
		
		if (notaFinal < 60) {
			double faltou = 60 - notaFinal;
			return "FAILED  \nMISSING " + faltou + " POINTS";
		}
		else {
			
			return "PASS";
		}
		
	}
}
