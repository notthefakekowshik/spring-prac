package springAutowiringDemo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		Human humanOb = context.getBean("humanObj" , Human.class);
		humanOb.pumping();
	}

}
