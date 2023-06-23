package java1_32;

class Main {
	public static void main(String[] argos) {
		
		// オブジェクトの生成
		Person person1 = new Person("鈴木太郎", 20, 1.7, 60, 1);
		
		// メソッドの呼び出し
		person1.print();
		
		// メソッドの呼び出し
		person1.printCount();
		
		// オブジェクトの生成
		Person person2 = new Person("山田花子", 22, 1.5, 40, 1);
		
		// メソッドの呼び出し
		person2.print();
		
		// メソッドの呼び出し
		person2.printCount();

	}
}