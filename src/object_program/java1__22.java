/*
 
	下記がコンソールに出力されるように作成してください
	
		こんにちは！ここは日本です！
		この寿司はうまい
		寿司は和食です
		今の現在日時は2023/03/09 10:23:39です

	【条件】
		・JavaProjectを新規作成し、実行用のpackageと処理用のpackageを作成してください。
		・適切なファイルにフィールドで変数を必要な数作ってください。
		・thisを使って作成してください。
		・日時は今日の日付を取得してください。
		
  */
package object_program;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import treatment_program.java1_22;

class java1__22 {
	public static void main(String[] args) {
		// TODO 自動生成されたメソッド・スタブ

		// インスタンス化
		java1_22 theme = new java1_22("こんにちは!", "ここは日本です!", "この寿司はうまい", "寿司は和食です");

		// 出力
		System.out.println(theme.hello + theme.japan);
		System.out.println(theme.sushi);
		System.out.println(theme.food);
		// 現在日時を取得
		LocalDateTime nowDate = LocalDateTime.now();

		// 表示形式を指定
		DateTimeFormatter dtf1 = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss"); // ①
		String formatNowDate = dtf1.format(nowDate); // ②
		System.out.println(formatNowDate);
	}

}
