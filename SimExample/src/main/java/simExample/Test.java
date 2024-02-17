package simExample;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test 
{
	public static void main(String[] args) 
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Airtel air = (Airtel)context.getBean("airtelObj",Airtel.class);
		
		Vodafone v = (Vodafone) context.getBean("vodafoneObj",Vodafone.class);
		v.call();
		air.call();
	}	
}
