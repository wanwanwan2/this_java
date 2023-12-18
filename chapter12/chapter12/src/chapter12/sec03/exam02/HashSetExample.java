package chapter12.sec03.exam02;

import java.util.HashSet;

public class HashSetExample {

	public static void main(String[] args) {
		//HashSet 컬렉션 생성
		HashSet hashSet = new HashSet();
		
		//HashSet에 Student 객체 저장
		Student s1 = new Student(1, "홍길동");
		hashSet.add(s1);
		System.out.println("저장된 객체 수: " + hashSet.size());
		
		//HashSet에 Student 객체 저장
		Student s2= new Student(1, "홍길동");
		hashSet.add(s2);
		System.out.println("저장된 객체 수: " + hashSet.size());
		
		//HashSet에 Student 객체 저장
		Student s3 = new Student(2, "홍길동");
		hashSet.add(s3);
		System.out.println("저장된 객체 수: " + hashSet.size());
		
	}

}
