package java1_30;

class Main {
	public static void main(String[] args) {
		Person person1 = new Person("鈴木", "太郎", 20, 1.7, 60); // インスタンスを生成
		//person1.print();
		Person person2 = new Person("山田", "花子", 22, 1.5, 40); // インスタンスを生成
		//person2.print();

		//Person.printCount();

		Car car = new Car(); // インスタンスを生成
		Bicycle bicycle = new Bicycle(); // インスタンスを生成

		//ownerを設定
		// car.setOwner(person1.fullName()); 
		// bicycle.setOwner(person2.fullName());
		// System.out.println(car.getOwner()); // 出力
		// System.out.println(bicycle.getOwner()); // 出力
		// 乗り物を購入
		person1.buy(car);
		person2.buy(bicycle);
	}
}
