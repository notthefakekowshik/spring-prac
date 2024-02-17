package loadingFromProperties;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
		Student s1 = (Student) context.getBean("sObj",Student.class);
		System.out.println(s1);
		
	}
}
