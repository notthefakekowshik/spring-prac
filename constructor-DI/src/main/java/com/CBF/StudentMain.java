	package com.CBF;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class StudentMain {

	public static void main(String[] args) {
		/**
		 *  DI for simple string values, you can modify the params and put int,float,etc.. values too.
		 */
		BeanFactory bf = new ClassPathXmlApplicationContext("xml_data.xml");
		Student kowshikObjBF = (Student) bf.getBean("k-obj");
		kowshikObjBF.displayName();
		
		ApplicationContext ac = new ClassPathXmlApplicationContext("xml_data.xml");
		Student kowshikObjAC = ac.getBean("k-obj" , Student.class);
		kowshikObjAC.displayName();

		/**
		 * DI when a class has has-a relationship with another class.
		 */
		BeanFactory bfRefPerson = new ClassPathXmlApplicationContext("xml_data.xml");
		Person pObj = (Person) bfRefPerson.getBean("kowshik-person-obj");
		pObj.displayPersonName();

		BeanFactory bfRef = new ClassPathXmlApplicationContext("xml_data.xml");
		Student kowshikObjBFRef = (Student) bfRef.getBean("student-ref");
		kowshikObjBFRef.p.displayPersonName();

		ApplicationContext acRef = new ClassPathXmlApplicationContext("xml_data.xml");
		Student kowshikObjACRef = acRef.getBean("student-ref" , Student.class);
		kowshikObjACRef.p.displayPersonName();
	}

}
