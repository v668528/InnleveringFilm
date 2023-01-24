package no.hvl.data102.adt;


import no.hvl.dat102.Film;
import no.hvl.dat102.Film.Sjanger;

public interface FilmarkivADT<F> {

	/**
	 * Hente en film med gitt nr fra arkivet
	 * 
	 * @param nr nummer på film som skal hentes
	 * @return film med gitt nr. Om nr ikke finnes, returneres null.
	 */
	
	F finnFilm(int nr);
	
	/**
	 * Legger til en ny film.
	 * @param nyFilm
	 */
	
	
	void leggTilFilm (F nyFilm);
	
	/**
	 * Sletter en fil med gitt
	 * @param filmnr nr på film som skal slettes
	 * @return true dersom filmen ble slettet, false ellers
	 */
	
	boolean slettFilm(int filmnr);
	/**
	 * Søker og henter Filmer med en gitt delstreng i tittelen. 
     * @param delstreng som må være i tittel 
     * @return tabell med filmer som har delstreng i tittel
	 */
	
	F[] soekTittel(String delstring);
	/** 
	  * Finner antall filmer med gitt sjanger 
	  * @param sjanger  
	  * @return antall filmer av gitt sjanger. 
	  */ 
	
	int antall (Sjanger sjanger);
	
	/** 
	  *  
	  * @return antall filmer i arkivet 
	  */ 
	int antall();

	
	String skrivut(Film film);
	/**
	 * Skrive ut på skjermen elementene som finnes i en film
	 * @return opplysninger om en film 
	 */
	


}
