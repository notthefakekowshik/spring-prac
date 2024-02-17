package SpringAnnotation;

import org.springframework.stereotype.Component;

@Component("collegeBean")
public class College 
{
	public void display()
	{
		System.out.println("displaying the college");
	}
}
