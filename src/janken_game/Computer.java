package janken_game;

import java.util.Random;

public class Computer {
	//ランダムでじゃんけんでだす手を決める
	public static int computerHand() {
		Random random = new Random();
		int rnd = random.nextInt(3)+1;

		if(rnd == 1) {
			System.out.println("グー！");
		}else if(rnd == 2) {
			System.out.println("チョキ！");
		}else if(rnd == 3) {
			System.out.println("パー！");
		}
		return(rnd);
	}

}
