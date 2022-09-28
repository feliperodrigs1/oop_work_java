package CSGO;

import java.util.ArrayList;
import java.util.List;

public class main {

	public static void main(String[] args) {
		
		int i;
		Jogador jogador;		
		
		Time timeSharks = new Time("Sharks","Brasil");		
		for (i = 1; i < 6; i++) 
		{
			jogador = new Jogador("Jogador" + i, "Nick#" + i, 18 + i, String.valueOf(i), (100.00 * i));
			timeSharks.setJogadores(jogador);
		}
		
		Time timeCloud9 = new Time("Cloud9","Estados Unidos");
		for (i = 6; i < 11; i++) 
		{
			jogador = new Jogador("Jogador" + i, "Nick#" + i, 18 + i, String.valueOf(i), (300.00 * i));
			timeCloud9.setJogadores(jogador);
		}
		
		List<Time> times = new ArrayList<Time>();
		times.add(timeCloud9);
		times.add(timeSharks);				
		
		Campeonato campeonato = new Campeonato("Campeonato CS:GO", 100000.00, Campeonato.retornaSede(), 100, "Mirage", times);
		
		campeonato.setPartidas("Dust 2", times);
		
		System.out.println("Campeonato: " + campeonato.getNomeCampeonato());
		System.out.println("Premiacao: $" + campeonato.getPremiacao());
		System.out.println("Sede: " + campeonato.getSede());
		System.out.println("Valendo " + campeonato.getPontosGanhos() + " pontos");	
		System.out.println(" ");
		System.out.println("--------------------Partidas-------------------");
		System.out.println(" ");
		
		List<Partida> partidas = campeonato.getPartidas();
		for (Partida partida : partidas) 
		{			
			System.out.println("Mapa: " + partida.getMapa());
			System.out.println(" ");
			System.out.println("----------------------------------------------");
			System.out.println(" ");
			
			times = partida.getTimes();
			
			for (Time time : times) 
			{
				System.out.println("Time: " + time.getNome());
				System.out.println("Pais: " + time.getPais());
				System.out.println("Quantidade Jogadores: " + time.getQtdJogadores());
				System.out.println(" ");
				
				List<Jogador> jogadores = new ArrayList<Jogador>();
				jogadores = time.getJogadores();
				
				for (Jogador _jogador : jogadores) 
				{
					System.out.println("Nome: " + _jogador.getNome());
					System.out.println("Nick: " + _jogador.getNickname());
					System.out.println("Idade: " + _jogador.getIdade());
					System.out.println("Posicao: " + _jogador.getPosicao());								
					System.out.println(" ");
				}
				
				System.out.println("--------------------Loja-------------------");
				System.out.println(" ");
				System.out.println("Lado: " + time.getLoja().getLado());
				System.out.println("Item: " + time.getLoja().getNome());
				System.out.println(" ");
				System.out.println("--------------------Itens-------------------");
				System.out.println(" ");
				
				for (Item item : time.getLoja().getItems()) 
				{
					System.out.println("Item: " + item.getNome());
					System.out.println("Descricaoo: " + item.getDescricao());
					System.out.println("Municaoo: " + item.getMunicao());
					System.out.println("Preco: $" + item.getPreco());
					System.out.println(" ");
				}		
				
				System.out.println("----------------------------------------------");
				System.out.println(" ");				
			}
			
			partida.trocaLado();
		}		
	}
}
