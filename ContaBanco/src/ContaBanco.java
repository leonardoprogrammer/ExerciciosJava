import java.util.Scanner;

public class ContaBanco {
	//Atributos
	public int numConta;
	protected String tipo;
	private String dono;
	private float saldo;
	private boolean status;
	
	public void estadoAtual() {
		System.out.println("------------------------");
		System.out.println("Conta: " + this.getNumConta());
		System.out.println("Tipo: " + this.getTipo());
		System.out.println("Dono: " + this.getDono());
		System.out.println("Saldo: " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("------------------------");
	}
	
	// Método Construtor
	public ContaBanco() {
		//this.status = false;
		//this.saldo = 0;
		this.setStatus(false);
		this.setSaldo(0);
	}
	
	// Métodos
	public void abrirConta(String t) {
		this.setTipo(t);
		this.setStatus(true);
		
		if (t == "CC") {
			this.setSaldo(50);
		}
		else if (t == "CP") {
			this.setSaldo(150);
		}
		System.out.println("Conta aberta.");
	}
	
	public void fecharConta() {
		if (this.getSaldo() > 0) {
			System.out.println("Conta com dinheiro.");
		}
		else if (this.getSaldo() < 0){
			System.out.println("Conta em dédito.");
		}
		else {
			this.setStatus(false);
		}
	}
	
	public void depositar(float v) {
		if (this.getStatus() == true) {
			//this.saldo = this.saldo + v;
			this.setSaldo(this.getSaldo() + v);
			System.out.println("Depositado na conta de " + this.getDono());
		}
		else {
			System.out.println("Conta fechada.");
		}
	}
	
	public void sacar(float v) {
		if (this.getStatus() == true) {
			if (this.getSaldo() >= v) {
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Saque realizado na conta de " + this.getDono());
			}
			else {
				System.out.println("Saldo insuficiente.");
			}
		}
		else {
			System.out.println("Conta não está aberta.");
		}
	}
	
	public void pagarMensal() {
		int v = 0;
		
		if (this.getTipo() == "CC") {
			v = 12;
		}
		else if (this.getTipo() == "CP") {
			v = 20;
		}
		
		if (this.getStatus() == true) {
			if (this.getSaldo() > v) {
				//this.saldo = this.saldo - v;
				this.setSaldo(this.getSaldo() - v);
				System.out.println("Mensalidade paga por " + this.getDono());
			}
			else {
				System.out.println("Sem saldo para pagar mensalidade.");
			}
		}
		else {
			System.out.println("Impossível pagar uma conta fechada.");
		}
	}
	
	// Get e Set
	public int getNumConta() {
		return this.numConta;
	}
	
	public void setNumConta(int n) {
		this.numConta = n;
	}
	
	public String getTipo() {
		return this.tipo;
	}
	
	public void setTipo(String t) {
		this.tipo= t;
	}
	
	public String getDono() {
		return this.dono;
	}
	
	public void setDono(String d) {
		this.dono = d;
	}
	
	public float getSaldo() {
		return this.saldo;
	}
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public boolean getStatus() {
		return this.status;
	}
	
	public void setStatus(boolean st) {
		this.status = st;
	}

}
