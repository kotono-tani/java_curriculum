package treatment_program;

import java.text.SimpleDateFormat; // 修正
import java.util.Date;

public class java1_22 {
	// 修正
	String hello; // こんにちは！
	String japan; // ここは日本です！
	String sushi; // この寿司はうまい
	String food; // 寿司は和食です

	// JapaneseFoodクラスのコンストラクタの呼び出し
	// 修正
	java1_22(String hello, String japan, String sushi, String food) {
		this.hello = hello;
		this.japan = japan;
		this.sushi = sushi;
		this.food = food;
	}

	public void printOutput() {
		// TODO 自動生成されたメソッド・スタブ
		// インスタンスを生成
		java1_22 them = new java1_22("こんにちは！", "ここは日本です！", "この寿司はうまい", "寿司は和食です");
		System.out.println(them.hello + them.japan);
		System.out.println(them.sushi);
		System.out.println(them.food);
		System.out.println("今の現在日時は" + currentDateTime + "です");
	}

	// 現在日時を取得
	private String currentDateTime;

	public java1_22() {

		// 初期値設定
		setCurrentDateTime();
	}

	private void setCurrentDateTime() {
		// 表示形式設定
		SimpleDateFormat formatter = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

		// インスタンス化
		Date date = new Date();

		// 代入
		currentDateTime = formatter.format(date);
	}
}
