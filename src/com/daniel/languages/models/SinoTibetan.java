package com.daniel.languages.models;

public class SinoTibetan extends Language {

	public SinoTibetan(String pName, int pNumSpeakers) {
		// Must use a super's constructor unless there is an empty one available
		super(pName, pNumSpeakers, "Asia", pName.contains("Chinese") ? "subject-verb-object" : "subject-object-verb");
	}

}
