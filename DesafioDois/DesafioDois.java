package DesafioDois;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class DesafioDois {

	public static void main(String[] args) {

		String senha;
		int caracteres;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite sua senha: ");
		senha = leia.next();
		
		String regex = "^(?=.*[0-9])"
                + "(?=.*[a-z])(?=.*[A-Z])"
                + "(?=.*[!@#$%^&*()-+])"
                + "(?=\\S+$).{6}$";
		
		Pattern p = Pattern.compile(regex);
		Matcher m = p.matcher(senha);
		

		if(senha.length()<6) {
			   caracteres = 6 - senha.length();
			   System.out.println("É necessário mais " + caracteres + " caracters!");
		   }
		
	}

}

