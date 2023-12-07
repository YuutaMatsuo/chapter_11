package animals;

public class Dog extends Animal{
	
	//コンストラクタ
	public Dog(String name) {
		//コンストラクタを記述しなかったら、super(); が暗黙的に挿入される
		super(name);
	}
	
	//抽象メソッドをオーバーライド
	public void sleep() {
		System.out.println("ぐっすり眠った！");
	}
}
