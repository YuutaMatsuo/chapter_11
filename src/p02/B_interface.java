package p02;

public interface B_interface extends A_interface{
	default void methodA() {
		System.out.println("デフォルト処理を上書き");
	}
	
	// デフォルトメソッドとして上書き
	default void methodEmpty() {
		System.out.println("methodEmptyメソッドのデフォルト処理です");
	}
}
