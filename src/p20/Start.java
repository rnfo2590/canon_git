package p20;

public class Start {  //p19の配列バージョン

	public static void main(String[] args) {
		//Controller c=new Controller();  //←できない
		
		Controller[] list = new Controller[2];

		list[0] = new Baseball();
		list[1] = new Mario();

		for (Controller con : list) {
			con.pushA();
			con.pushB();
			System.out.println("---------");

		}

		//		con=new Mario();
		//		con.pushA();
		//		con.pushB();

	}

}
