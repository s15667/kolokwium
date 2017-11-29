package domain;

public class Car implements IHaveId{
	private int id;
	private String brand;
	private String model;
	private int yearOfProduction;
	private int mileage;
	private CarType carType;
	
	public Car(){}
	
	public Car(String brand, String model, int yearOfProduction, int mileage, CarType carType){
		this.brand = brand;
		this.model = model;
		this.yearOfProduction = yearOfProduction;
		this.mileage = mileage;
		this.carType = carType;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public int getYearOfProduction() {
		return yearOfProduction;
	}
	public void setYearOfProduction(int yearOfProduction) {
		this.yearOfProduction = yearOfProduction;
	}
	public int getMileage() {
		return mileage;
	}
	public void setMileage(int mileage) {
		this.mileage = mileage;
	}
	public CarType getCarType() {
		return carType;
	}
	public void setCarType(CarType carType) {
		this.carType = carType;
	}
}
