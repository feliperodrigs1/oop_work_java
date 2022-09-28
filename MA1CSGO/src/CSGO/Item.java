package CSGO;

public class Item {
	private final String nome;
	private String descricao;
	private final Double preco;
	private String municao;
	
	public Item (String nome, String descricao, Double preco , String municao) {
		this.nome = nome;
		this.descricao = descricao;
		this.preco = preco;
		this.municao = municao;
	}
		
	public String getMunicao() {
		return municao;
	}

	public void setMunicao(String municao) {
		this.municao = municao;
	}

	public String getNome() {
		return nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public Double getPreco() {
		return preco;
	}		
}
