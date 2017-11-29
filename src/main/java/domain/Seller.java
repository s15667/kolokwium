package domain;

public class Seller implements IHaveId{
	private int id;
	private String name;
	private SellerType sellerType;
	private String phone;
	private String email;
	
	public Seller(){}
	
	public Seller(String name, SellerType sellerType, String phone, String email){
		this.name = name;
		this.sellerType = sellerType;
		this.phone = phone;
		this.email = email;
	}
	
	public int getId(){
		return id;
	}
	public void setId(int id){
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public SellerType getSellerType() {
		return sellerType;
	}
	public void setSellerType(SellerType sellerType) {
		this.sellerType = sellerType;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
}
