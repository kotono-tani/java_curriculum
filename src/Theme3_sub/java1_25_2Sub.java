package Theme3_sub;

// サブクラス
public class java1_25_2Sub extends java1_25_2Super {

	// コンストラクタを追加
	// カプセル化
	private String name;

	// 生成
	public java1_25_2Sub() {
	}

	// 代入 this
	public java1_25_2Sub(String name, int hp, int mp, int attack, int agility, int defense) {
		super(name, hp, mp, attack, agility, defense);
		this.name = name;
	}

	// geter
	public String getName() {

		// nameを返す
		return this.name;
	}

	// setter
	public void setName(String name) {

		// 参照
		this.name = name;
	}

	// 文字列に変換
	public String toString() {
		return "こんにちは 「" + this.name + "」 さん\nステータス\n" + super.toString();
	}
}
