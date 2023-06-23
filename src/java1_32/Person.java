package java1_32;

class Person {

	// クラスフィールド定義
	public String name;
	public int age;
	public double height;
	public double weight;
	public int count = 0;

	Person(String name, int age, double height, double weight, int count) {

		// コンストラクタの設定
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.count = count;

	}

	// コンストラクタを定義
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// コンストラクタを定義
	private int count() {
		return this.count = 1;
	}

	// コンストラクタを定義
	private int age() {
		return age;
	}

	// コンストラクタを定義
	private String name() {
		return name;
	}

	// クラスメソッドを定義
	public void printCount() {
		System.out.println("合計" + this.count() + "人です");
	}

	// メソッドを定義
	public void print() {
		System.out.println("名前は" + this.name() + "です");
		System.out.println("年は" + this.age() + "です");
		System.out.println("合計" + this.count() + "人です");
	}
}
