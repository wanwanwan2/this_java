package chapter7.sec03.exam02;

public class SmartPhone extends Phone {
	//자식 생성자 선언
	public SmartPhone(String model, String color) {
		super(model, color); //부모 클래스가 매개변수를 갖는 경우에는 반드시 작성해주어야 한다.
		System.out.println("SmartPhone(String model, String color) 생성자 실행됨");
	}
}
