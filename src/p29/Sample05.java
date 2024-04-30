package p29;

public class Sample05 {

	public static void main(String[] args) {
		
		int a=10;
		//Integer x=new Integer(a); 今までのやり方		
		//Integer x=a; //自動変換
		Integer x=100; //オートボクシング
		
		
		//int b=x.intValue(); 今までのやり方
		int b=x;  //オートアンボクシング
		
		

	
		System.out.println(x);
		System.out.println(b);
		System.out.println(Integer.toBinaryString(10)); //2進数

		



	}

}
