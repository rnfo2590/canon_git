package p29;

public class Sample02 {

	public static void main(String[] args) {
		String s="ABCXYZCBA";
		
		System.out.println(s);
		
		System.out.println(s.length());//文字の長さ
		
		System.out.println(s.charAt(2)); //2番目(2号室)の文字を表示
		
		System.out.println(s.substring(3)); //3番目(3号室)以降を表示		
		System.out.println(s.substring(2,5)); //2から4番目を表示
		
		
		System.out.println(s.indexOf("C"));  //指定した文字が何号室にあるかを表示
		System.out.println(s.indexOf("D"));  //ない場合は-1と表示（部屋番号の確認）
		
		System.out.println(s.lastIndexOf("C"));//指定した文字で最後に出てくる順番のほうを表示
		
		System.out.println(s.startsWith("ABC"));//指定した文字列で始まっているかどうかの判定
		System.out.println(s.startsWith("CBR"));
		
		System.out.println(s.endsWith("CBA")); //指定した文字で終わっているかどうかの判定
		System.out.println(s.endsWith("ABC"));
		System.out.println("----");
		
		System.out.println(s.startsWith("XYZ",3));
		System.out.println(s.startsWith("XYZ",2));
		
		


	}

}
