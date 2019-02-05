package lisääläksyjä;

public class Auto {
	
	private String CarType, CarModel,LicensePlate;
	private int modelyear = 0;
	
	public Auto() {
		String CarType, CarModel,LicensePlate;
		int modelyear = 0;	
	}

	public Auto(String CarType,String CarModel,String LicensePlate, int modelyear) {
		this.CarType = CarType;
		this.CarModel = CarType;
		this.LicensePlate = LicensePlate;
		this.modelyear = modelyear;
	}
	
	public void setCarType(String CarType) {
		this.CarType = CarType;
	}
	public void setCarModel(String CarModel) {
		this.CarModel = CarModel;
	}
	public void setLicensePlate(String LicensePlate) {
		this.LicensePlate = LicensePlate;
	}
	public void setmodelyear(int modelyear) {
		this.modelyear = modelyear;
	}
	
	public String getCarType() {
		return CarType;
	}
	public String getCarModel() {
		return CarModel;
	}
	public String getLicensePlate() {
		String CapLetters = LicensePlate.substring(0).toUpperCase();
		return CapLetters;
	}
	public int getmodelyear() {
		return modelyear;
	}
		
	
}
