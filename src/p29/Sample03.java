package p29;

public class Sample03 {

	public static void main(String[] args) {
		String s1="ABC";
		String s2="XYZ"; 
		String s3=" STU ";
		String s4="stu";
		
		System.out.println(s1.equals("ABC"));
		System.out.println(s1.equals("XYZ"));
		
		System.out.println(s1 +s2);
		System.out.println(s1.concat(s2)); //+と同じく連結を表す
		
		System.out.println(s3);
		System.out.println(s3.trim()); //空白を除去する
		
		System.out.println(s1.toLowerCase());//指定した文字を小文字に切り替え
		System.out.println(s4.toUpperCase());//指定した文字を大文字に切り替え

		
		


	}

}
