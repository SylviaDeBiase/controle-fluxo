package br.com.controle;

import java.util.Scanner;

public class Contador {
	public static void main(String[] args) {
		Scanner terminal = new Scanner(System.in);
		System.out.println("Digite o primeiro parâmetro");
		int parametroUm = terminal.nextInt();
		System.out.println("Digite o segundo parâmetro");
		int parametroDois = terminal.nextInt();
		
		try {
            contar(parametroUm, parametroDois);
            
        } catch (ParametrosInvalidosException exception) {
            System.out.println(exception.getMessage());
            
        } finally {
        	terminal.close();
        }
    }

    static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
        if (parametroUm >= parametroDois) {
            // Lançar a exceção personalizada
            throw new ParametrosInvalidosException();
        }

        // Imprime a contagem conforme o input
        for (int i = 1; i <= parametroDois-parametroUm; i++) {
            System.out.println("Imprimindo o número " + i);
        }
    }
}

	// Exceção personalizada verificada
	class ParametrosInvalidosException extends Exception{
		public ParametrosInvalidosException() {
			super("O segundo parâmetro deve ser maior que o primeiro");
		}
	}


