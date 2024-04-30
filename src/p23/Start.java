package p23;

public class Start {//配列バージョン

	public static void main(String[] args) {
		//Canon can=new Canon;  //これはできない
		Canon[] list = new Canon[2];

		list[0] = new Oku();
		list[1] = new Kudo();

		for (Canon c : list) {
			c.work();
			c.salary();
		}

//		c = new Kudo();
//		c.work();
//		c.salary();

	}

}
