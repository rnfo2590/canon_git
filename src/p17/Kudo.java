package p17;

public class Kudo extends Human {
	
	void listenMusic() {
		System.out.println("名前："+name);
		System.out.println("年齢："+age);
		System.out.println("音楽を聴いています");
		
	}
	
	public void eat() {
		//super.eat();//再定義しているが、superクラス側を呼び出している
		System.out.println("うどんを食べました");
	}

}
