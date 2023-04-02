package homework;

public class StandardWeightInfo extends Human {
	
	
	public StandardWeightInfo(String name, double height, double weight) {
		super(name, height, weight);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void getInformation() {
		super.getInformation();
		System.out.println(name + "님의 신장 " + height + ", 몸무게 " + weight + ", 표준체중 " + getStandardWeight() + "입니다." );
	}

	public double getStandardWeight() {
		double standard = (height-100) * 0.9;
		return standard;
	}


	
	
}
