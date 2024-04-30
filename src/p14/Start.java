package p14;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMobileクラスのインスタンスを生成
		Mobile m =new Mobile("0120-123-456","キヤノン");
		
		//フィールドとメソッドにアクセス
//		m.setTelNo();
//		m.setMaker();
		
		m.talk();
		m.takePicture();

	}

}
