package Principal;

import java.util.Scanner;

public class Quest17 {
	public static void main (String[] args) {
		Scanner principal = new Scanner(System.in);
		Scanner salario = new Scanner(System.in);
		Scanner cheque = new Scanner(System.in);
		
		int controlador;
		double salario_usuario;
		double cheq1;
		double cheq2;
		
		System.out.print("Olá! ");
		
		do {
			System.out.print("Escreva o valor do seu depósito: ");
			salario_usuario = salario.nextDouble();
			
			System.out.println();
			System.out.print("Digite o valor do seu primeiro cheque: ");
			cheq1 = cheque.nextDouble();
			
			System.out.println();
			System.out.print("Digite o valor do seu segundo cheque: ");
			cheq2 = cheque.nextDouble();
			
			double cpmf = 0.38 / 100;
			double saldo = (salario_usuario - cheq1 - cheq2 - (cheq1 * cpmf) - (cheq2 * cpmf));
			
			System.out.println("Seu saldo final é de R$" + saldo);
			
			System.out.println();
			System.out.println("Para um novo cáculo digite [0]"
					+ "\nPara parar o programa digite [1]");
			controlador = principal.nextInt();
			
			System.out.println("------------------------------------------------------------------------------");
			
		}
		while(controlador == 0);
		if(controlador == 1) {
			System.out.println("Isso é tudo pessoal!!!");
		} else {
			System.out.println("ERROR!!!"
        			+ "\nREINICIE O PROGRAMA!");
		}
	}
}