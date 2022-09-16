package Principal;

import java.util.Scanner;
import java.math.BigDecimal;

public class Quest06 {
    public static void main (String[] args) {
        Scanner principal = new Scanner(System.in);
        Scanner salario = new Scanner(System.in);

        System.out.print("Olá! ");
        int controlador;
        double salario_base, imposto, gratificação, salario_receber;
        do {
            System.out.print("Digite seu salário base: ");
            salario_base = salario.nextDouble();

            gratificação = (salario_base * 5/100);
            imposto = (salario_base * 7/100) ;
            salario_receber = ((salario_base + gratificação) - imposto);
            salario_receber = (double)(Math.round(salario_receber*100.0)/100.0);

            System.out.println();
            System.out.println("O valor que você irá receber é: R$" + salario_receber);

            System.out.println();
            System.out.println("Para um novo cálculo digite [0]");
            System.out.println("Agora você quer saber para onde foi o resto do seu salário? Digite [1]");
            controlador = principal.nextInt();

            if(controlador == 1) {
                System.out.println("Você tinha R$" + salario_base + ", desse valor você teve uma gratificação de 5% que equivale a R$" + gratificação + " .");
                System.out.println("Com isso você sabe que tinha um total de R$" + (salario_base + gratificação) + ".");
                System.out.println("Desse valor R$" + imposto + " foram pagos em impostos!");
                System.out.println();
                System.out.println("Para um novo cálculo digite [0]"
                		+ "\nPara finalizar o programa digite [2]");
                controlador = principal.nextInt();
            }
            System.out.println("--------------------------------------------------------------------------------------------");
            
        }while(controlador == 0);
        if(controlador == 2) {
        	System.out.println("Isso é tudo pessoal!!!");
        }else {
        	System.out.println("ERROR!!!"
        			+ "\nREINICIE O PROGRAMA!");
        }
        
    }
} 