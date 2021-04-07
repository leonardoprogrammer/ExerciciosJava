package loja;

public class LojaDeBebidas {
	
	public static void main(String[] args) {
		int qtItens = 10;
		Bebida b[] = new Bebida[10];
		
		Cliente c = new Cliente("Leonardo", 18, "546288388", "43478116830", "Tabapuã");
		
		b[0] = new Bebida("Coca-Cola", 0.600f, 4.50f);
		b[1] = new Bebida("Fanta", 0.500f, 4.00f);
		b[2] = new Bebida("Kuat", 0.450f, 4.50f);
		b[3] = new Bebida("Monster", 0.500f, 7.99f);
		b[4] = new Bebida("TNT", 0.600f, 7.50f);
		b[5] = new Bebida("Heineken", 0.330f, 2.90f);
		b[6] = new Bebida("Brahma", 0.350f, 3.00f);
		b[7] = new Bebida("Skol", 0.350f, 2.80f);
		b[8] = new Bebida("Kadov", 1.00f, 26.99f);
		b[9] = new Bebida("Smirnoff", 0.600f, 19.90f);
		
		
		b[4].addBebida(4);
		b[5].addBebida(2);
		b[4].addBebida(1);
		
		int itensCarrinho = 0;
		float total = 0;
		
		// FINALIZA COMPRA
		
		System.out.println("-------------------------");
		System.out.println("Cliente: " + c.getNome() + " - " + c.getIdade() + " anos");
		System.out.println("RG: " + c.getRg());
		System.out.println("CPF: " + c.getCpf());
		System.out.println("Destino: " + c.getEndereco());
		System.out.println("");
		
		for (int i=0; i<10; i++) {
			float aux = 0;
			if (b[i].getQtCarrinho() > 0) {
				aux = b[i].getQtCarrinho() * b[i].getPreco();
				total = total + aux;
				System.out.println(b[i].getQtCarrinho() + " x " + b[i].getNome() + " [" + b[i].getLitros() + "lt] (R$" + b[i].getPreco() + ")");
				System.out.println("  = R$" + aux);
				System.out.println("");
				itensCarrinho++;
				c.contabilizarBebida(b[i].getQtCarrinho());
			}
		}
		
		if (itensCarrinho > 0) {
			System.out.println("Total: R$ " + total);
			System.out.println("COMPRA FINALIZADA!");
			System.out.println(c.getNome() + " já comprou " + c.getBebidasCompradas() + " bebida(s).");
		}
		else {
			System.out.println("Não há itens no carrinho.");
		}
		System.out.println("-------------------------");
		
	}

}
