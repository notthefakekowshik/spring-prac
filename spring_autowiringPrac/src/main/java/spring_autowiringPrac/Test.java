package spring_autowiringPrac;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

	public static void main(String[] args) 
	{

		ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
		Employee e = (Employee) context.getBean("empDisplay");
		

	}

}
