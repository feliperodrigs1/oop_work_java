package CSGO;

import java.util.ArrayList;
import java.util.List;

public class Partida {
	private String mapa;
	private int pontosT1 = 0;
	private int pontosT2 = 0;
	private String resultado;
	List<Time> times = new ArrayList<Time>();
	
	public Partida(String mapa, List<Time> times) {		
		this.mapa = mapa;
		this.times = times;
		setLado();
	}
	
	public void setLado() {		
		Loja loja = new Loja("Contra-Terrorista","CT");	
		for (Time time : times) 
		{	
			time.setLoja(loja);
			loja = new Loja("Terrorista","TR");
		}
	}
	
	public void trocaLado() {		
		Loja loja = new Loja("Terrorista","TR");
		for (Time time : times) 
		{	
			time.setLoja(loja);
			loja = new Loja("Contra-Terrorista","CT");
		}
	}
		
	public String getMapa() {
		return mapa;
	}
	
	public void setMapa(String mapa) {
		this.mapa = mapa;
	}
	
	public int getPontosT1() {
		return pontosT1;
	}
	
	public void setPontosT1(int pontosT1) {
		this.pontosT1 = pontosT1;
	}
	
	public int getPontosT2() {
		return pontosT2;
	}
	
	public void setPontosT2(int pontosT2) {
		this.pontosT2 = pontosT2;
	}
	
	public String getResultado() {
		return resultado;
	}
	
	public void setResultado(String resultado) {
		this.resultado = resultado;
	}
	
	public List<Time> getTimes() {
		return times;
	}
	
	public void setTimes(List<Time> times) {
		this.times = times;
	}
}
