package p01;

// インタフェースの宣言
//（インスタンス化・具象メソッドの定義・変数フィールドの宣言 いずれも禁止）
public interface Creture {
	// staticフィールド(静的フィールド)
	public static final String HABITAT = "earth";
	// public static final は省略可
//	(public static final) String habitat = "earth";
	
	// 抽象メソッド
	public abstract void run();
	// public abstract は省略可
//	(public abstract) void run();
	
	// 具象メソッドはNG！
//	public void sleep() {
//		System.out.println("ぐっすり眠った！");
//	}
}
