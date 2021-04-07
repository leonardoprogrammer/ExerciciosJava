package loja;

public class Cliente extends Pessoa {
	protected String cartao;
	protected float saldo;
	protected int bebidasCompradas;
	
	// Métodos Públicos
	public void contabilizarBebida(int qtdBebida) {
		this.setBebidasCompradas(this.getBebidasCompradas() + qtdBebida);
	}
	
	public void alterarCartao(String altCartao) {
		this.setCartao(altCartao);
	}
	
	public void adicionarSaldo(float addSaldo) {
		this.setSaldo(this.getSaldo() + addSaldo);
	}
	
	public void debitarSaldo(float debito) {
		this.setSaldo(this.getSaldo() - debito);
	}
	
	
	
	// Métodos Especiais
	public Cliente(String no, int id, String rg, String cpf, String en) {
		this.nome = no;
		this.idade = id;
		this.rg = rg;
		this.cpf = cpf;
		this.endereco = en;
		this.bebidasCompradas = 5;
	}

	public String getCartao() {
		return cartao;
	}

	private void setCartao(String cartao) {
		this.cartao = cartao;
	}

	public float getSaldo() {
		return saldo;
	}

	private void setSaldo(float saldo) {
		this.saldo = saldo;
	}

	public int getBebidasCompradas() {
		return bebidasCompradas;
	}

	private void setBebidasCompradas(int bebidasCompradas) {
		this.bebidasCompradas = bebidasCompradas;
	}
	
	

}
