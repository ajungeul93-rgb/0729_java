package practice.model.vo;

public class Customer {

	private String name;
	private int age;
	private String userId;
	private String grade;

	public Customer() {
		super();
	}

	public Customer(String name, int age, String userId, String grade) {
		super();
		this.name = name;
		this.age = age;
		this.userId = userId;
		this.grade = grade;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getUserId() {
		return userId;
	}

	public void setUserId(String userId) {
		this.userId = userId;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}

	@Override
	public String toString() {
		return "Customer [name=" + name + ", age=" + age + ", userId=" + userId + ", grade=" + grade + "]";
	}

}
