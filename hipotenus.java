package lab1;

import java.util.Scanner;

public class soru3 {
	
	public static void main(String[] args) {
		
		int x1,x2,y1,y2;
		float sonuc;
	
		
		System.out.println("x1 degeri giriniz:");
		Scanner girdi = new Scanner(System.in);
		x1 = girdi.nextInt();
		System.out.println("x2 degeri giriniz");
		x2 = girdi.nextInt();
		System.out.println("y1");
		y1 = girdi.nextInt();
		System.out.println("y2");
		y2 = girdi.nextInt();
		
		sonuc = (float) Math.sqrt(Math.pow((x2-x1),2) + Math.pow((y2-y1),2));

		System.out.println("Sonuc : "+sonuc);
	}

}
