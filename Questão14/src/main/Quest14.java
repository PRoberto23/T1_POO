package main;
import java.util.Scanner;
public class Quest14 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
        System.out.print("Digite seu ano de nacimento: ");
        int nasc = sc.nextInt();
        System.out.print("Digite o ano de agora: ");
        int ano = sc.nextInt();
        int resu = ano - nasc;
        int me = (ano - nasc)-1;
        int ano2 = 2035 - nasc;
        System.out.println("\nSua idade é "+ me + " ou " + resu +"!");
        System.out.println("\nSua idade em 2035 será "+ ano2 + "!");
        
	}
}