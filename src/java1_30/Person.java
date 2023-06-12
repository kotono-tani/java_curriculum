package java1_30;

class Person{
	// インスタンスフィールドを定義
	String name;
	int age;
	double height;
	double weight;
	double bmi;

	// コンストラクタを定義しインスタンスフィールドに値をセット
	Person(){
		name = "鈴木太郎";
		age = 20;
		height = 1.7;
		weight = 60;
	}

	 double bmi(double height,double weight) {
		return height/weight*weight;
	}

	public void print(String name,int age,double bmi) {
		this.name = name;
		this.age = age;
		this.bmi = bmi;
		
		System.out.println("名前は"+ name + "です");
		System.out.println("年は"+ age + "です");
		System.out.println("BMIは"+bmi+"です");
		System.out.println("合計○人です");
		
	}
	}