package p01;
// インタフェースを実装したクラスを宣言する(implements)
public abstract class Monster implements Creture, BattleCreture {
	String name;
	int hp;
//	public static final String HABITAT = "earth";
	
	// 差分の具象メソッド
	public void sleep() {
		System.out.println("眠った！");
	}
	
	// 差分の抽象メソッド
	public abstract void attack();
	
}
