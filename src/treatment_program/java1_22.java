package treatment_program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class java1_22 {

	// フィールド変数
	public String hello;
	public String japan;
	public String sushi;
	public String food;

	// コンストラクタ
	public java1_22(String hello, String japan, String sushi, String food) {
		this.hello = hello;
		this.japan = japan;
		this.sushi = sushi;
		this.food = food;

	}

	public void printDatetime() {
		// 現在日時を取得
		LocalDateTime nowDate = LocalDateTime.now();
		// 表示形式を指定
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		String formatNowDate = dtf1.format(nowDate);

		// 出力
		System.out.println("今の現在日時は" + formatNowDate + "です");
	}
}