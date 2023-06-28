package java1_33;

class Main {
	public static void main(String[] args) {

		// オブジェクトの生成
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60);

		// メソッドの呼び出し
		person1.print();

		// オブジェクトの生成
		Person person2 = new Person("山田", "花子", 22, 1.5, 40);

		// メソッドの呼び出し
		person2.print();

		// メソッドの呼び出し
		person2.printCount();
	}
}