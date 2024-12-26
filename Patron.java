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
public final class Patron {
    Scanner scanner = new Scanner(System.in);
    private final String kullaniciadi = "seek";
    private final int sifre = 123;
    public String Ad;
    public int sif;
    boolean devam;
    public Patron() {
        
        System.out.println("Kullanici Adini Giriniz : ");
        Ad= scanner.nextLine();
        System.out.println("Sifrenizi Giriniz : ");
        sif = scanner.nextInt();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

        System.out.println(" ");
        devam = adminKontrol();
        
    }

   
   public boolean adminKontrol(){
      int hak =3;
       while(hak>0){
            if(Ad.equals(this.kullaniciadi)&&sif == this.sifre){
                                
           System.out.println("Galeri kontrol paneline hosgeldiniz ! ");
           return true;
       }
       else{
           
                System.out.println("HATALI GIRIS !!!");
                System.exit(0);
                
            }
           
           
       }
       
       return false;
       
       
      
   }
    
    
    public String getKullaniciadi() {
        return kullaniciadi;
    }

    public int getSifre() {
        return sifre;
    }
   
   
    
}
