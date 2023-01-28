package no.hvl.data102.klient;

import no.hvl.dat102.Film;
import no.hvl.dat102.Film.Sjanger;
import no.hvl.dat102.Filmarkiv;
import no.hvl.data102.adt.FilmarkivADT;
import static javax.swing.JOptionPane.*;

public class Tekstgrensesnitt {

	// lese opplysningene om en FILM fra tastatur
	public Film lesFilm() {
		int filmnr = Integer.parseInt(showInputDialog("Gi meg en filmnr: "));
		String direktor = showInputDialog("Gi meg en direktor: ");
		String tittel = showInputDialog("Gi meg en tittel: ");
		int lansering = Integer.parseInt(showInputDialog("Gi meg lanseringstid: "));
		String selskap = showInputDialog("Gi meg selskapet: ");
		Sjanger sjang = Sjanger.valueOf(showInputDialog("Gi meg en sjang: "));

		Film brukerfilm = new Film(filmnr, direktor, tittel, lansering, selskap, sjang);

		return brukerfilm;
	}

	// vise en film med alle opplysninger på skjerm (husk tekst for sjanger)
	public void visFilm(Film film) {
		
		film.skrivut(film);
		
	}

	// Skrive ut alle Filmer med en spesiell delstreng i tittelen
	public void skrivUtFilmDelstrengITittel(FilmarkivADT filma, String delstreng) {
		
		System.out.print(filma.soekTittel(delstreng));
	
		
	}

	// Skriver ut alle Filmer av en produsent / en gruppe
	public void skrivUtFilmProdusent(FilmarkivADT filma, String delstreng) {
		// TODO Denne gjør tilsvarende som metoden over
		System.out.print(filma.soekTittel(delstreng));
		
	}

	// Skrive ut en enkel statistikk som inneholder antall Filmer totalt
	// og hvor mange det er i hver sjanger
	public void skrivUtStatistikk(FilmarkivADT filma) {
		// TODO
		System.out.println("Total filmer er : " + filma.antall());
		System.out.println("Total filmer for Action: " + filma.antall(Sjanger.ACTION));
		System.out.println("Total filmer for Drama: " + filma.antall(Sjanger.DRAMA));
		System.out.println("Total filmer for History: " + filma.antall(Sjanger.HISTORY));
		System.out.println("Total filmer for SciFi: " + filma.antall(Sjanger.SCIFI));
	    
		
		
	}
	// ... Ev. andre metoder
}
