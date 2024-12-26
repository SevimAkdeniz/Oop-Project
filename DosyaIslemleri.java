/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje1;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author akden
 */
public class DosyaIslemleri {

    public DosyaIslemleri() {
    }
    
    
    
    public void kullaniciKaydet(Kullanicilar kullanici) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter("users.txt", true))) {
            writer.write(kullanici.getKullaniciAdi() + ":" + kullanici.getSifre());
            writer.newLine();
        } catch (IOException e) {
            System.out.println("Dosyaya yazma hatası: " + e.getMessage());
        }
    }

   
    public boolean girisYapDoğrulama(String kullaniciAdi, String sifre) {
        try (BufferedReader reader = new BufferedReader(new FileReader("users.txt"))) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(":");
                String dosyaKullaniciAdi = parts[0];
                String dosyaSifre = parts[1];

                if (kullaniciAdi.equals(dosyaKullaniciAdi) && sifre.equals(dosyaSifre)) {
                    return true;
                }
            }
        } catch (IOException e) {
            System.out.println("Dosya okuma hatası: " + e.getMessage());
        }

        return false; 
    }

   
}
