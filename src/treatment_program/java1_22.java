package treatment_program;

import java.text.SimpleDateFormat; // 修正
import java.util.Date;

public class java1_22 {
	
	// 現在日時を取得
	private String currentDateTime;

	public java1_22() {
		
		// 初期値設定
		setCurrentDateTime();
	}

	// 出力内容
	public void printOutput() {
		System.out.println("こんにちは！ここは日本です！");
		System.out.println("この寿司はうまい");
		System.out.println("寿司は和食です");
		System.out.println("今の現在日時は" + currentDateTime + "です");
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
