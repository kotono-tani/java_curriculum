/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package Theme3;

import Theme3_sub.java1_25_2;

// スーパークラス
public class java1_25 extends java1_25_2 {
	public static void main(String[] args) {
		// インスタンス化
		java1_25 status = new java1_25();

		// 値代入
		status.setName("名前");
		status.setHp((int) (Math.random() * 1000) + 1);
		status.setMp((int) (Math.random() * 1000) + 1);
		status.setAttack((int) (Math.random() * 1000) + 1);
		status.setAgility((int) (Math.random() * 1000) + 1);
		status.setDefense((int) (Math.random() * 1000) + 1);

		// 出力
		System.out.println("こんにちは" + "「" + status.getName() + "」" + " さん");
		System.out.println("ステータス");
		System.out.println("HP:" + status.getHp());
		System.out.println("MP:" + status.getMp());
		System.out.println("攻撃力:" + status.getAttack());
		System.out.println("素早さ:" + status.getAgility());
		System.out.println("防御力:" + status.getDefense());
		System.out.println();
		System.out.println("さあ冒険に出かけよう！");

	}
}
