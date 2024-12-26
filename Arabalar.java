/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje1;

/**
 *
 * @author akden
 */
public class Arabalar extends Araclar{
    
    private int kapisayisi;
    private String vites;
   

    public Arabalar(String model, int yas, String vites  , int kapisayisi, String renk, String yakit, int km, int fiyat, int serino) {
        super(model, yas, renk, yakit, km, fiyat, serino);
      
        this.kapisayisi = kapisayisi;
        this.vites = vites;
     
    }

    public Arabalar() {
    }

    public void setVites(String vites) {
        this.vites = vites;
    }

    public String getVites() {
        return vites;
    }
    

    public void setKapisayisi(int kapisayisi) {
        this.kapisayisi = kapisayisi;
    }

    public int getKapisayisi() {
        return kapisayisi;
    }

    @Override
    public void bilgigoster() {
        System.out.println("Model : "+this.model+" , "+" Yas : "+this.yas+" , "+" Vites turu : "+this.vites+" , "+" Kapi sayisi : "+this.kapisayisi+" , "+" Renk : "+ this.renk+" , "+ " Yakit turu : "+this.yakit+" , "+" Km durumu : "+this.km+" , "+" Fiyat : "+this.fiyat+" , "+" Seri numarasi : "+this.serino);
    }
    
    
    
}
