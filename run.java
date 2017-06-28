package PreceptronAI;

import java.util.Random;

public class run {

	public static void main(String[] args) {
		Trainer[] t = new Trainer [100];
		Random rand = new Random (System.nanoTime());
		Preceptron p = new Preceptron(2);
		int test[] = {1 , 4};
		System.out.println(p.guess(test));
		;
		//System.out.println("Check what computr learned. Time to teach as well as take tests");//
		for (int pro  = 0 ; pro < t.length ; pro++){
			t[pro] = new Trainer(rand.nextInt(101), rand.nextInt(101));
			int inputs [] = {t[pro].getX() , t[pro].getY()};
			p.setWeight(inputs, t[pro].ans);
			System.out.println(p.guess(test));
		}
		//System.out.println("tests done , final result");//
		System.out.println(p.guess(test));

	}

}
