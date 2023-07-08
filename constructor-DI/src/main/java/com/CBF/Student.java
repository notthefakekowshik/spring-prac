package com.CBF;

public class Student {
	String name;

	Person p;
	Student(String name){
		this.name = name;
	}
	void displayName() {
		System.out.println(this.name);
	}

	Student(Person p){
		this.p = p;
	}
}
