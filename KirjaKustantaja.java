public class KirjaKustantaja {
	private String pubname;
	private String address;
	private String phonenum;

	
	public KirjaKustantaja() {
		pubname = "";
		address = "";
		phonenum  = "";
	}
	public KirjaKustantaja(String pubname, String address, String phonenum) {
		this.pubname = pubname;
		this.address = address;
		this.phonenum = phonenum;
	}
	
	public void setPubname(String pubname) {
		this.pubname = pubname;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public void setPhonenum(String phonenum) {
		this.phonenum = phonenum;
	}
	
	public String getPubname() {
		return pubname;
	}
	public String getAddress() {
		return address;
	}
	public String getPhonenum() {
		return phonenum;
	}
	public String toString() {
		return "Kustantajan nimi: " + pubname + "\nKustantajan osoite: " + address + 
				"\nKustantajan numero: " + phonenum;
	}
	
}
