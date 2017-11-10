package lab1;

import java.util.Scanner;

public class Soru1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		double sayi1;
		double sayi2;
		double sonuc = 0;
		int secenek=-1;
		
		System.out.println("Sayi giriniz >>");
		Scanner girdi = new Scanner(System.in);
		sayi1 = girdi.nextDouble();
		sayi2 = girdi.nextDouble();
		
		System.out.println("Islem Menusu");
		System.out.println("1-Toplama");
		System.out.println("2-Cikarma");
		System.out.println("3-Carpma");
		System.out.println("4-Bolme");
		
		System.out.println("Islem Seciniz >> ");
		secenek = girdi.nextInt();
		
		switch(secenek){
		
		case 1:
			sonuc=sayi1+sayi2;
			break;
		case 2:
			sonuc=sayi1-sayi2;
			break;
		case 3:
			sonuc=sayi1*sayi2;
			break;
		case 4:
			sonuc=sayi1/sayi2;
			break;
		default:
			System.out.println("Bu islem gecersiz");
			
		}
		System.out.println("Sonuc :"+sonuc);
		System.out.println("Secilen islem : "+secenek);
		girdi.close();
		
		
	}

}
