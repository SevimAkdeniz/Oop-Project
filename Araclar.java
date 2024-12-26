/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package proje1;

/**
 *
 * @author akden
 */
public abstract class Araclar {
    String model;
    int yas;
    int serino;
    int fiyat;
    String renk;
    String yakit;
    int km;

    public Araclar(String model, int yas, String renk, String yakit, int km, int fiyat ,int serino) {
        this.model = model;
        this.yas = yas;
        this.fiyat = fiyat;
        this.serino = serino;
        this.yakit = yakit;
        this.renk = renk;
        this.km = km;        
    }
    
    public Araclar() {
    }

    public void setKm(int km) {
        this.km = km;
    }

    public void setRenk(String renk) {
        this.renk = renk;
    }

    public void setYakit(String yakit) {
        this.yakit = yakit;
    }

    
    public int getKm() {
        return km;
    }

    public String getRenk() {
        return renk;
    }

    public String getYakit() {
        return yakit;
    }

    
    
    
    
    public void setFiyat(int fiyat) {
        this.fiyat = fiyat;
    }

    public int getFiyat() {
        return fiyat;
    }
    
    

    public void setSerino(int serino) {
        this.serino = serino;
    }

    public int getSerino() {
        return serino;
    }

    
    public void setModel(String model) {
        this.model = model;
    }

    public void setYas(int yas) {
        this.yas = yas;
    }

    public String getModel() {
        return model;
    }

    public int getYas() {
        return yas;
    }
    
    
    
    
    
    public abstract void bilgigoster();
        
        
    
}
