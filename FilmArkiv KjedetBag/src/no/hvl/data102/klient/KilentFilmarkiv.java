package no.hvl.data102.klient;

import no.hvl.dat102.Filmarkiv;
import no.hvl.data102.adt.FilmarkivADT;

public class KilentFilmarkiv {

	public static void main(String[] args) {

		FilmarkivADT filma = new Filmarkiv(100);
		Meny meny = new Meny(filma);
		meny.start();
	}

}
