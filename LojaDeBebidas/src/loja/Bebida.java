package loja;

public class Bebida {
	private String nome;
	private float litros;
	private float preco;
	private int qtCarrinho;
	
	// M�todos P�blicos
	public void apresenta() {
		System.out.println(this.getNome() + " - " + this.getLitros() + "lt - " + this.getPreco());
	}
	
	public void addBebida(int qtd) {
		this.setQtCarrinho(this.getQtCarrinho() + qtd);
	}
	
	// M�todos Especiais
	public Bebida(String no, float li, float pr) {
		this.nome = no;
		this.litros = li;
		this.preco = pr;
		this.qtCarrinho = 0;
	}
	
	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public float getLitros() {
		return litros;
	}
	
	public void setLitros(float litros) {
		this.litros = litros;
	}
	
	public float getPreco() {
		return preco;
	}
	
	public void setPreco(float preco) {
		this.preco = preco;
	}

	public int getQtCarrinho() {
		return qtCarrinho;
	}

	public void setQtCarrinho(int qtCarrinho) {
		this.qtCarrinho = qtCarrinho;
	}

}
