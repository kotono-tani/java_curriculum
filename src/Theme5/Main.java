/*
 	
 	0, "北海道:札幌市:83424"
	1, "青森県:青森市:9646"
	2, "岩手県:盛岡市:15275"
	3, "宮城県:仙台市:7282"
	4, "秋田県:秋田市:11638"
	5, "山形県:山形市:9323"
	6, "福島県:福島市:13784"
	7, "茨城県:水戸市:6097"
	8, "栃木県:宇都宮市:6408"
	9, "群馬県:前橋市:6362"
	10, "埼玉県:さいたま市:3798"
 	
 	コンソールに数字と昇順・降順の値が入力されると上記配列に対応する
 	都道府県がソートされてコンソールに出力されるように作ってください
   	※Packageを2つ作ってください
   	※複数選択できるようにしてください
   	
   	例:
   	8,5,9,.....
   	と入力された場合（昇順）
   	
   	都道府県名：山形県
	県庁所在地：山形市
	面積：9323.0km2
   	
   	都道府県名：栃木県
	県庁所在地：宇都宮市
	面積：6408.0km2

   	都道府県名：群馬県
	県庁所在地：前橋市
	面積：6362.0km2
	
 */
package Theme5;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

import Theme5_2.Prefecture;

public class Main {

	// インスタンスを複数生成
	private static final Prefecture[] prefectures = {

			// 各値を代入
			new Prefecture("北海道", "札幌市", 83424),
			new Prefecture("青森県", "青森市", 9646),
			new Prefecture("岩手県", "盛岡市", 15275),
			new Prefecture("宮城県", "仙台市", 7282),
			new Prefecture("秋田県", "秋田市", 11638),
			new Prefecture("山形県", "山形市", 9323),
			new Prefecture("福島県", "福島市", 13784),
			new Prefecture("茨城県", "水戸市", 6097),
			new Prefecture("栃木県", "宇都宮市", 6408),
			new Prefecture("群馬県", "前橋市", 6362),
			new Prefecture("埼玉県", "さいたま市", 3798)
	};

	public static void main(String[] args) {

		// 標準入力を指定
		Scanner scanner = new Scanner(System.in);

		// 出力
		System.out.print("都道府県の番号を入力してください（複数選択可、カンマ区切り）：");

		// 1行を読み込んで返却
		String input = scanner.nextLine();

		// 配列を生成
		String[] numbers = input.split(",");
		// リストの初期化
		List<Prefecture> selectedPrefectures = new ArrayList<>();

		// 条件
		for (String number : numbers) {
			int index = Integer.parseInt(number);

			// nullチェック
			if (index >= 0 && index < prefectures.length && prefectures[index] != null) {
				selectedPrefectures.add(prefectures[index]);
			}
		}

		// 出力
		System.out.print("昇順または降順を選択してください（1: 昇順、2: 降順）：");

		// 1行を読み込んで返却
		int sortOrder = scanner.nextInt();
		// 1の場合
		if (sortOrder == 1) {

			// ソートされてコンソールに出力
			Collections.sort(selectedPrefectures, Comparator.comparing(Prefecture::getName));

			// 2の場合
		} else if (sortOrder == 2) {

			// ソートされてコンソールに出力
			Collections.sort(selectedPrefectures, Comparator.comparing(Prefecture::getName).reversed());
		}

		for (Prefecture prefecture : selectedPrefectures) {
			System.out.println("都道府県名：" + prefecture.getName());
			System.out.println("県庁所在地：" + prefecture.getCapital());
			System.out.println("面積：" + prefecture.getArea() + "km2");
			System.out.println();
		}
	}
}
