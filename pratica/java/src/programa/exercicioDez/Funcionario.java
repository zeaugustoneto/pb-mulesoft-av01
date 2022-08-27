package programa.exercicioDez;

public class Funcionario {

	private String nome;
	private double salario;
	private double bonus;
	private double salarioLiquido;
	
	public Funcionario() {
		
	}
	
	public Funcionario(String nome, double salario, double bonus, double salarioLiquido) {
		this.nome = nome;
		this.salario = salario;
		this.bonus = bonus;
		this.salarioLiquido = salarioLiquido;
	}



	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

	public double getBonus() {
		return bonus;
	}

	public void setBonus(double salario) {
		if(salario <= 1000) this.bonus = salario * 0.2 ;
		else this.bonus = salario * 0.1;

	}

	public double getSalarioLiquido() {
		return salarioLiquido;
	}

	public void setSalarioLiquido(double salario, double bonus) {
		if (salario >= 2000) this.salarioLiquido = salario - bonus;
		else this.salarioLiquido = salario + bonus;
	}
	
	
}
