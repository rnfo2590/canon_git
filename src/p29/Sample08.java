package p29;

public class Sample08 {

	public static void main(String[] args) {

		try {
			System.out.println(10 / 0);
			System.out.println(Integer.parseInt("A100"));

		} catch (ArithmeticException e) { 
			System.out.println("0で割れないよ");
		} catch (Exception e) {  //すべての例外の親なので他をカバー
			System.out.println("エラー！");
		} finally {
			System.out.println("例外処理終了");
		}

		//		System.out.println("終了");

	}

}
