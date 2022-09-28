package CSGO;

public class Jogador {
	private final String nome;
	private String nickname;
	private int idade;
	private String posicao;
	private Double salario = 00.00;	
	
		
	public Jogador(String nome, String nickname, int idade, String posicao, Double salario) {
		this.nome = nome;
		this.nickname = nickname;
		this.idade = idade;
		this.posicao = posicao;
		this.salario = salario;		
	}

	public String getNickname() {
		return nickname;
	}

	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getPosicao() {
		return posicao;
	}

	public void setPosicao(String posicao) {
		this.posicao = posicao;
	}

	public Double getSalario() {
		return salario;
	}

	public void setSalario(Double salario) {
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}		
}
