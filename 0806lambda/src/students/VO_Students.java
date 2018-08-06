package students;

public class VO_Students {

	private String name;
	private String gender;
	private int score;
	private int age;
	private String subject;
	
	public VO_Students() {
		//상위 클래스의 생성자를 호출하는 구문 : new Object()
		super();
	}
	
	public VO_Students(String name, String gender, int score, int age, String subject) {
		super();
		this.name = name;
		this.gender = gender;
		this.score = score;
		this.age = age;
		this.subject = subject;
	}
	public String getName() {
		return name;
	}
	public String getGender() {
		return gender;
	}
	public int getScore() {
		return score;
	}
	public int getAge() {
		return age;
	}
	public String getSubject() {
		return subject;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public void setScore(int score) {
		this.score = score;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}
	
	
	@Override
	public String toString() {
		return "VO_Students [name=" + name + ", gender=" + gender + ", score=" + score + ", age=" + age + ", subject="
				+ subject + "]";
	}
	
	
	
	
	
}
