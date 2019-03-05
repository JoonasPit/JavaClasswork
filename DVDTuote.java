package lisääläksyjä;

public class DVDTuote extends Tuote {

	private int length;
	private String ageFor;
	
	public DVDTuote() {
		super();
		length = 0;
		ageFor = "";
	}
	
	public DVDTuote(String nimi, double hinta, int length, String ageFor) {
		super(nimi, hinta);
		this.length = length;
		this.ageFor = ageFor;
	}
	
	public void setLength(int length) {
		this.length = length;
	}
	
	public void setAgeFor(String ageFor) {
		this.ageFor = ageFor;
	}
	
	public int getLength() {
		return length;
	}
	public String getAgeFor() {
		return ageFor;
	}
	
	public String toString() {
		return "Tuotekoodi: " + super.getTuotenro() + "\nNimi: " + super.getNimi() + "\nHinta: "  + super.getHinta() + 
				 "\nKesto(min): " + length + "\nIkäsuositus: " + ageFor;
	}
}
