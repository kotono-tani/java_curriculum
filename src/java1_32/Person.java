package java1_32;

class Person {

	// クラスフィールド定義 修正
	private String name;
	private int age;
	private double height;
	private double weight;

	// 問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	public static int count = 0;

	Person(String name, int age, double height, double weight, int count) {

		// コンストラクタの設定
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
		Person.count = count + 1; // 修正

	}

	// ゲッターメソッド　修正
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// ゲッターメソッド　修正
	public int age() {
		return age;
	}

	// ゲッターメソッド　修正
	public String name() {
		return name;
	}

	// 問題4：クラスメソッド「printCount」を定義してください（データ型：void）
	// クラスメソッドを定義
	public void printCount() {

		// 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
		System.out.println("合計" + Person.count + "人です"); // 修正
	}

	// メソッドを定義
	public void print() {
		System.out.println("名前は" + this.name() + "です");
		System.out.println("年は" + this.age() + "です");
	}
}
