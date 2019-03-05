package lisääläksyjä;

public class KirjaTuote extends Tuote {
	private int pageamt;
	private String sidosAsu;
	
	public KirjaTuote() {
		super();
		pageamt = 0;
		sidosAsu = "";
	}
	
	public KirjaTuote(String nimi, double hinta, int pageamt, String sidosAsu) {
		super(nimi, hinta);
		this.pageamt = pageamt;
		this.sidosAsu = sidosAsu;
	}
	
	public void setAmt(int pageamt) {
		this.pageamt = pageamt;
	}
	
	public void setSidosAsu(String sidosAsu) {
		this.sidosAsu = sidosAsu;
	}
	
	public int getAmt() {
		return pageamt;
	}
	public String getSidosAsu() {
		return sidosAsu;
	}
	
	public String toString() {
		return "Tuotekoodi: " + super.getTuotenro() + "\nNimi: " + super.getNimi() + "\nHinta: "  + super.getHinta() + 
			 "\nSivumäärä: " + pageamt + "\nSidosasu: " + sidosAsu;
	}
	
	
}
