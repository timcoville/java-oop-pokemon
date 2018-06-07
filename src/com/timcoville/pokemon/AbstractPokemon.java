package com.timcoville.pokemon;

public abstract class AbstractPokemon implements PokeInterface{
	String name;
	int health;
	String type;
	
	public Pokemon createPokemon(String name, int health, String type) {
		return new Pokemon(name, health, type);
	}
	
	public void attackPokemon(Pokemon pokemon) {
		pokemon.setHealth(pokemon.getHealth()-10);
	}
}
