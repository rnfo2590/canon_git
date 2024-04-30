package p29;

public class Sample09 {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
			System.out.println(Integer.parseInt("A100"));

		} catch (Exception e) {  //どんな例外でも処理する場合はこれのみ
			System.out.println("エラー！");
		} finally {
			System.out.println("例外処理終了");
		}

		//		System.out.println("終了");

	}

}
