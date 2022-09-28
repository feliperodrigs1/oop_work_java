package CSGO;

import java.util.ArrayList;
import java.util.List;

public class Loja {
	private String nome;
	private String lado;
	private List<Item> items = new ArrayList<Item>();
	
	public Loja(String nome, String lado) {
		this.nome = nome;
		this.lado = lado;
		AtribuirItems();
	}
	
	private void AtribuirItems() {		
		if (this.lado == "CT") 
		{
			Item item = new Item("AUG", "Dano alto, rifle com lente de aproximacao", 3300.00, "30/90");
			items.add(item);
			item = new Item("Desert Eagle", "Dano alto, pistola de eco", 700.00, "7/35");
			items.add(item);
		}
		
		else 
		{
			Item item = new Item("AK-47", "Dano alto, rifle principal",2700.00, "30/90");
			items.add(item);
			item = new Item("Desert Eagle", "Dano alto, pistola de eco", 700.00, "7/35");
			items.add(item);
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLado() {
		return lado;
	}

	public void setLado(String lado) {
		this.lado = lado;
	}

	public List<Item> getItems() {
		return items;
	}

	public void setItems(List<Item> items) {
		this.items = items;
	}	
}
