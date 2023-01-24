package no.hvl.dat102;

import no.hvl.dat102.Film.Sjanger;
import no.hvl.data102.adt.FilmarkivADT;

public class Filmarkiv<F> implements FilmarkivADT<F> {

	private F[] filmer;
	private int antall;
	
	
	public Filmarkiv(int start) {
		antall = 0;
		filmer = (F[]) (new Object[start]);
	}

	
	private Film[] trimTab(Film[] tab, int n) { 
		  // n er antall elementer 
		  Film[] nytab = new Film[n]; 
		  int i = 0; 
		  while (i < n) { 
		   nytab[i] = tab[i]; 
		   i++; 
		  } 
		  return nytab; 
		 } 

	private void utvidKapasitet() {
		F[] utvidarkiv = (F[]) (new Object[2*filmer.length]);
		for (int i = 0 ; i < filmer.length ; i++) {
			utvidarkiv[i] = filmer[i];
		}
		
		utvidarkiv = filmer;
	}
	
	@Override
	public F finnFilm(int nr) {
		F svar = null;
		
		for (int i = 0 ; i < antall ; i++) {
			if (filmer[i].equals(nr)) {
				svar = filmer[nr];
			}
		}
		
		return svar;
	}


	@Override
	public void leggTilFilm(F nyFilm) {
	  if (antall == filmer.length) {
		  utvidKapasitet();
	  }
	  filmer[antall] = nyFilm;
	  antall++;
		  
		
	}


	@Override
	public boolean slettFilm(int filmnr) {
		boolean svar = false;
		for (int i = 0 ; i < antall ; i++) {
			if (filmer[i].equals(filmnr)) {
				filmer[i] = filmer[antall-1];
				filmer[antall-1] = null;
				svar = true;
			}
		}
		return svar;
		
	}


	@Override
	public F[] soekTittel(String delstring) {
	F[] nybag = (F[]) new Object[antall];
	for (int i = 0 ; i < filmer.length ; i++) {
		if (filmer[i].equals(delstring)) {
			nybag[i] = filmer[i];
		}
	}
	return nybag;
	
	}


	@Override
	public int antall(Sjanger sjanger) {
		int ant = 0;
	     for (int i = 0; i < filmer.length ; i++) {
	    	 if (filmer[i].equals(sjanger)) {
	    		 ant = filmer.length;
	    	 }
	     }
	     
	     return ant;
	}


	@Override
	public int antall() {
		return antall;
	}


	@Override
	public String skrivut(Film film) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	
}
