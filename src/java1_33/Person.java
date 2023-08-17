package java1_33;

class Person {

	// フィールドを定義
	public static int count = 0;
	public String firstName;
	public int age;
	public double height, weight;
	private String lastName;

	Person(String firstName, String lastName, int age, double height, double weight) {

		// コンストラクタの設定
		Person.count++;
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}

	// コンストラクタの定義
	public String fullName() {
		return this.firstName + this.lastName;
	}

	// メソッドの定義
	public void print() {
		System.out.println("名前は" + this.fullName() + "です");
		System.out.println("年は" + this.age + "です");
	}

	// コンストラクタの定義
	public double bmi() {
		return this.weight / this.height / this.height;
	}

	// メソッドの定義
	public void printCount() {
		System.out.println("合計" + Person.count + "人です");
	}
}
