package CSGO;

import java.util.ArrayList;
import java.util.Dictionary;
import java.util.Hashtable;
import java.util.List;
import java.util.Random;


public class Campeonato {
	private final String nomeCampeonato;
	private final Double premiacao;
	private String vencedor;
	private String sede;
	private final int pontosGanhos;
	List<Partida> partidas = new ArrayList<Partida>();
	
	public Campeonato(String nomeCampeonato, Double premiacao, String sede, int pontosGanhos, String mapa, List<Time> times) {		
		this.nomeCampeonato = nomeCampeonato;
		this.premiacao = premiacao;		
		this.sede = sede;
		this.pontosGanhos = pontosGanhos;
		Partida partida = new Partida(mapa, times);
		partidas.add(partida);
	}

	public String getVencedor() {
		return vencedor;
	}

	public void setVencedor(String vencedor) {
		this.vencedor = vencedor;
	}

	public String getSede() {
		return sede;
	}

	public void setSede(String sede) {
		this.sede = sede;
	}

	public List<Partida> getPartidas() {
		return partidas;
	}

	public void setPartidas(String mapa, List<Time> times) {
		Partida partida = new Partida( mapa, times);
		partidas.add(partida);
	}

	public String getNomeCampeonato() {
		return nomeCampeonato;
	}

	public Double getPremiacao() {
		return premiacao;
	}

	public int getPontosGanhos() {
		return pontosGanhos;
	}
	
	public static Dictionary<Integer,String> dicionarioSede() {
		Dictionary<Integer,String > dict = new Hashtable<Integer,String>();  
				
		dict.put(1, "Brasil" );
		dict.put(2, "Estados Unidos");
		dict.put(3, "Azerbaijao");
		dict.put(4, "Mexico");
		dict.put(5, "Japao");
		dict.put(6, "Italia");
		dict.put(7, "Africa do Sul");
		dict.put(8, "Gana");
		dict.put(9, "Nova Guine");
		dict.put(10, "Catar");
		dict.put(11, "Australia");
		dict.put(12, "Trindade e Tobago");
				
		return dict;
	}
	
	public static String retornaSede() {
		Dictionary<Integer, String> dicSede = dicionarioSede();
		
		Random random = new Random();
		
		int x = random.nextInt(12);
		
		return dicSede.get(x);
	}		
}
