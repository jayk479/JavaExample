package homework;

public class ObesityInfo extends StandardWeightInfo{


	

	public ObesityInfo(String name, double height, double weight) {
		super(name, height, weight);
		// TODO Auto-generated constructor stub
	}

	public double getObesity() {
		double fat = ((weight + getStandardWeight())/getStandardWeight()*100);
		String obe = "";
		if (fat < 18.5) {
			obe = "저체중";
			
		}else if(fat < 22.9) {
			obe = "정상";
		}else if(fat < 24.9) {
			obe = "과체중";
		}else{
			obe = "비만";
		}
		return obe;
	}
	
	@Override
	public void getInformation() {
		System.out.println(name + "의 신장" + height + ", 몸무게 " + weight +getObesity() + " 입니다.");

	}
}
