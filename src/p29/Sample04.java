package p29;

public class Sample04 {

	public static void main(String[] args) {
		StringBuilder sb=new StringBuilder("ABC");
		
//		sb.append("012345678901234567");
	
		System.out.println(sb);
		System.out.println(sb.length());
		
		System.out.println(sb.capacity());//文字列の容量
		
		//BとCの間に文字を入れたい		
		sb.insert(2, "XYZ");  //2番目の後に入れたい
		System.out.println(sb);
		
		
		//置き換えたい
		System.out.println(sb.replace(1, 3, "DE"));
		System.out.println(sb.replace(1, 5, "DE")); //消える
		



	}

}
