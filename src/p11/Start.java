package p11;

public class Start {

	public static void main(String[] args) {
		//Cameraクラスを継承したMobileクラスのインスタンスを生成
		Mobile m =new Mobile();
		
		//フィールドとメソッドにアクセス
		m.telNo="0120-000-000";
		m.maker="キヤノン";
		
		m.talk();
		m.takePicture();

	}

}
