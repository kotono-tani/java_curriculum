/*
 
 名前を入力したら下記がコンソールに出力されるように作ってください
	条件：数値は毎回変わるように作ってください
	 	 サブクラスを使用してください
		 スーパークラスを使用してください
		 getterとsetterを使用してください
		 packageを2つ作ってメインと処理を分けてください
		 命名する場合は規則にのっとってください
		 コンストラクタを使用してください

	こんにちは 「 名前 」 さん
	ステータス
	HP：849
	MP：862
	攻撃力：375
	素早さ：937
	防御力：24

	さあ冒険に出かけよう！
 
 */
package Theme3_sub;

// サブクラス
public class java1_25_2 {

	// コンストラクタを追加
	// カプセル化
	private String name;
	private int hp;
	private int mp;
	private int attack;
	private int agility;
	private int defense;

	// 生成
	public java1_25_2() {
	}

	// 代入 this
	public java1_25_2(String name, int hp, int mp, int attack, int agility, int defense) {
		this.name = name;
		this.hp = hp;
		this.mp = mp;
		this.attack = attack;
		this.agility = agility;
		this.defense = defense;

	}

	// getter
	public String getName() {

		// nameを返す
		return this.name;
	}

	// setter
	public void setName(String name) {

		// 参照
		this.name = name;
	}

	// getter
	public int getHp() {

		// hpを返す
		return this.hp;
	}

	// setter
	public void setHp(int hp) {

		// 参照
		this.hp = hp;
	}

	// getter
	public int getMp() {

		// mpを返す // 修正
		return this.mp;
	}

	// setter
	public void setMp(int mp) {

		// 参照
		this.mp = mp;
	}

	// getter
	public int getAttack() {

		// attackを返す // 修正
		return this.attack;
	}

	// setter
	public void setAttack(int attack) {

		// 参照
		this.attack = attack;
	}

	// getter
	public int getAgility() {

		// agilityを返す // 修正
		return this.agility;
	}

	// setter
	public void setAgility(int agility) {

		// 参照
		this.agility = agility;
	}

	// getter
	public int getDefense() {

		// defenseを返す // 修正
		return this.defense;
	}

	// setter
	public void setDefense(int defense) {

		// 参照
		this.defense = defense;
	}

}