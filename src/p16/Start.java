package p16;

public class Start {

	public static void main(String[] args) {
		Oya o1=new Oya();
		Kodomo k1=new Kodomo();
		
		Oya o2=new Kodomo();
		
//		Kodomo k2=new Oya();
//		Kodomo k3=o1;
//		Kodomo k4=(Kodomo)o1;
		Kodomo k5=(Kodomo)o2;//o2を子供のリモコンで動かしたい場合
		
		System.out.println(o2 instanceof Oya);
		System.out.println(o2 instanceof Kodomo);
		System.out.println(k5 instanceof Oya);
		System.out.println(k5 instanceof Kodomo);
	

	}

}
