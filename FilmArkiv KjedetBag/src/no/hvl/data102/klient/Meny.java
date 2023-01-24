package no.hvl.data102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Film.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Meny {

	private Tekstgrensesnitt tekstgr;
	private FilmarkivADT filmarkiv;

	public Meny(FilmarkivADT filmarkiv) {
		tekstgr = new Tekstgrensesnitt();
		this.filmarkiv = filmarkiv;
	}

	public void start() {
		// legg inn en del forhåndsdefinerte filmer for å teste metodene
		
	   Film Toy = new Film(1,"Larry Samuel","Toy Story",2001,"Disney",Sjanger.ACTION);
	   filmarkiv.leggTilFilm(Toy);
	   
		
	}

	
}
