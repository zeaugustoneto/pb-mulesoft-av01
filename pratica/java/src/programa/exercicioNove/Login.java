package programa.exercicioNove;

import java.util.Calendar;
import java.util.Scanner;

public class Login {

	public static void main(String[] args) {
		String usuarioCadastrado = "aluno1";
		String senhaCadastrada = "123aluno1";
		String usuario;
		String senha;
		Calendar calendar = Calendar.getInstance();
		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o usu�rio: ");
		usuario = sc.next();
		System.out.println("Digite a senha: ");
		senha = sc.next();

		if (usuario.equals(usuarioCadastrado) && senha.equals(senhaCadastrada)) {
	
			int hora = calendar.get(Calendar.HOUR_OF_DAY);
			
			if (hora >= 6 && hora < 12) {
				System.out.println("Bom dia, voc� se logou ao nosso sistema.");
			} else if (hora >= 12 && hora < 18) {
				System.out.println("Boa tarde, voc� se logou ao nosso sistema.");
			} else if (hora >= 18 && hora < 24) {
				System.out.println("Boa noite, voc� se logou ao nosso sistema.");
			} else {
				System.out.println("Boa madrugada, voc� se logou ao nosso sistema.");
			}

		} else {
			System.out.println("Usu�rio e/ou senha incorretos.");
		}
	}

}
