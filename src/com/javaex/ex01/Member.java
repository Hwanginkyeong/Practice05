package com.javaex.ex01;

public class Member {
	
	
	//필드
	private String name;
	private String id;
	private int point;
	
	//생성자
	public Member() {
	}

	public Member(String name, String id, int point) {
		super();
		this.id = id;
		this.name = name;
		this.point = point;
	}

	//메소드 g/s
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getPoint() {
		return point;
	}

	public void setPoint(int point) {
		this.point = point;
	}

	
	//메소드 일반 
	@Override
	public String toString() {
		return "Member [name=" + name + ", id=" + id + ", point=" + point + "]";
	}

	public void showInfo() {
		System.out.println("회원정보: " + name + "("+id+")"+", "+ point+"점");
		
	}

	
	
	
	
	
	

}
