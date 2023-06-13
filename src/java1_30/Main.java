package java1_30;

class Main {
	public static void main(String[] args) {
		Person person = new Person("鈴木太郎", 20, 1.7, 60); // オブジェクトの生成
		person.print(); // printメソッドを呼ぶ
		Person.printNum(); // printNumメソッドを呼ぶ
	}

}
