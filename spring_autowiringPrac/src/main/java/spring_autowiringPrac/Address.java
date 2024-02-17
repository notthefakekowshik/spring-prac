package spring_autowiringPrac;
import org.springframework.stereotype.Component;

import lombok.Data;

@Component
@Data
public class Address 
{
	public String street;
	public String city;
	

	public void display()
	{
		System.out.println("address display");
	}
}
