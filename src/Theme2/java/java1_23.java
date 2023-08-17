/*
 	
 	下記がコンソールに出力されるように作成してください
 	※thisとsetterとgetterとフィールドを使ってください
 	
  	動物名：ライオン
	体長：2.1m
	速度：80km/h
 	
 */
package Theme2.java;

public class java1_23 {
	
	// カプセル化
    private String name;
    private double length;
    private double speed;

    // 生成
    public java1_23() {
    }

    // 代入 this
    public java1_23(String name, double length, double speed) {
        this.name = name;
        this.length = length;
        this.speed = speed;
    }

    // getter
    public String getName() {
   
    	// nameを返す
        return name;
    }

    // setter
    public void setName(String name) {
    	
    	// 参照
        this.name = name;
    }

    // getter
    public double getLength() {
    	
    	// lengthを返す
        return length;
    }

    // setter
    public void setLength(double length) {
    	
    	// 参照
        this.length = length;
    }

    // getter
    public double getSpeed() {
    	
    	// speedを返す
        return speed;
    }

    // setter
    public void setSpeed(double speed) {
    	
    	// 参照
        this.speed = speed;
    }

    public static void main(String[] args) {
    	
    	// インスタンス化
        java1_23 lion = new java1_23();
        
        // 値の代入
        lion.setName("ライオン");
        lion.setLength(2.1);
        lion.setSpeed(80);

        // 出力
        System.out.println("動物名: " + lion.getName());
        System.out.println("体長: " + lion.getLength() + "m");
        System.out.println("速度: " + lion.getSpeed() + "km/h");
    }
}

