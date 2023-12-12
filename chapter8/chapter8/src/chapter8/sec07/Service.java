package chapter8.sec07;

public interface Service {
	//디폴트 메소드
	default void defaultMethod1() {
		System.out.println("defaultMethod1 종속 코드");
		defaultCommon();
	}
	
	default void defaultMethod2() {
		System.out.println("defaultMethod2 종속 코드");
		defaultCommon();
	}
	
	//private 메소드
	private void defaultCommon() {
		System.out.println("defaultMehod 중복 코드A");
		System.out.println("defaultMehod 중복 코드B");
	}
	
	//정적 메소드
	static void staticMehod1() {
		System.out.println("StaticMethod1 종속 코드");
		staticCommon();
	}
	
	static void staticMehod2() {
		System.out.println("StaticMethod2 종속 코드");
		staticCommon();
	}
	
	private static void staticCommon() {
		System.out.println("staticMethod 중복 코드C");
		System.out.println("staticMethod 중복 코드D");
	}
}
