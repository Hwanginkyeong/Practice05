package com.javaex.ex01;

public class MemberApp {

	public static void main(String[] args) {
		
		
		Member m1 = new Member();
		//방법 1 
		Member m2 = new Member("유재석","yjs",30000);
		Member m3 = new Member("이효리","lhr",40000);
		
		//방법 2
		m1.setName("정우성");
		m1.setId("jws");
		m1.setPoint(50000);
		
		m1.showInfo();
		m2.showInfo();
		m3.showInfo();
		
		
		
		
		
		

		
	}

}
