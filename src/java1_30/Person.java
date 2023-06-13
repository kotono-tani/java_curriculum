package java1_30;

class Person {
	// インスタンスフィールドを定義
	private String name; // name
	private int age; // age
	private double height; // height
	private double weight; // weight
	private static int num; // 合計人数num

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) { // 修正

		/* 修正 thisキーワード */
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		num++;

	}

	public double bmi() { // インスタンスメソッドを定義
		return weight / (height * height); // 修正 bmi計算
	}

	public void print() { // インスタンスメソッドを定義

		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "です");
		System.out.println("BMIは" + Math.floor(bmi()) + "です"); // 修正

	}

	public static void printNum() { // インスタンスメソッドを定義
		System.out.println("合計" + num + "人です"); // 修正

	}
}