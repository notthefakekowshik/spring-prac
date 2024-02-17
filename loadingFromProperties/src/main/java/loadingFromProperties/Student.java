package loadingFromProperties;

import org.springframework.beans.factory.annotation.Value;


//public class Student {
//	private String name;
//	private int age;
//	private String language;
//	
//	
//	
//	@Value("kowshik")
//	public void setName(String name) {
//		this.name = name;
//	}
//	
//	@Value("22")
//	public void setAge(int age) {
//		this.age = age;
//	}
//	@Value("javascript")
//	public void setLanguage(String language) {
//		this.language = language;
//	}
//	
//	public String getLanguage() {
//		return language;
//	}
//	
//	public String getName() {
//		return name;
//	}
//
//	public int getAge() {
//		return age;
//	}
//	
//	public String toString()
//	{
//		System.out.println(this.name+" is of "+this.age+" and fav lang is "+this.language);
//		return "";
//	}
//}




public class Student {
	@Value("${student.1[name]}")
	private String name;
	@Value("22")
	private int age;
	@Value("javascript")
	private String language;
		
	public String getLanguage() {
		return language;
	}
	
	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}
	
//	public void display()
//	{
//		System.out.println(this.name+" is of "+this.age+" and fav lang is "+this.language);
//	}
	
	public String toString()
	{
		System.out.println(this.name+" is of "+this.age+" and fav lang is "+this.language);
		return "";
	}
}
