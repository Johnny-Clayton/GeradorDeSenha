package gerador;

import java.util.Random;
import java.util.Scanner;

public class GeradorDeSenha {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Tamanho da senha: ");
		int tamanho = sc.nextInt();

		String caracteres = gerarCaracteresAleatorios(sc, tamanho);

		String senha = gerarSenha(tamanho, caracteres);
		
		System.out.println(senha);
  }
 
public static String gerarSenha(int tamanho, String caracteres) {
	
	    Random gerador = new Random();
	    String senha = "";

	    for (int i = 0; i < tamanho; i++) {
	        int indice = gerador.nextInt(caracteres.length());
	        senha += caracteres.charAt(indice);
	    }

	    return senha;
	}

public static String gerarCaracteresAleatorios(Scanner sc, int tamanho) {

    String letras = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
    String numeros = "1234567890"; 
    String simbolos = "!@#$%^&*()_+=-";
    String caracteres = "";
    
    System.out.println("Quantidade de letras: ");
	int qtdLetras = sc.nextInt();
	
	System.out.println("Quantidade de Numeros: ");
	int qtdNumeros = sc.nextInt();
	
	System.out.println("Quantidade de Simbolos: ");
	int qtdSimbolos = sc.nextInt();

    for (int i = 0; i < qtdLetras; i++) {
      int index = new Random().nextInt(letras.length());
      caracteres += letras.charAt(index);
    }

    for (int i = 0; i < qtdNumeros; i++) {
      int index = new Random().nextInt(numeros.length());
      caracteres += numeros.charAt(index);
    }
    
    for (int i = 0; i < qtdSimbolos; i++) {
	  int index = new Random().nextInt(numeros.length());
	  caracteres += simbolos.charAt(index);
	}
    
    while (tamanho != caracteres.length()) {
    	System.out.println("----------");
    	System.out.println("Senha invalida, o tamanho tem que ser: " + tamanho);
    	return gerarCaracteresAleatorios(sc, tamanho);
    	
	}
    return caracteres;
  }
}





