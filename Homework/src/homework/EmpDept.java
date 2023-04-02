package homework;

public class EmpDept extends Employee{
	String deptName;
	
	public EmpDept(String name, int salary, String deptName) {
		this.name = name;
		this.salary = salary;
		this.deptName = deptName;
	}

	public String getDeptName() {
		return deptName;
	}

	@Override
	public void getInformation() {
		System.out.println("이름 : " + name);
		System.out.println("연봉 : " + salary);
		System.out.println("부서 : " + deptName);
	}

	@Override
	public void print() {
		System.out.println("수퍼클래스 \n 서브클래스");
	}
	
	
}