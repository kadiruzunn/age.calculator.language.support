package age.calculator.language.support;

import java.util.Scanner;

public class main {

	
	public static void main(String[] args) {
		

		Scanner input = new Scanner(System.in);
		System.out.println("HOS GELDINIZ. TURKCE DILI ICIN 'tr' INGILIZCE DILI ICIN 'en' YAZINIZ");
		String dilSecim = input.next();
	
		if (dilSecim.equals("en")) {
			System.out.println("You chose English. Please enter your birthday year : ");
		}else if(dilSecim.equals("tr")) {
			System.out.println("Turkce sectınız. Lütfen dogum yilinizi giriniz : ");
		}
	
		int yas = 0;
		int guncelYil = 2023;
		String yaş = "Yasiniz : ";
		
		Scanner kullaniciYasi = new Scanner(System.in);
		int dogumYİLİ = kullaniciYasi.nextInt();
		
		if (dilSecim.equals("tr") && dogumYİLİ < guncelYil) {
			System.out.println("Yasiniz : " + (guncelYil - dogumYİLİ));
		} else if (dilSecim.equals("en") && dogumYİLİ < guncelYil) {
			System.out.println("Your Age : " + (dogumYİLİ - guncelYil));
		}
	
	
	}

}
