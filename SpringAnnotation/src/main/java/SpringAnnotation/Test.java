package SpringAnnotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("xmlData.xml");
		College cObj = context.getBean("collegeBean",College.class);
		cObj.display();
	}
}
