
# Oop-Project

Bu proje, Nesne Yönelimli Programlama (Object-Oriented Programming - OOP) prensiplerini uygulayarak bir araç kiralama sistemi geliştirmeyi amaçlamaktadır. Sistem, farklı araç türlerini ve kullanıcı rollerini destekleyerek araç kiralama süreçlerini kolaylaştırır.

## İçindekiler

- [Genel Bakış](#genel-bakış)
- [Özellikler](#özellikler)
- [Gereksinimler](#gereksinimler)
- [Kurulum](#kurulum)
- [Kullanım](#kullanım)
- [Proje Yapısı](#proje-yapısı)
- [Katkıda Bulunma](#katkıda-bulunma)
- [Lisans](#lisans)

---

## Genel Bakış

Araç kiralama uygulaması, kullanıcıların araçları listeleyip kiralayabildiği ve sistem yöneticisinin araç ekleme, güncelleme veya silme işlemlerini gerçekleştirebildiği bir yazılımdır. Proje, nesne yönelimli programlama prensiplerini kullanarak modüler, ölçeklenebilir ve yönetilebilir bir yapı sunar.

---

## Özellikler

- **Araç Yönetimi**: Araç ekleme, silme ve güncelleme.
- **Kullanıcı Yönetimi**: Kullanıcıların kayıt olması ve giriş yapması.
- **Kiralama İşlemleri**: Araç kiralama ve iade süreçlerinin yönetimi.
- **Dosya İşlemleri**: Verilerin kalıcı olarak saklanması için dosya okuma ve yazma desteği.
- **Esnek Mimari**: Nesne yönelimli prensiplere uygun olarak tasarlanmış sınıf yapıları.

---

## Gereksinimler

- **Java Development Kit (JDK)**: 17 veya üstü
- **IDE**: IntelliJ IDEA, Eclipse veya herhangi bir Java IDE
- **Bir işletim sistemi**: Windows, MacOS veya Linux

---

## Kurulum

1. **Depoyu Klonlayın**  
   Proje dosyalarını yerel makinenize indirin:
   ```bash
   git clone https://github.com/SevimAkdeniz/Oop-Project.git
   ```

2. **Proje Dizini**  
   Klonlanan depo dizinine gidin:
   ```bash
   cd Oop-Project
   ```

3. **IDE'de Açın**  
   Favori IDE'nizi kullanarak projeyi açın ve `Proje1.java` ana sınıfını çalıştırın.

---

## Kullanım

1. **Programı Çalıştırın**  
   `Proje1.java` dosyasını çalıştırarak uygulamayı başlatın.

2. **Giriş Yapın veya Kaydolun**  
   Sistemi kullanabilmek için kullanıcı kaydı oluşturun veya mevcut bir hesapla giriş yapın.

3. **Araç Kiralama İşlemleri**  
   - Araçları listeleyin.
   - Bir araç seçin ve kiralama sürecini tamamlayın.
   - Kiralama süresi dolunca aracı iade edin.

4. **Yönetici İşlemleri**  
   Yönetici hesabıyla giriş yaparak araç ekleme, silme ve güncelleme işlemlerini gerçekleştirin.

---

## Proje Yapısı

```plaintext
Oop-Project/
├── src/
│   ├── main/
│   │   ├── Proje1.java       # Ana sınıf
│   │   ├── Arac.java         # Araç sınıfı
│   │   ├── Kullanici.java    # Kullanıcı sınıfı
│   │   ├── Yonetici.java     # Yönetici sınıfı
│   │   ├── DosyaIslemleri.java # Dosya işlemleri sınıfı
│   └── test/                 # Test dosyaları
└── README.md                 # Bu dosya
```

---

## Katkıda Bulunma

Bu projeye katkıda bulunmak isterseniz, lütfen aşağıdaki adımları izleyin:

1. **Fork Edin**: Bu repoyu kendi GitHub hesabınıza forklayın.
2. **Branch Oluşturun**: Yeni bir özellik veya düzeltme için bir branch oluşturun.
   ```bash
   git checkout -b yeni-ozellik
   ```
3. **Değişiklikleri Yapın**: Gerekli değişiklikleri kodunuza ekleyin.
4. **Pull Request Gönderin**: Değişikliklerinizi tartışmak için bir pull request oluşturun.

---

## Lisans

Bu proje herhangi bir lisans altında değildir. Herhangi bir şekilde kopyalanabilir ve kullanılabilir.

---

Eğer herhangi bir sorunuz varsa, lütfen proje sahibiyle iletişime geçin veya [Issues](https://github.com/SevimAkdeniz/Oop-Project/issues) sekmesine bir sorun bildirin.
``` 

Bu dosyayı `README.md` olarak kaydedebilirsiniz.
