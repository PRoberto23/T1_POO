package main;
import java.util.Scanner;

public class Quest9 {

	public static void main(String[] args) {
		Scanner sc = new Scanner (System.in);
	    System.out.println("Bem vindo ao Calculando Área de um Triangulo!");
	    System.out.print("\nDigite a base do triangulo: ");
	    float base = sc.nextFloat();
	    System.out.print("\nDigite a Altura do triangulo: ");
	    float altu = sc.nextFloat();
	    float area = (base*altu)/2;
	    System.out.print("A Área do triangulo é "+area);

	}

}