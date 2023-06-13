package java1_30;

class Person {
	// インスタンスフィールドを定義
	private String name;
	private int age;
	private double height;
	private double weight;
	private static int num;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	public Person(String name, int age, double height, double weight) { // 修正

		/* 修正 */
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		num++;

	}

	public double bmi() {
		return weight / (height * height); // 修正
	}

	public void print() {

		System.out.println("名前は" + name + "です");
		System.out.println("年は" + age + "です");
		String formattedBmi = String.format("%.1f", bmi());
		System.out.println("BMIは" + formattedBmi + "です");

	}

	public static void printNum() {
		System.out.println("合計" + num + "人です"); // 修正

	}
}