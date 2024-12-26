/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje1;

/**
 *
 * @author akden
 */
public class Motorlar extends Araclar{
    private int silindirsayisi;
    private int cc;

    public Motorlar(String model, int yas, int cc, int silindirsayisi, String renk, String yakit, int km, int fiyat, int serino) {
        super(model, yas, renk, yakit, km, fiyat, serino);
        this.silindirsayisi = silindirsayisi;
        this.cc = cc;
    }

    public void setCc(int cc) {
        this.cc = cc;
    }

    public int getCc() {
        return cc;
    }

    
    public void setSilindirsayisi(int silindirsayisi) {
        this.silindirsayisi = silindirsayisi;
    }

    public int getSilindirsayisi() {
        return silindirsayisi;
    }
    
 
    @Override
    public void bilgigoster() {
        
        System.out.println("Model : "+this.model+" , "+" Yas : "+this.yas+" , "+" Motor CC'si : "+this.cc+" , "+" Silindir sayisi : "+this.silindirsayisi+" , "+" Renk : "+ this.renk+" , "+ " Yakit turu : "+this.yakit+" , "+" Km durumu : "+this.km+" , "+" Fiyat : "+this.fiyat+" , "+" Seri numarasi : "+this.serino);
       
    }
    
    
    
}
