package ders3;

// JAVA working with Arrays about Sorting and Random values
// Can Yuva
// github.com/canyuva

import java.util.Random; 
import java.util.Arrays;

public class Array {

	public static void main(String[] args) {
		int [] dizi = new int [5];
		
		Random rd = new Random();
		for(int i=0;i<dizi.length;i++) {
		dizi[i] = rd.nextInt(50);			// Filling random values in our array
		}
		System.out.println("Before sort:");
		for (int i: dizi) {
			System.out.println(i + "\t" );
		}
		
		Arrays.sort(dizi);			// Sorting method for our array
		System.out.println("----------");
		System.out.println("After sort:");
		for (int i: dizi) {
			System.out.println(i + "\t" );
		}
	}

}
