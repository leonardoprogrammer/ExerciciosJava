
public class Cliente {
	private String nome;
	private int idade;
	private long cpf;
	private float saldo;
	private boolean status;
	private int carroAlugado;
	
	public void dados() {
		System.out.println("---------------------------");
		System.out.println("Nome: " + this.getNome());
		System.out.println("Idade: " + this.getIdade());
		System.out.println("CPF: " + this.getCpf());
		System.out.println("Saldo: R$ " + this.getSaldo());
		System.out.println("Status: " + this.getStatus());
		System.out.println("Carro alugado: " + this.getCarroAlugado());
		System.out.println("---------------------------");
	}
	
	//Método construtor
	public Cliente() {
		this.setSaldo(0);
		this.setStatus(true);
		this.setCarroAlugado(0);
	}
	
	// MÉTODOS
	public void cadastrarCliente(String n, int i, long c) {
		this.setNome(n);
		this.setIdade(i);
		this.setCpf(c);
		this.setSaldo(0);
		this.setCarroAlugado(0);
		this.verificaStatus();
		
		System.out.println("Novo cliente cadastrado!");
	}
	
	public void verificaStatus() {
		if (this.getSaldo() <= 0) {
			this.setStatus(false);
		}
		else if (this.getSaldo() > 0) {
			this.setStatus(true);
		}
	}
	
	public void adicionaSaldo(float v) {
		if (v > 0) {
			this.setSaldo(this.getSaldo() + v);
		}
		else {
			System.out.println("Valor precisa ser maior que 0.");
		}
		this.verificaStatus();
	}
	
	public boolean alugaCarro(float valor, boolean alugado, int carro) {
		boolean aprovado = false;
		if (this.getStatus() == true) {
			if (alugado == false) {
				if (this.getSaldo() >= valor) {
					this.setSaldo(this.getSaldo() - valor);
					this.setCarroAlugado(carro);
					aprovado = true;
				}
				else {
					System.out.println("Saldo insfuciente para alugar este carro.");
				}
			}
			else {
				System.out.println("Este carro já está alugado!");
			}
		}
		else {
			System.out.println(this.getNome() + " não está liberado alugar um carro!");
		}
		return aprovado;
	}
	
	// GETTERS e SETTERS
	public String getNome() {
		return nome;
	}
	
	public void setNome(String n) {
		this.nome = n;
	}
	
	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int i) {
		this.idade = i;
	}
	
	public long getCpf() {
		return cpf;
	}
	
	public void setCpf(long c) {
		this.cpf = c;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public boolean getStatus() {
		return status;
	}
	
	public void setStatus(boolean st) {
		this.status = st;
	}
	
	public int getCarroAlugado() {
		return carroAlugado;
	}
	
	public void setCarroAlugado(int ca) {
		this.carroAlugado = ca;
	}

}
