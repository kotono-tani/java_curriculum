package java1_32;

class Person {

	// クラスフィールド定義
	public String name;
	public int age;
	public double height;
	public double weight;

	// 問題1：クラスフィールド「count」を定義してください（初期値：0,データ型：int）
	public int count = 0;

	Person(String name, int age, double height, double weight, int count) {

		// コンストラクタの設定
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;

		// 問題2：Personコンストラクタの中でクラスフィールドcountに1を足してください
		this.count = count + 1; // 修正

	}

	// コンストラクタを定義
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// コンストラクタを定義
	private int age() {
		return age;
	}

	// コンストラクタを定義
	private String name() {
		return name;
	}

	// 問題4：クラスメソッド「printCount」を定義してください（データ型：void）
	// クラスメソッドを定義
	public void printCount() {

		// 問題5：クラスメソッドの中にクラスフィールド「count」を用いて「合計〇〇人です」と出力してください
		System.out.println("合計" + this.count + "人です");
	}

	// メソッドを定義
	public void print() {
		System.out.println("名前は" + this.name() + "です");
		System.out.println("年は" + this.age() + "です");
	}
}
