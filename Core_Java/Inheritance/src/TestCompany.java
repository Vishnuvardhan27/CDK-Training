
public class TestCompany {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Address address=new Address("Pune", "MH", "411015") ;
		Company company=new Company(123,"CDK",address);	
		company.display();
	}

}
