package p23;

public class Oku implements Canon {

	@Override
	public void work() {
		System.out.println(Canon.COMPANY); //違うけどどちらでも可
		System.out.println("SEです");
		
		
	}

	@Override
	public void salary() {
		System.out.println("25万円です");
		
		
	}

}
