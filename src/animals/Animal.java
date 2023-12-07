package animals;

//インスタンス化してもらうつもりで作っているわけではない
//あくまで今後「スーパークラス」として「継承」するクラスを作りたい

//今までの書き方だと、インスタンスすることが出来てしまう
//public class Animal {

//（解決法）：「抽象クラス」として宣言する キーワード:abstract（抽象）
public abstract class Animal {
	String name;
	
	//コンストラクタも持つことはできる サブクラスのインスタンスが生成された時に呼ばれる
	public Animal(String name) {
		this.name = name;
	}
	
	//抽象メソッドを持つことが出来る
	public abstract void sleep(); //抽象メソッドはブロックを記載してはいけない！
	
}
