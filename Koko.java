public class Koko {
	private double pituus;
	private double paino;
	private double bmi;
	
	public Koko() {
		pituus = 0;
		paino = 0;
		bmi = 0;
	}
	public Koko(double pituus, double paino) {
		this.pituus = pituus;
		this.paino = paino;
	}
	
	public void setPituus(double pituus) {
		this.pituus = pituus;
	}
	public void setPaino(double paino) {
		this.paino = paino;
	}
	
	public double getPituus() {
		return pituus;
	}
	public double getPaino() {
		return paino;
	}
	private double countbmi() {
		//private makes it so that the function can only called inside this class
		//private makes it so I can call this function also in Koko.java
		bmi = paino/(pituus*pituus);
		return bmi;
	}
	
	public String toString() {
		return "Pituus: " + pituus + "\nPaino: " + paino + "\nBMI: ";
	}
	public double getBMI() {
		//counts the userbmi and returns the value
		bmi = countbmi();
		return bmi;
	}
		

}
