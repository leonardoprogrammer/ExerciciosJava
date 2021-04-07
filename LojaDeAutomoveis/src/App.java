import java.util.Scanner;

public class App {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int comando;
		Cliente p1 = new Cliente();
		p1.cadastrarCliente("Leonardo", 19, 434781168);
		p1.adicionaSaldo(10000);
		Carro c1 = new Carro();
		c1.cadastrarCarro("Lamborguini", "Preto", 2017, "LCS-0409", 5400);
		Carro c2 = new Carro();
		c2.cadastrarCarro("Porsche", "Vermelho", 2015, "EUA-2001", 3200);
		
		comando = 2;
		
		if (comando == 1) {
			boolean alugar;
			alugar = p1.alugaCarro(c1.getValor(), c1.getAlugado(), comando);
			if (alugar == true) {
				c1.alugar();
				System.out.println(p1.getNome()+" alugou o carro "+c1.getModelo()+".");
			}
		}
		else if (comando == 2) {
			boolean alugar;
			alugar = p1.alugaCarro(c2.getValor(), c2.getAlugado(), comando);
			if (alugar == true) {
				c2.alugar();
				System.out.println(p1.getNome()+" alugou o carro "+c2.getModelo()+".");
			}
		}
		
		
		p1.dados();
		
		switch (comando) {
		case 1:
			c1.dados();
			break;
		case 2:
			c2.dados();
			break;
		}
	}

}
