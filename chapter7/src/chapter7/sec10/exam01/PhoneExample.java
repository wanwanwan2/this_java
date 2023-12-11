package chapter7.sec10.exam01;

public class PhoneExample {

	public static void main(String[] args) {
		//Phone phone = new Phone(); 사용불가(x)
		
		SmartPhone smartphone = new SmartPhone("홍길동");
		
		smartphone.turnOn();
		smartphone.internetSearch();
		smartphone.turnOff();
	}

}
