package lab1;

import java.util.Scanner;

public class soru2 {

	public static void main(String[] args) {
		
		double para=0;
		float i;
		int kurus25=0;
		int kurus10=0;
		int kurus5=0;
		int kurus1=0;
		
		System.out.println("Elinizdeki parayi giriniz>> ");
		Scanner girilenPara = new Scanner(System.in);
		para = girilenPara.nextDouble();
		
		para = para*100;
		

			kurus25=(int) (para/25);
			para=kurus25%25;
			kurus10=(int) (para/10);
			para=kurus10%10;
			kurus5=(int) (para/5);
			para=kurus5%5;
			kurus1=(int) para;
		
		System.out.println("25 kuruslar>>"+kurus25);
		System.out.println("10 kuruslar>>"+kurus10);
		System.out.println("5 kuruslar>>"+kurus5);
		System.out.println("1 kuruslar>>"+kurus1);
		
		
	}
}
