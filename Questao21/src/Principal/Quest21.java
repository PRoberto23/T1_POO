package Principal;

import javax.swing.JOptionPane;
import java.math.BigDecimal;
import java.lang.Double;

public class Quest21 {
	public static void main(String[] args){
		
		String textPergunta1;
		String textPergunta2;
		String textSaida;
		
		double tamanhoEscada;
		double alturaPrego;
		double diferençaEscada;
		double resposta;
		double controlador;
		
		JOptionPane.showMessageDialog(null, "Olá, vou te ajudar a saber a que distância sua escada deve "
				+ "ficar para colocar seu prego."
				+ "\n As medidas colocadas devem estar em metros. ");
		
		do {
		textPergunta1 = JOptionPane.showInputDialog("Digite o tamanho da escada que você irá usar:");
		tamanhoEscada  = Double.parseDouble(textPergunta1);
		
		textPergunta2 = JOptionPane.showInputDialog("Digite a altura em que deseja pregar seu prego:");
		alturaPrego = Double.parseDouble(textPergunta2);
		
		resposta = Math.pow(tamanhoEscada, 2) - Math.pow(alturaPrego, 2);
		resposta  = Math.sqrt(resposta);
		resposta = (double)(Math.round(resposta * 100.0)/100.0);
		
		if(alturaPrego<tamanhoEscada) {
			JOptionPane.showMessageDialog(null, "A distância que a escada deve fica da parede é de: " + resposta + " metros");
		}
		else {
			diferençaEscada = (alturaPrego - tamanhoEscada)+0.1 ;
			diferençaEscada  = (double) (Math.round(diferençaEscada*10.0)/10.0);
			JOptionPane.showMessageDialog(null, "Sua escada é muito pequena, escolha uma escada no mínimo " + diferençaEscada + " metros maior");
		}
		
		textSaida = JOptionPane.showInputDialog(null, "Deseja realizar outro cáculo? Se sim, digite [0]"
				+ "\nSe não, basta digitar [1] ");
		controlador = Double.parseDouble(textSaida);
		
		}while(controlador == 0);
		if(controlador == 1) {
		JOptionPane.showMessageDialog(null, "Isso é tudo pessoal!!!");
		}
		else {
			JOptionPane.showMessageDialog(null, "ERROR!!!"
					+ "\nREINICIE O PROGRAMA!");
		}
	}

}