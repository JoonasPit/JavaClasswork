package lisääläksyjä;

import java.text.DecimalFormat;

public class Tyontekija extends Henkilo {
	
	DecimalFormat df = new DecimalFormat("0.0");
	
	private double tuntipalkka;
	
	public Tyontekija() {
		super();
		tuntipalkka = 0;
	}
	public Tyontekija(String nimi, String osoite, double height, int weight ,double tuntipalkka) {
		super(nimi, osoite, height, weight);
		tuntipalkka = this.tuntipalkka;
	}
	
	
	public void setTuntipalkka(double tuntipalkka) {
		this.tuntipalkka = tuntipalkka;
	}
	
	public double getTuntipalkka() {
		return tuntipalkka;
	}
	
	public String toString() {
		return "Nimi: "+ super.getNimi() + "Osoite: " + super.getOsoite()+ " Tuntipalkka: "  + tuntipalkka;
	}
	
	
}
