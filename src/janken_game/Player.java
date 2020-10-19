package janken_game;

public class Player {
	int playerHand;

	public void hand() {
		if(playerHand == 1) {
			System.out.println("グー！");
		}else if(playerHand == 2) {
			System.out.println("チョキ！");
		}else if(playerHand == 3) {
			System.out.println("パー！");
		}
	}

}
