
public class Company {
	private int compId;
	private String compName;
	private Address address;
	
	public void display()
	{
		System.out.println("Company Id :"+compId+"\nCompany Name : "+compName);
		address.display();
	}
	public Company(int compId, String compName, Address address) {
		super();
		this.compId = compId;
		this.compName = compName;
		this.address = address;
	}
	
	public int getCompId() {
		return compId;
	}
	public void setCompId(int compId) {
		this.compId = compId;
	}
	public String getCompName() {
		return compName;
	}
	public void setCompName(String compName) {
		this.compName = compName;
	}
	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}

}
