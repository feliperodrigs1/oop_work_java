package CSGO;

import java.util.ArrayList;
import java.util.List;

public class Time {
	private String nome;
	private String pais;
	private final int qtdJogadores = 5;
	private Loja loja;
	List<Jogador> jogadores = new ArrayList<Jogador>();	
	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getPais() {
		return pais;
	}

	public void setPais(String pais) {
		this.pais = pais;
	}

	public List<Jogador> getJogadores() {
		return jogadores;
	}

	public void setJogadores(Jogador jogador) {
		this.jogadores.add(jogador);
	}

	public int getQtdJogadores() {
		return qtdJogadores;
	}

	public Time(String nome, String pais) {		
		this.nome = nome;
		this.pais = pais;		
	}
	
	public Loja getLoja() {
		return loja;
	}
	
	public void setLoja(Loja loja) {
		this.loja = loja;
	}	
}
