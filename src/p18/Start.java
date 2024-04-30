package p18;

public class Start {

	public static void main(String[] args) {
		Human[] canon=new Human[2];
		//スーパークラス側に配列できる
		System.out.println("--------");
		canon[0]=new Oku();
		canon[1]=new Kudo();
		
		canon[0].eat();
		canon[1].eat();
		System.out.println("--------");
		//別の配列パターン
		
		Human[]canon1= {
				new Oku(),
				new Kudo()
		};
		
		System.out.println("--------");
		
		//for文
		for(int i=0;i<canon.length;i++) {
			canon[i].eat();
		}
		
		System.out.println("--------");
		
		//拡張for文
		for(Human h:canon) {
			h.eat();
		}
	}

}
