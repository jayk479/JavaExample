package homework;

public class ObesityInfo extends StandardWeightInfo{

	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
		// TODO Auto-generated constructor stub
	}
	
	
	@Override
	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
		System.out.println("비만도 : " + getObesity());
	}


	public double getObesity() {
		double fat = ((weight + getStandardWeight())/getStandardWeight()*100);
		if (fat < 18.5) {
			System.out.print("저체중");
		}else if(fat < 22.9) {
			System.out.print("정상");
		}else if(fat < 24.9) {
			System.out.print("과체중");
		}else{
			System.out.print("비만");
		}
		return fat;
	}
	
}
