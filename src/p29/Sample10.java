package p29;

public class Sample10 {

	public static void main(String[] args) throws Exception {

		try {
			//			throw new NumberFormatException(); //無条件でエラーをスローする
			throw new Exception("エラーエラー");//投げた後に表示するため
		} catch (Exception e) {
			System.out.println("エラー！");
			System.out.println(e.getMessage());
			e.printStackTrace();  //何行目にエラーが出たか特定
		} finally {
			System.out.println("例外処理終了");
		}

		System.out.println("終了");

	}

}
