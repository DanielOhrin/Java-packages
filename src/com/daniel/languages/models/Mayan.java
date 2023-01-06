package com.daniel.languages.models;

public class Mayan extends Language {
	public Mayan(String pName, int pNumSpeakers) {
		// Must use a super's constructor unless there is an empty one available
		super(pName, pNumSpeakers, "Central America", "verb-object-subject");
	}
	
	@Override
	public void getInfo() {
		StringBuilder sb = new StringBuilder(String.format("%s is spoken by %d people mainly in %s.\n", name, numSpeakers, regionsSpoken));
		sb.append(String.format("The languages follows the word order: %s\n", wordOrder));
		sb.append(String.format("Fun fact: %s is a Mayan language.", name));
		
		System.out.println(sb.toString());
		
	}
}
