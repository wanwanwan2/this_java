package chapter17.sec12.exam01;

public class Student {
	private String name;
	private String sex;
	private int score;

	public Student(String name, String sex, int score) {
		this.name = name;
		this.score = score;
		this.sex = sex;
	}

	public String getName() {
		return name;
	}

	public String getSex() {
		return sex;
	}

	public int getScore() {
		return score;
	}
}
