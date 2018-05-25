package concurrent.unisexbathroom;

import java.util.Random;

/**
 * Class to represents a thread Person.
 * 
 * @author Gabriela Cavalcante and Irene Ginani
 * @version 20/05/2018
 */
public class Person extends Thread {
	private Gender gender; 
	private Bathroom bathroom;
	private int time;
	
	public Person(String name, Bathroom bathroom) {
		super(name); 
		this.bathroom = bathroom;
		this.gender = Gender.getGender();
		
		Random random = new Random();
		this.time = random.nextInt(5);
	}
	
	@Override
	public void run() {   
		try {
			bathroom.getin(this);
		} catch (InterruptedException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		} 
		
		try {
			Thread.sleep ((long) (this.time) * 1000);
		} catch (InterruptedException e) { 
			e.printStackTrace();
		}   
		bathroom.getout(this); 
	}

	public Gender getGender() {
		return gender;
	} 
}
