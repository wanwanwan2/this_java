package chapter7.sec03.exam01;

public class SmartPhone extends Phone {
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		this.model = model;
		this.color = color;
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
