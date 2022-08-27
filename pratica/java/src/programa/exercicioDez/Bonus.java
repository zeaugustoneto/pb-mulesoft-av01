package programa.exercicioDez;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Digite o numero de funcionarios");
		int nFuncionarios = sc.nextInt();
		
		Funcionario[] funcionariosArray = new Funcionario[nFuncionarios];
		
		for(int i = 0; i < funcionariosArray.length; i++) {
			Funcionario funcionario = new Funcionario();
			System.out.println("Digite nome do funcionario");
			sc.nextLine();
			funcionario.setNome(sc.nextLine());
			System.out.println("Digite o sal�rio do funcionario");
			funcionario.setSalario(sc.nextDouble());
			funcionario.setBonus(funcionario.getSalario());
			funcionario.setSalarioLiquido(funcionario.getSalario(), funcionario.getBonus());
			
			funcionariosArray[i] = funcionario;
		}
		
		System.out.println("Resultado do calculo do b�nus: ");
		for(int i = 0; i < funcionariosArray.length; i++) {
			System.out.println("Funcion�rio " + funcionariosArray[i].getNome());
			System.out.println("Sal�rio: " + funcionariosArray[i].getSalario());
			if(funcionariosArray[i].getSalario() >= 2000) System.out.println("Desconto: " + funcionariosArray[i].getBonus());
			else System.out.println("B�nus: " + funcionariosArray[i].getBonus());
			System.out.println("Sal�rio l�quido: " + funcionariosArray[i].getSalarioLiquido());
			System.out.println();
			
			}
		
	}

}
