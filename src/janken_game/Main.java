package janken_game;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// Scannerクラスのインスタンスを作成
	    // 引数で標準入力System.inを指定する
		Scanner scanner = new Scanner(System.in);

	    System.out.println("じゃんけんスタート！");
	    System.out.println("何をだす？ >");
	    //入力された内容をインスタンスから取得
	    String input_text = scanner.nextLine();//ここでPlayerクラスのhandメソッドを使いたい
	    //入力された内容を画面に表示 input_text = playerHand にしたい
	    System.out.println(input_text);
	    scanner.close();

	}

}
