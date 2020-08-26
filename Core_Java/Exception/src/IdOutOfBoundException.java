import com.pojo.MyData;

public class IdOutOfBoundException extends Exception {

	private String message;
	public IdOutOfBoundException() {
		// TODO Auto-generated constructor stub
		
	}
	public IdOutOfBoundException(String message) {
		super(message);
		this.message = message;
	}
	public void displayMessage()
	{
		System.out.println(getMessage());
	}
}

class HandleException{
	public static void main(String[] args){
		
		MyData data = new MyData(1000,"CDK",101);
		
		if(data.getId()>100)
		{
			try {
				throw new IdOutOfBoundException("ID is greater than 100");
			} catch (IdOutOfBoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();;
			}
		}
		
	}
}