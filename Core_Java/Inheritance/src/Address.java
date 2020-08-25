
public class Address {
	private String city_Name;
	private String state;
	private String pincode;
	public Address(String city_Name, String state, String pincode) {
		super();
		this.city_Name = city_Name;
		this.state = state;
		this.pincode = pincode;
	}
	public String getCity_Name() {
		return city_Name;
	}
	public void setCity_Name(String city_Name) {
		this.city_Name = city_Name;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public String getPincode() {
		return pincode;
	}
	public void setPincode(String pincode) {
		this.pincode = pincode;
	}
	
	public void display(){
		System.out.println("Address");
		System.out.println("City: "+city_Name+"\tState : "+state+"\tPincode : "+pincode);
	}
	
	

}
