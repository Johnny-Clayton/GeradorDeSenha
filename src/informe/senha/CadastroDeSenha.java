package informe.senha;

import java.util.Scanner;
import java.util.regex.Pattern;

public class CadastroDeSenha {

    static String passwordRegex = "^(?=.*[0-9])(?=.*[!@#$%^&*])[a-zA-Z0-9!@#$%^&*]{8,20}$";

    public static void main(String[] args) {
    	
        Scanner sc = new Scanner(System.in);
        
        String password = "";
        
        do {
        	System.out.println("Cadastre uma senha (8-20 caracteres, números e símbolos):");
            password = sc.nextLine();
           
            if (verificaSenha(password) == false)
                System.out.println("Senha inválida. Tente novamente. \n----------");
            
		} while (verificaSenha(password) == false);
        
        System.out.println("Senha válida!");
    }

    public static boolean verificaSenha(String password) {
        Pattern pattern = Pattern.compile(passwordRegex);
        return pattern.matcher(password).matches();
    }
}
