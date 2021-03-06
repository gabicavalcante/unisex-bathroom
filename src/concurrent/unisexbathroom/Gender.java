package concurrent.unisexbathroom;

import java.util.Random;

/**
 * Gender enum.
 * 
 * @author  Gabriela Cavalcante and Irene Ginani
 * @version 20/05/2018
 */
public enum Gender {
	Woman, Men;

	/**
	 * Returns a random gender.
	 * @return random gender.
	 */
	public static Gender getGender()  {
		Random random = new Random();
	    return values()[random.nextInt(values().length)];
	} 
}
