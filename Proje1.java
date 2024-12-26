 /*

 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package proje1;

import java.io.IOException;
import java.util.Scanner;

/// renk vites yakıt km beygir

// renk cc km yakit

/**
 *
 * @author akden
 */
public class Proje1 {
      
    
    public static void main(String[] args) throws IOException {      
        Scanner scanner = new Scanner(System.in);
        Kontrol k = new Kontrol();
        Arabalar a = new Arabalar();
        KayitIslemleri kayitIslemleri = new KayitIslemleri();
        boolean kgcikis = true;
        boolean ilkgiris = true;
        Kontrol kontrolObjesi = new Kontrol();
        
        Kontrol.filtrele f = kontrolObjesi.new filtrele();
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
        System.out.println("SEEKK OTO GALERISI");
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
        
         while(ilkgiris){

                System.out.println("1-) Patron Girisi");
                System.out.println("2-) Uye Girisi");
                System.out.println("3-) Uye Olmadan Devam Et");
                System.out.println("4-) Sistemi Kapat");

                while(!scanner.hasNextInt()){
                     System.out.println("Lutfen gecerli bir deger giriniz !");
                      scanner.next();
                 }
                int ilksecim = scanner.nextInt();
                 scanner.nextLine();
                 System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               
                boolean patrondeger=true;
                switch (ilksecim) {
                    case 1 -> {   
                        
                       Patron sevim = new Patron();
                       
                       System.out.println(" ");
                       if(sevim.devam == true){

                           while(patrondeger){
                               System.out.println("1-) Araba Islemleri");
                               System.out.println("2-) Motor Islemleri");
                               System.out.println("3-) Geri");
                               while(!scanner.hasNextInt()){
                                        System.out.println("Lutfen gecerli bir deger giriniz !");
                                         scanner.next();
                                    }
                               int aracsecim = scanner.nextInt();
                               System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
                               scanner.nextLine();

                               if(aracsecim == 1){
                                   boolean arabadongu = true;
                                   while(arabadongu){
                                        System.out.println("1-) Araba Ekle");
                                        System.out.println("2-) Araba Sil");
                                        System.out.println("3-) Araba Guncelle");
                                        System.out.println("4-) Arabalari Listele");
                                        System.out.println("5-) Geri");
                                        while(!scanner.hasNextInt()){
                                        System.out.println("Lutfen gecerli bir deger giriniz !");
                                         scanner.next();
                                    }
                                        int arabasecim = scanner.nextInt();
                                        scanner.nextLine();
                                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                   switch (arabasecim) {
                                       case 1 -> {
                                           k.arabaEkle();
                                           k.arabaDosyayaYaz();
                                           }

                                       case 2 -> {
                                           k.arabaSil();
                                           k.arabaDosyayaYaz();
                                           }
                                       case 3 -> {
                                           k.arabaGuncelle();
                                           k.arabaDosyayaYaz();
                                           }

                                       case 4 -> k.yazdir(1);

                                       case 5 -> arabadongu = false;
                                       default -> System.out.println("Lutfen Gecerli Bir Deger Giriniz !");
                                   }
                                   }



                               }
                               


                               else if(aracsecim == 2){
                                    boolean motordongu = true;
                                   while(motordongu){
                                        System.out.println("1-) Motor Ekle");
                                        System.out.println("2-) Motor Sil");
                                        System.out.println("3-) Motor Guncelle");
                                        System.out.println("4-) Motorlari Listele");
                                        System.out.println("5-) Geri");
                                        while(!scanner.hasNextInt()){
                                        System.out.println("lutfen gecerli bir deger giriniz !");
                                         scanner.next();
                                    }
                                        int motorsecim = scanner.nextInt();
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                       

                                   switch (motorsecim) {
                                       case 1 -> {
                                           k.motorEkle();
                                           k.motorDosyayaYaz();
                                           }

                                       case 2 -> {
                                           k.motorSil();
                                           k.motorDosyayaYaz();
                                           }
                                       case 3 -> {
                                           k.motorGuncelle();
                                           k.motorDosyayaYaz();
                                           }

                                       case 4 -> k.yazdir(2);

                                       case 5 -> motordongu = false;
                                       default -> System.out.println("Lutfen Gecerli Bir Deger Giriniz ! ");
                                   }
                                   }


                               }
                               
                               

                               else if(aracsecim == 3){
                                   patrondeger = false;
                               }
                               
                               else{
                                   System.out.println("Lutfen Gecerli Bir Deger Giriniz !");
                               }


                       }
                       }
                       
                      
                    }                ///// Patron girisi

                    case 2 -> {
                        while(kgcikis){
                            System.out.println("1-) Kayit Ol");
                            System.out.println("2-) Giris Yap");
                            System.out.println("3-) Geri");  
                            while(!scanner.hasNextInt()){
                                        System.out.println("Lutfen gecerli bir deger giriniz !");
                                         scanner.next();
                                    }
                            int secim = scanner.nextInt();
                          
                            scanner.nextLine(); 
                            switch (secim) {
                                case 1 -> 
                                    kayitIslemleri.kayitOl(scanner);
                                case 2 -> {
                                   
                                    boolean girisBasarili = kayitIslemleri.girisYap(scanner);
                                    if (girisBasarili=true) {
                                        
                                        boolean kullanicidongu = true;
                                        while (kullanicidongu) {  
                                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                            System.out.println("1-) Motorlari Gor");
                                            System.out.println("2-) Arabalari Gor");
                                            System.out.println("3-) Geri");
                                            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                            while(!scanner.hasNextInt()){
                                                    System.out.println("Lutfen gecerli bir deger giriniz !");
                                                     scanner.next();
                                                }
                                   int kullanicisec = scanner.nextInt();
                                   
                                   scanner.nextLine();
                               


                                        switch (kullanicisec) {
                                            case 1 -> {
                                                boolean filtreledongum = true;
                                                while(filtreledongum){
                                                    System.out.println("1-) Fiyatina Gore Artan");
                                                    System.out.println("2-) Fiyatina Gore Azalan");                                
                                                    System.out.println("3-) Modele Gore Arama");
                                                    System.out.println("4-) Fiyat Araligina Gore Arama");
                                                    System.out.println("5-) Motorlari Gor");
                                                    System.out.println("6-) Cikis");
                                                    while(!scanner.hasNextInt()){
                                                        System.out.println("Lutfen gecerli bir deger giriniz ! ");
                                                         scanner.next();
                                                    }
                                                    int filtresecim = scanner.nextInt();
                                                    scanner.nextLine();


                                                switch (filtresecim) {
                                                    case 1 -> {
                                                      System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        f.motorArtan();

                                                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               


                                                }
                                                    case 2 -> {
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        f.motorAzalan();
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                }                                      
                                                    case 3 -> {
                                                        System.out.println("Aramak istediginiz motorun modelini giriniz : ");
                                                        String model = scanner.nextLine();
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        f.motorFiltrele(model);
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               


                                                }                                                                             
                                                    case 4 -> {
                                                         System.out.println("Minumum degeri giriniz : ");
                                                        int min = scanner.nextInt();
                                                        scanner.nextLine();


                                                        System.out.println("Maximum degeri giriniz : ");
                                                        int max = scanner.nextInt();
                                                        scanner.nextLine();
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               


                                                        f.motorFiltrele(min, max);
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");


                                                }
                                                    case 5 -> {
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        k.yazdir(2);


                                                }                                                                          
                                                    case 6 -> {
                                                         filtreledongum = false;
                                                }                                   
                                                    default -> {System.out.println("Lutfen Gecerli Bir Deger Giriniz ! ");
                                                }

                                        }


                                                }
                                            }
                                            case 2 -> {
                                               boolean filtreledongua = true;
                                                while(filtreledongua){
                                                    System.out.println("1-) Fiyatina Gore Artan");
                                                    System.out.println("2-) Fiyatina Gore Azalan");                                
                                                    System.out.println("3-) Modele Gore Arama");
                                                    System.out.println("4-) Fiyat Araligina Gore Arama");
                                                    System.out.println("5-) Arabalari Gor");
                                                    System.out.println("6-) Cikis");
                                                    while(!scanner.hasNextInt()){
                                                            System.out.println("Lutfen gecerli bir deger giriniz ! ");
                                                             scanner.next();
                                                        }
                                                    int filtresecim = scanner.nextInt();
                                                    scanner.nextLine();


                                                switch (filtresecim) {
                                                    case 1 -> {
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        f.arabaArtan();
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               



                                                }
                                                    case 2 -> {
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        
                                                        f.arabaAzalan();
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                }                                      
                                                    case 3 -> {
                                                         System.out.println("Aramak istediginiz arabanin modelini giriniz : ");
                                                        String model = scanner.nextLine();
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        f.arabaFiltrele(model);
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               


                                                }                                                                             
                                                    case 4 -> {
                                                            System.out.println("Minumum degeri giriniz : ");
                                                        int min = scanner.nextInt();
                                                        scanner.nextLine();


                                                        System.out.println("Maximum degeri giriniz : ");
                                                        int max = scanner.nextInt();
                                                        scanner.nextLine();

                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        f.arabaFiltrele(min, max);
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               


                                                }
                                                    case 5 -> {
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                                                        k.yazdir(1);
                                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               


                                                }                                                                          
                                                    case 6 -> {
                                                         filtreledongua = false;
                                                }                                   
                                                    default -> {System.out.println("Lutfen Gecerli Bir Deger Giriniz ! ");
                                                }

                                        }


                                                }


                                    } 

                                            case 3 ->   {  kullanicidongu = false;  } 

                                    default -> System.out.println("Lutfen Gecerli Bir Deger Giriniz ! ");

                                }


                                        }  
                                        
                                        
                                        
                                        
                                        
                                    }
                                    
                                  
                                    
                                }
                                case 3 -> kgcikis=false;
                                default -> System.out.println("Lutfen Gecerli Bir Deger Giriniz ! ");
                            }
                        }   }                ///// uye girisi

                    case 3 -> {  
                       
                        boolean kullanicidongu = true;
                        while (kullanicidongu) {  
                            System.out.println("1-) Motorlari gor");
                            System.out.println("2-) Arabalari gor");
                            System.out.println("3-) Geri");
                         
                            while(!scanner.hasNextInt()){
                                        System.out.println("Lutfen gecerli bir deger giriniz ! ");
                                         scanner.next();
                                    }
                        
                        int kullanicisec = scanner.nextInt();
                        System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");

                        scanner.nextLine();
                        
                        switch (kullanicisec) {
                            case 1 -> {
                                boolean filtreledongum = true;
                                while(filtreledongum){
                                    System.out.println("1. Fiyatina gore artan");
                                    System.out.println("2. Fiyatina gore azalan");                                
                                    System.out.println("3. Modele gore arama");
                                    System.out.println("4. Fiyat araligina gore arama");
                                    System.out.println("5. Motorlari gor");
                                    System.out.println("6. Cikis");
                                    int filtresecim = scanner.nextInt();
                                    scanner.nextLine();
                                
                                switch (filtresecim) {
                                    case 1 -> {
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        f.motorArtan();
                                        
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        
                                        
                                }
                                    case 2 -> {
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        f.motorAzalan();
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                }                                      
                                    case 3 -> {
                                        System.out.println("Aramak istediginiz motorun modelini giriniz");
                                        String model = scanner.nextLine();
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        f.motorFiltrele(model);
                                        
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        
                                        
                                }                                                                             
                                    case 4 -> {
                                        System.out.println("Minumum degeri giriniz");
                                        int min = scanner.nextInt();
                                        scanner.nextLine();
                                        
                                        
                                        System.out.println("Maximum degeri giriniz");
                                        int max = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        f.motorFiltrele(min,max);
                                        
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        
                                        
                                }
                                    case 5 -> {
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        k.yazdir(2);
                                        
                                }                                                                          
                                    case 6 -> {
                                         filtreledongum = false;
                                }                                   
                                    default -> {System.out.println("Lutfen gecerli bir deger giriniz ! ");
                                }
                           
                        }
                                    
                                    
                                }
                            }
                            case 2 -> {
                               boolean filtreledongua = true;
                                while(filtreledongua){
                                    System.out.println("1-) Fiyatina Gore Artan");
                                    System.out.println("2-) Fiyatina Gore Azalan");                                
                                    System.out.println("3-) Modele Gore Arama");
                                    System.out.println("4-) Fiyat Araligina Gore Arama");
                                    System.out.println("5-) Arabalari Gor");
                                    System.out.println("6-) Cikis");
                                     while(!scanner.hasNextInt()){
                                            System.out.println("Lutfen gecerli bir deger giriniz ! ");
                                            scanner.next();
                                            
                                        }
                                     while(!scanner.hasNextInt()){
                                        System.out.println("Lutfen gecerli bir deger giriniz !");
                                         scanner.next();
                                    }
                                    int filtresecim = scanner.nextInt();
                                   
                                    scanner.nextLine();

                                
                                switch (filtresecim) {
                                    case 1 -> {
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        f.arabaArtan();
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        
                                        
                                }
                                    case 2 -> {
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        f.arabaAzalan();
                                        
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                }                                      
                                    case 3 -> {
                                        System.out.println("Aramak istediginiz arabanin modelini giriniz : ");                                   
                                        String modell = scanner.nextLine();
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        f.arabaFiltrele(modell);
                                        
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        
                                        
                                        
                                }                                                                             
                                    case 4 -> {
                                        System.out.println("Minumum degeri giriniz : ");            
                                        while(!scanner.hasNextInt()){
                                            System.out.println("Lutfen gecerli bir deger giriniz !");
                                            scanner.next();
                                        }
                                        
                                        while(!scanner.hasNextInt()){
                                        System.out.println("Lutfen gecerli bir deger giriniz ! ");
                                         scanner.next();
                                    }
                                        int minn = scanner.nextInt();
                                        scanner.nextLine();
                                        
                                        
                                        System.out.println("Maximum degeri giriniz ! ");
                                        while(!scanner.hasNextInt()){
                                        System.out.println("Lutfen gecerli bir deger giriniz ! ");
                                         scanner.next();
                                    }
                                           
                                        int maxx = scanner.nextInt();
                                        scanner.nextLine();
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        
                                        f.arabaFiltrele(minn, maxx);
                                        
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        
                                        
                                }
                                    case 5 -> {
                                        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

                                        k.yazdir(1);
                                        
                                }                                                                          
                                    case 6 -> {
                                         filtreledongua = false;
                                }                                   
                                    default -> {System.out.println("Lutfen Gecerli Bir Deger Giriniz ! ");
                                }
                           
                        }
                                    
                                    
                                }
        
                      
                    } 

                            case 3 ->   {  kullanicidongu = false;  } 

                    default -> System.out.println("Lutfen Gecerli Bir Deger Giriniz ! ");

                }
                        
                       
                        }                          
                            
                        }               ///// uye olmadan devam et
            
                    case 4 -> {
                        ilkgiris = false;
                    }
                        
                        
        }
        
        
        
       
        
        
        

     
    }
    
    }
    
}
