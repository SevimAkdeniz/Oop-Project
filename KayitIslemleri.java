/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje1;

import java.util.Scanner;

/**
 *
 * @author akden
 */
public class KayitIslemleri {
    private DosyaIslemleri dosyaIslemleri;

    public KayitIslemleri() {
        this.dosyaIslemleri = new DosyaIslemleri();
    }

   
    public void kayitOl(Scanner scanner) {
        System.out.print("Kullanici Adinizi Girin: ");
        String kullaniciAdi = scanner.nextLine();
        System.out.print("Sifrenizi Giriniz: ");
        String sifre = scanner.nextLine();

        Kullanicilar yeniKullanici = new Kullanicilar(kullaniciAdi, sifre);
        dosyaIslemleri.kullaniciKaydet(yeniKullanici);
        System.out.println("Kullanici basariyla kaydedildi.");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

    }

   
    public boolean girisYap(Scanner scanner) {
         int hak = 3; 

        while (hak > 0) {
            System.out.print("Kullanici Adinizi Girin :  ");
            String kullaniciAdi = scanner.nextLine();
            System.out.print("Sifrenizi Giriniz :  ");
            String sifre = scanner.nextLine();

            
            boolean girisBasarili = dosyaIslemleri.girisYapDoğrulama(kullaniciAdi, sifre);

            if (girisBasarili) {
                System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                
                System.out.println("Sayin " + kullaniciAdi + ",Seek oto galerimize Hosgeldiniz!");
                

                return true; 
            } else {
                hak--; 
                if (hak > 0) {
                    System.out.println("Gecersiz kullanici adi veya sifre. Kalan hakkiniz : " + hak);
                } else {
                    System.out.println("3 Yanlis giris yapildi. Sistem sonlandiriliyor...");
                    System.exit(0);
                }
            }
        }
        return false; 
    }
}
