package Spring_DIConstruct;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
  
public class Test 
{  
    public static void main(String[] args) 
    {  
    	ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Employee s=(Employee)context.getBean("e");  
        s.show();  
    }  
}  