package no.hvl.dat102;

import no.hvl.data102.Film;

public class Film {

	private int filmnr;
	private String produsent;
	private String tittel;
	private int lansering;
	private String selskap;
	private static Sjanger sjanger;
	
 public enum Sjanger {
	 ACTION,DRAMA,HISTORY,SCIFI; 
 }
 
 public Film() {
	this(0,"","",0,"", sjanger);
 }
 
 public Film (int filmnr,String produsent,String tittel,int lansering,String selskap,Sjanger sjanger) {
	 this.filmnr = filmnr;
	 this.produsent = produsent;
	 this.tittel = tittel;
	 this.lansering = lansering;
	 this.selskap = selskap;
	 this.sjanger = sjanger;
 }

public int getFilmnr() {
	return filmnr;
}

public void setFilmnr(int filmnr) {
	this.filmnr = filmnr;
}

public String getProdusent() {
	return produsent;
}

public void setProdusent(String produsent) {
	this.produsent = produsent;
}

public String getTittel() {
	return tittel;
}

public void setTittel(String tittel) {
	this.tittel = tittel;
}

public int getLansering() {
	return lansering;
}

public void setLansering(int lansering) {
	this.lansering = lansering;
}

public String getSelskap() {
	return selskap;
}

public void setSelskap(String selskap) {
	this.selskap = selskap;
}

public static Sjanger getSjanger() {
	return sjanger;
}

public static void setSjanger(Sjanger sjanger) {
	Film.sjanger = sjanger;
}
 
public String skrivut(Film film) {
	return "Produsent: " + film.getProdusent() + "/n" +
           "Tittel: " + film.getTittel() + "/n" +
			"Lansering: " + film.getLansering() + "/n" +
           "Selskap: " + film.getSelskap() + "/n" + 
			"Sjange: " + film.getSjanger();
}

@Override
public boolean equals(Object andre) {
	if (this == andre) {
		return true;
	}
	if (andre == null) {
		return false;

	}
	if (getClass() != andre.getClass()) {
		return false;
	}
	Film denAndre = (Film) andre;
	boolean like = this.filmnr == denAndre.getFilmnr();
	return like;
}

@Override
public int hashCode() {
	Integer temp = filmnr;
	return temp.hashCode();
}




}
