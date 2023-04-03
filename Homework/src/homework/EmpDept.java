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
		System.out.println("이름 : " + name+"\t연봉 : " + salary+"\t부서 : " + deptName);

	}

	@Override
	public void print() {
		System.out.println("수퍼클래스 \n 서브클래스");
	}
	
	
}