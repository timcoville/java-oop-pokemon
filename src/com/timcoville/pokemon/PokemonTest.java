package com.timcoville.pokemon;

public class PokemonTest {
	public static void main(String[] args) {
		Pokedex pX = new Pokedex();
		Pokemon pikachu = pX.createPokemon("Pikachu", 100, "Electric");
		Pokemon eevee = pX.createPokemon("Eevee", 90, "Normal");
		Pokemon charizard = pX.createPokemon("Charizard", 130, "Flying, Fire");
		System.out.println(pX.pokemonInfo(pikachu));
		System.out.println(pX.pokemonInfo(eevee));
		System.out.println(pX.pokemonInfo(charizard));
		pX.attackPokemon(pikachu);
		System.out.println(pX.pokemonInfo(pikachu));
		pX.attackPokemon(pikachu);
		System.out.println(pX.pokemonInfo(pikachu));
		System.out.println(pikachu.getName());
	}
}
