package spring_autowiringPrac;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

import lombok.*;

@Component
public class Employee 
{
	@Autowired
	public Address address;
	public @Setter @Getter int age;
	public @Setter @Getter String name;
	
	Employee(Address address)
	{
		this.address = address;
	}
	
	@Bean
	public void empDisplay()
	{
		System.out.println("in emp display");
		address.display();
	}

}
