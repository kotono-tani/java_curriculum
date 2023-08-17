package Theme5_2;

public class Prefecture {

	// 初期設定
	private String name;
	private String capital;
	private double area;

	// コンストラクタの呼び出し
	public Prefecture(String name, String capital, double area) {
		this.name = name;
		this.capital = capital;
		this.area = area;
	}

	// getter
	public String getName() {

		// nameを返す
		return name;
	}

	public String getCapital() {

		// capitalを返す
		return capital;
	}

	public double getArea() {

		// areaを返す
		return area;
	}
}
