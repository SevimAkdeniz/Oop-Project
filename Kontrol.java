/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author akden
 */
public class Kontrol {
    
    class filtrele{

        public filtrele() {
        }
        
     
        public void arabaFiltrele(String model){
          for(Arabalar a : arabaListesi){
            if(a.getModel().contains(model)){
                a.bilgigoster();
            }
            
        }
            
        }
        
        public void arabaFiltrele(int min, int max){
            for(Arabalar a : arabaListesi){
           if(a.getFiyat()>= min && a.getFiyat() <=max){
              a.bilgigoster();
           }         
        }    
        }
        
        public void motorFiltrele(String model){
            for(Motorlar a : motorlistesi){
            if(a.getModel().contains(model)){
                a.bilgigoster();
            }
            
        }
            
        }
        
        public void motorFiltrele(int min, int max){
            for(Motorlar a : motorlistesi){
           if(a.getFiyat()>= min && a.getFiyat() <=max){
              a.bilgigoster();
           }
            
        }
        }
        
        public void arabaArtan() {

            Collections.sort(arabaListesi, new Comparator<Arabalar>() {
                @Override
                public int compare(Arabalar a1, Arabalar a2) {              
                    return Integer.compare(a1.getFiyat(), a2.getFiyat());
                }
            });


            for (Arabalar a : arabaListesi) {
                a.bilgigoster();  
            }
        }

        public void arabaAzalan(){
                Collections.sort(arabaListesi, (Arabalar a1, Arabalar a2) -> Integer.compare(a2.getFiyat(), a1.getFiyat()));

                for (Arabalar a : arabaListesi) {
                    a.bilgigoster();  
                }
        }

        public void motorArtan(){
            Collections.sort(motorlistesi, new Comparator<Motorlar>() {
                @Override
                public int compare(Motorlar a1, Motorlar a2) {              
                    return Integer.compare(a1.getFiyat(), a2.getFiyat());
                }
            });


            for (Motorlar a : motorlistesi) {
                a.bilgigoster();  
            }
        }

        public void motorAzalan(){
            Collections.sort(motorlistesi, (Motorlar a1, Motorlar a2) -> {
                return Integer.compare(a2.getFiyat(), a1.getFiyat());
            });

                for (Motorlar a : motorlistesi) {
                    a.bilgigoster();  
                }
        }       
    }

    Scanner scanner = new Scanner(System.in);
    Araclar arac;
    Arabalar araba;
    Motorlar motor;
    List<Arabalar> arabaListesi = new ArrayList<>();
    List<Motorlar> motorlistesi = new ArrayList<>();
    File file = new File("motorlar.txt");
    File filee = new File("arabalar.txt");

    public Kontrol() throws IOException {
        file.createNewFile();
        filee.createNewFile();
        arabaOku();
        motorOku();
        
    }
        
    
    public void yazdir(int secim){     
        if(secim == 1){
         
        for(Arabalar i: arabaListesi){           
            i.bilgigoster();
        } 
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
            
        }
        else if( secim == 2){
            

        for(Motorlar i: motorlistesi){          
            i.bilgigoster();
        }   
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");
    
        }
        else{
            System.out.println("Lutfen gecerli bir deger giriniz ! ");
        }
                        
       
    } 
 
    public void arabaOku(){
         
        
        try (BufferedReader reader = new BufferedReader(new FileReader("arabalar.txt"))) {
            String satir;
            while ((satir = reader.readLine()) != null) {
                String[] veriler = satir.split(",");
                String model = veriler[0];
                int yas = Integer.parseInt(veriler[1]);
                String vites = veriler[2];
                int kapisayisi = Integer.parseInt(veriler[3]);
                String renk = veriler[4];
                String yakit = veriler[5];
                int km = Integer.parseInt(veriler[6]);
                int fiyat = Integer.parseInt(veriler[7]);
                int serino = Integer.parseInt(veriler[8]);
                
                Arabalar araba = new Arabalar(model,yas,vites,kapisayisi,renk,yakit,km,fiyat,serino);
                arabaListesi.add(araba);
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }

    }

    public void motorOku(){
         
        
        try (BufferedReader reader = new BufferedReader(new FileReader("motorlar.txt"))) {
            String satirr;
            while ((satirr = reader.readLine()) != null) {
                String[] verilerr = satirr.split(",");
                String model = verilerr[0];
                int yas = Integer.parseInt(verilerr[1]);
                int cc =  Integer.parseInt(verilerr[2]);
                int silindirsayisi = Integer.parseInt(verilerr[3]);
                String renk = verilerr[4];
                String yakit = verilerr[5];
                int km = Integer.parseInt(verilerr[6]);
                int fiyat = Integer.parseInt(verilerr[7]);
                int serino = Integer.parseInt(verilerr[8]);

                Motorlar motor= new Motorlar(model,yas,cc,silindirsayisi,renk,yakit,km,fiyat,serino);
                motorlistesi.add(motor);
                
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }
    }
    
    public void motorEkle(){
        System.out.println("Model Giriniz");
        String model = scanner.nextLine();
        
        System.out.println("Yas Giriniz");
        while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
        int yas = scanner.nextInt();  
        scanner.nextLine();
        
        
         System.out.println("Motorun CC'sini Giriniz");
         while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
         int cc = scanner.nextInt();
         scanner.nextLine();
        
        System.out.println("Silindir Sayisi Giriniz");
        while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
        int silindir = scanner.nextInt();
        scanner.nextLine();
        
         System.out.println("Renk Giriniz");
        String renk = scanner.nextLine();
        
         System.out.println("Yakit Giriniz");
        String yakit = scanner.nextLine();
        
        System.out.println("KM Giriniz");
        while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
        
        while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
        int km = scanner.nextInt();
        scanner.nextLine();
        
          System.out.println("Fiyat Giriniz");
          while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
          
         while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
         int fiyat = scanner.nextInt();
         scanner.nextLine();
        
        System.out.println("Seri No Giriniz");
        
        while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
        int serino = scanner.nextInt();
        scanner.nextLine();
        
       
        
    
        motor = new Motorlar(model,yas,cc,silindir,renk,yakit,km,fiyat,serino);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        motor.bilgigoster();
        
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        motorlistesi.add(motor);
        
        
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("motorlar.txt", true))) {
            writer.write(motor.getModel()+","+motor.getYas()+","+motor.getCc()+","+motor.getSilindirsayisi()+","+motor.getRenk()+","+motor.getYakit()+","+motor.getKm()+","+motor.getFiyat()+","+motor.getSerino());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatası: " + e.getMessage());
        }
        
    }
    
    public void arabaEkle(){
        System.out.println("Model Giriniz");
        String model = scanner.nextLine();
        
        System.out.println("Yas Giriniz");
        
        while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();                          
        }
        int yas = scanner.nextInt();
        scanner.nextLine();
        
        
         System.out.println("Vites Giriniz");
         String vites = scanner.nextLine();
         
        
        System.out.println("Kapi Sayisi Giriniz");
        while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
        int kapisayisi = scanner.nextInt();
        scanner.nextLine();
        
         System.out.println("Renk Giriniz");
        String renk = scanner.nextLine();
        
         System.out.println("Yakit Giriniz");
        String yakit = scanner.nextLine();
        
        System.out.println("KM Giriniz");
        while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
        int km = scanner.nextInt();
        scanner.nextLine();
 
         System.out.println("Fiyat Giriniz");
         while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
         int fiyat = scanner.nextInt();
         scanner.nextLine();
         
          System.out.println("Seri No Giriniz");
          while(!scanner.hasNextInt()){
              System.out.println("lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
        int serino = scanner.nextInt();
        scanner.nextLine();
        
    
        araba = new Arabalar(model,yas,vites,kapisayisi,renk,yakit,km,fiyat,serino);
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        araba.bilgigoster();
      
        System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");

        arabaListesi.add(araba);
        
        
        
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("arabalar.txt", true))) {
            writer.write(araba.getModel()+","+araba.getYas()+","+araba.getVites()+","+araba.getKapisayisi()+","+araba.getRenk()+","+araba.getYakit()+","+araba.getKm()+","+araba.getFiyat()+","+araba.getSerino());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatası: " + e.getMessage());
        }
        
    }
    
    public void arabaSil() {
            System.out.println("Kaldirmak istediginiz arabanin seri numarasini giriniz");
            while(!scanner.hasNextInt()){
              System.out.println("Lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
        }
            int serino = scanner.nextInt();
            scanner.nextLine();

            Iterator<Arabalar> iterator = arabaListesi.iterator();


            while (iterator.hasNext()) {
                Arabalar a = iterator.next();
                if (a.getSerino() == serino) {
                    iterator.remove();  
                    System.out.println("Araba basariyla sistemden kaldirildi !");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                    return;  
                }
            }


            System.out.println("Girilen seri numarasina sahip araba bulunamadi !");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

        }
      
    public void motorSil(){
         System.out.println("Kaldirmak istediginiz motorun seri numarasini giriniz");
         while(!scanner.hasNextInt()){
              System.out.println("Lutfen gecerli bir deger giriniz");
              scanner.next();
                                   
          }
            int serino = scanner.nextInt();
            scanner.nextLine();
            Iterator<Motorlar> iterator = motorlistesi.iterator();


            while (iterator.hasNext()) {
                Motorlar a = iterator.next();
                if (a.getSerino() == serino) {
                    iterator.remove();  
                    System.out.println("Motor basariyla sistemden kaldirildi.");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                    return;  
                }
            }


            System.out.println("Girilen seri numarasina sahip bir araba bulunamadi.");
            System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

    }
    
    public void motorGuncelle(){
            System.out.println("Guncellemek istediginiz motorun seri numarasini giriniz ");
             while(!scanner.hasNextInt()){
              System.out.println("Lutfen gecerli bir deger giriniz !");
              scanner.next();                              
          }
            int serino = scanner.nextInt();
            scanner.nextLine();  
            boolean arabaBulundu = false;  
            
            for (int i = 0; i < motorlistesi.size(); i++) {
                Motorlar a = motorlistesi.get(i); 
                if (a.getSerino() == serino) {
                    arabaBulundu = true;        
                    
                    
                        System.out.println("Model giriniz");
                        String model = scanner.nextLine();

                        System.out.println("Yas giriniz");
                        while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz !");
                            scanner.next();
                            }
                         while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz !");
                            scanner.next();
                            }
                        int yas = scanner.nextInt();
                        scanner.nextLine();


                         System.out.println("Motorun CC'sinini giriniz");
                         while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz !");
                            scanner.next();
                            }
                         int cc = scanner.nextInt();
                         scanner.nextLine();

                        System.out.println("Silindir sayisi giriniz");
                        while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz !");
                            scanner.next();
                           }
                        int silindir = scanner.nextInt();
                        scanner.nextLine();

                         System.out.println("Renk giriniz");
                        String renk = scanner.nextLine();

                         System.out.println("Yakit giriniz");
                        String yakit = scanner.nextLine();

                        System.out.println("KM giriniz:");
                        while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz ! ");
                            scanner.next();
                            }
                        int km = scanner.nextInt();
                        scanner.nextLine();

                          System.out.println("Fiyat giriniz");
                          while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz !");
                            scanner.next();
                            }
                         int fiyat = scanner.nextInt();
                         scanner.nextLine();

       
                    
                    

                    
                    motorlistesi.set(i, new Motorlar(model,yas,cc,silindir,renk,yakit,km,fiyat,serino));

                    System.out.println("Guncelleme basarili.");
                   System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                    motorlistesi.get(i).bilgigoster(); 
                   System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                    break;  
                }
            }

    
                if (!arabaBulundu) {
                    System.out.println("Seri numarasina sahip bir araba bulunamadi.");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                }
    }
     
    public void motorDosyayaYaz(){
           File file = new File("motorlar.txt"); 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
           
            writer.write(""); 
           
        } catch (IOException e) {
            System.out.println("Dosya temizlenirken bir hata oluştu: " + e.getMessage());
        }
           
           for(Motorlar a : motorlistesi){
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("motorlar.txt", true))) {
            writer.write(a.getModel()+","+a.getYas()+","+a.getCc()+","+a.getSilindirsayisi()+","+a.getRenk()+","+a.getYakit()+","+a.getKm()+","+a.getFiyat()+","+a.getSerino());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatası: " + e.getMessage());
        }
           }
           
    }
     
    public void arabaDosyayaYaz() {
           
            File file = new File("arabalar.txt"); 
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(file))) {
           
            writer.write(""); 
            
        } catch (IOException e) {
            System.out.println("Dosya temizlenirken bir hata oluştu: " + e.getMessage());
        }
           
           for(Arabalar a : arabaListesi){
                try (BufferedWriter writer = new BufferedWriter(new FileWriter("arabalar.txt", true))) {
            writer.write(a.getModel()+","+a.getYas()+","+a.getVites()+","+a.getKapisayisi()+","+a.getRenk()+","+a.getYakit()+","+a.getKm()+","+a.getFiyat()+","+a.getSerino());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatası: " + e.getMessage());
        }
           }
           
           
           
           
           
       }
       
    public void arabaGuncelle(){
            System.out.println("Guncellemek istediginiz arabanin seri numarasini giriniz. ");
            while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz !");
                            scanner.next();
                            }
            int serino = scanner.nextInt();
            scanner.nextLine();  
            boolean arabaBulundu = false;  
            
            for (int i = 0; i < arabaListesi.size(); i++) {
                Arabalar a = arabaListesi.get(i); 
                if (a.getSerino() == serino) {
                    arabaBulundu = true;          
                    
                    System.out.println("Model giriniz");
                    String model = scanner.nextLine();

                    System.out.println("Yas giriniz");
                    while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz ! ");
                            scanner.next();
                            }
                    int yas = scanner.nextInt();
                    scanner.nextLine();


                     System.out.println("Vites giriniz");
                     String vites = scanner.nextLine();


                    System.out.println("Kapi sayisi giriniz");
                    while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz ! ");
                            scanner.next();
                            }
                    int kapisayisi = scanner.nextInt();
                    scanner.nextLine();

                     System.out.println("Renk giriniz");
                    String renk = scanner.nextLine();

                     System.out.println("Yakit giriniz");
                    String yakit = scanner.nextLine();

                    System.out.println("KM giriniz:");
                    while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz ! ");
                            scanner.next();
                            }
                    int km = scanner.nextInt();
                    scanner.nextLine();

                     System.out.println("Fiyat giriniz");
                     while(!scanner.hasNextInt()){
                            System.out.println("Lutfen gecerli bir deger giriniz ! ");
                            scanner.next();
                            }
                     int fiyat = scanner.nextInt();
                     scanner.nextLine();


                    
                    arabaListesi.set(i, new Arabalar(model,yas,vites,kapisayisi,renk,yakit,km,fiyat,serino));

                    

                    System.out.println("Guncelleme basarili ! ");
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");
                    arabaListesi.get(i).bilgigoster(); 
                    System.out.println("---------------------------------------------------------------------------------------------------------------------------------------");

                    break;  
                }
            }

    
                if (!arabaBulundu) {
                    System.out.println("Seri numarasına sahip bir araba bulunamadı.");
                    System.out.println("----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------");               

                }
           
           
       }
    
   
    
    
}


    



    
       
      
    
       
    
       
       
       
       
       
       
       
   
     
     
     
     
     
     
     
     
      

