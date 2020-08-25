import java.io.Serializable;

public class CalcutableImpl implements Calclutable,Runnable,Serializable {

	@Override
	public void calculate() {
		// TODO Auto-generated method stub
		System.out.println("Calculate Invoked");

	}

	@Override
	public String findName() {
		// TODO Auto-generated method stub
		System.out.println("Findname Invoked");
		return "CDK";
	}

	@Override
	public double calculateArea(int x, int y) {
		// TODO Auto-generated method stub
		return x+y;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		
	}

}
