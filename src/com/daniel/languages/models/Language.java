package com.daniel.languages.models;

public class Language {
	protected String name;
	protected int numSpeakers;
	protected String regionsSpoken;
	protected String wordOrder;

	public Language(String pName, int pNumSpeakers, String pRegionsSpoken, String pWordOrder) {
		name = pName;
		numSpeakers = pNumSpeakers;
		regionsSpoken = pRegionsSpoken;
		wordOrder = pWordOrder;
	}
	
	public void getInfo() {
		StringBuilder sb = new StringBuilder(String.format("%s is spoken by %d people mainly in %s\n", name, numSpeakers, regionsSpoken));
		sb.append(String.format("The language follows the word order: %s", wordOrder));

		System.out.println(sb.toString());
	}
}
