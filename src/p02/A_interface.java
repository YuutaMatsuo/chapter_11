package p02;

public interface A_interface {
	//デフォルトメソッド
	default void methodA() {
		// このメソッドが実装（オーバーライド）されなかったときに定義される処理内容
		System.out.println("デフォルト処理です");
		
	}
	
	// 抽象メソッド
	void methodEmpty();
}
