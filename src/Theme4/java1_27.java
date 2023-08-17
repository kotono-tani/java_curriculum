/*
 
 	コンソールに下記が入力されたときにコンソール出力結果がコンソールに表示されるように作ってください
 	ライオン:2.1:80,ゾウ:3.2:40,パンダ:1.9:30,チンパンジー:0.94:25,シマウマ:2.4:65,インコ:0.1:50
  	
  	コンソール出力結果
  	
  	コンソールに文字を入力してください
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
	学名：パンテラ レオ
	
	動物名：ゾウ
	体長：3.2m
	速度：40km/h
	学名：ロキソドンタ・サイクロティス
	
	動物名：パンダ
	体長：1.9m
	速度：30km/h
	学名：アイルロポダ・メラノレウカ
	
	動物名：チンパンジー
	体長：0.94m
	速度：25km/h
	学名：パン・トゥログロディテス
	
	動物名：シマウマ
	体長：2.4m
	速度：65km/h
	学名：チャップマンシマウマ
	
	動物名：インコ
	体長：0.1m
	速度：50km/h
	学名：不明

  
  */
package Theme4;

import java.util.Scanner;



public class java1_27 {
    public static void main(String[] args) {
    	
    	// 出力
    	System.out.println("コンソール出力結果");
    	
    	// 改行
    	System.out.println();
    	
    	// 標準入力を指定
        Scanner scanner = new Scanner(System.in);
        
        // 出力
        System.out.println("コンソールに文字を入力してください");

        // 1行を読み込んで返却
        String animalData = scanner.nextLine();
        
        // nullチェック
        if (animalData == null || animalData.isEmpty()) {
            System.out.println("入力がありません");
            return;
        }

        // animalDate内の文字列を","で分割して格納
        String[] animals = animalData.split(",");

        // 変数animalに代入
        for (String animal : animals) {
        	
        	// animal内の文字列を":"で分裂して格納
            String[] animalInfo = animal.split(":");
            
            // nullチェック
            if (animalInfo.length != 3) {
                System.out.println("入力の形式が正しくありません");
                continue;
            }

            // 配列0をnameに代入
            String name = animalInfo[0];
            
            // 配列1をlengthStrに代入
            String lengthStr = animalInfo[1];
            
            // 配列2をspeedStrに代入
            String speedStr = animalInfo[2];
 
            // 変数の宣言
            double length;
     
            try {
            	
            	// lengthStrをdouble型に変更
                length = Double.parseDouble(lengthStr);
                
                // 数値型に適していない時(nullチェック)
            } catch (NumberFormatException e) {
                System.out.println("体長の値が不正です: " + lengthStr);
                continue;
            }

            // 変数の宣言
            int speed;
            try {
            	
            	// speedStrをint型に変更
                speed = Integer.parseInt(speedStr);
                
                // 数値型に適していない時(nullチェック)
            } catch (NumberFormatException e) {
                System.out.println("速度の値が不正です: " + speedStr);
                continue;
            }

            // 変数を宣言
            String scientificName;
            
            // switch文
            switch (name) {
            
            // nameがライオンの時
                case "ライオン":
                	
                	// 代入
                    scientificName = "パンテラ レオ";
                    break;
                    
                    // nameがゾウの時
                case "ゾウ":
                	
                	// 代入
                    scientificName = "ロキソドンタ・サイクロティス";
                    break;
                    
                    // nameがパンダの時
                case "パンダ":
                	
                	// 代入
                    scientificName = "アイルロポダ・メラノレウカ";
                    break;
                    
                    // nameがチンパンジーの時
                case "チンパンジー":
                	
                // 代入
                    scientificName = "パン・トゥログロディテス";
                    break;
                    
                    // nameがシマウマの時
                case "シマウマ":
                	
                	// 代入
                    scientificName = "チャップマンシマウマ";
                    break;
                    
                    // nameがインコの時
                case "インコ":
                	
                	// 代入
                    scientificName = "不明";
                    break;
                    
                    // nameの条件がfalseの時
                default:
                	
                	// 代入
                    scientificName = "不明";
            }

            // 出力
            System.out.println("\n動物名：" + name);
            System.out.println("体長：" + length + "m");
            System.out.println("速度：" + speed + "km/h");
            System.out.println("学名：" + scientificName);
        }
    }
}
