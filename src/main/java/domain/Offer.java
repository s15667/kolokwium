package domain;

public class Offer implements IHaveId{
	private int id;
	private String description;
	private float price;
	private String creationDate;
	private String expireDate;
	private int carId;
	private int sellerId;
	
	public Offer(){}
	
	public Offer(String description, float price, String creationDate, String expireDate, int carId, int sellerId){
		this.description = description;
		this.price = price;
		this.creationDate = creationDate;
		this.expireDate = expireDate;
		this.carId = carId;
		this.sellerId = sellerId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public float getPrice() {
		return price;
	}
	public void setPrice(float price) {
		this.price = price;
	}
	public String getCreationDate() {
		return creationDate;
	}
	public void setCreationDate(String creationDate) {
		this.creationDate = creationDate;
	}
	public String getExpireDate() {
		return expireDate;
	}
	public void setExpireDate(String expireDate) {
		this.expireDate = expireDate;
	}
	public int getCarId() {
		return carId;
	}
	public void setCarId(int carId) {
		this.carId = carId;
	}
	public int getSellerId() {
		return sellerId;
	}
	public void setSellerId(int sellerId) {
		this.sellerId = sellerId;
	}
	
}
