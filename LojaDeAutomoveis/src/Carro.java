
public class Carro {
	private String modelo;
	private String cor;
	private int ano;
	private String placa;
	private float valor;
	private boolean alugado;
	
	public void dados() {
		System.out.println("---------------------------");
		System.out.println("Modelo: " + this.getModelo());
		System.out.println("Cor " + this.getCor());
		System.out.println("Ano: " + this.getAno());
		System.out.println("Placa: " + this.getPlaca());
		System.out.println("Valor: " + this.getValor());
		System.out.println("Alugado: " + this.getAlugado());
		System.out.println("---------------------------");
	}
	
	//Método construtor
	public Carro() {
		this.setAlugado(false);
	}
	
	// MÉTODOS
	public void alugar() {
		this.setAlugado(true);
	}
	
	public void cadastrarCarro(String m, String c, int a, String p, float v) {
		this.setModelo(m);
		this.setCor(c);
		this.setAno(a);
		this.setPlaca(p);
		this.setValor(v);
		this.setAlugado(false);
		
		System.out.println("Novo carro cadastrado!");
	}
	
	public void removerCarro() {
		
	}
	
	//GETTERS e SETTERS
	public String getModelo() {
		return modelo;
	}
	
	public void setModelo(String m) {
		this.modelo = m;
	}
	
	public String getCor() {
		return cor;
	}
	
	public void setCor(String c) {
		this.cor = c;
	}
	
	public int getAno() {
		return ano;
	}
	
	public void setAno(int a) {
		this.ano = a;
	}
	
	public String getPlaca() {
		return placa;
	}
	
	public void setPlaca(String p) {
		this.placa = p;
	}
	
	public float getValor() {
		return valor;
	}
	
	public void setValor(float v) {
		this.valor = v;
	}
	
	public boolean getAlugado() {
		return alugado;
	}
	
	public void setAlugado(boolean al) {
		this.alugado = al;
	}

}
