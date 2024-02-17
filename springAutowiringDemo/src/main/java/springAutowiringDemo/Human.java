package springAutowiringDemo;

import org.springframework.beans.factory.annotation.Autowired;


public class Human {
	
	
	public Heart heart;

	Human()
	{
		
	}
	
	Human(Heart heart)
	{
		this.heart = heart;
	}
	public Heart getHeart() {
		return heart;
	}

	@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void pumping() {
		heart.pump();
	}
}
