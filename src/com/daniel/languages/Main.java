package com.daniel.languages;
// by putting .*, we import every resource from that package -- which in this case is fine
import com.daniel.languages.models.*;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Language english = new Language("English", 1000000000, "the Americas the UK, Australia, and many more areas", "subject-verb-object");
		english.getInfo();
		
		System.out.println();
		
		Mayan kiche = new Mayan("K'iche'", 1700000);
		kiche.getInfo();
		
		System.out.println();
		
		SinoTibetan mandarin = new SinoTibetan("Mandarin Chinese", 1300000000);
		mandarin.getInfo();
	}

}
