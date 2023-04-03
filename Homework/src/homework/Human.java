package homework;

public class Human {
	String name;
	double height;
	double weight;
	
	public Human(String name, double height, double weight) {
		this.name = name;
		this.height = height;
		this.weight = weight;
	}
	


	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("키 : " + height);
		System.out.println("몸무게 : " + weight);
	}
	
	
}
