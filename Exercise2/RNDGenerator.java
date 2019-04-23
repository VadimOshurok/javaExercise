package Exercise2;

import java.util.Random;

public class RNDGenerator {
	public final static Random RND=new Random();
	
	public static int getRandom() {
		int random=(int)RND.nextInt(899)+100;
		return random;
	}

}
