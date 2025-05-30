
# API Test Projesi

Bu proje, **Rest Assured** kütüphanesi kullanılarak Java, Maven ve JUnit ile hazırlanmış basit bir REST API test projesidir. 

## İçerik

- GET ve POST istekleri için otomatik testler
- HTTP durum kodu doğrulama
- Response body içerisindeki beklenen değerlerin kontrolü
- Yanıt süresinin 1 saniyeden kısa olması durumu kontrolü

## Teknolojiler

- Java 11+
- Maven
- JUnit 5
- Rest Assured

## Projeyi Çalıştırmak İçin

1. Depoyu klonlayın veya indirin:
   ```bash
   git clone https://github.com/NovaFlareX/api-test.git
   cd api-test
   ```
2. Testleri çalıştırın:
   ```bash
   mvn clean test
   ```

## Test Senaryoları

- GET isteği ile API’dan veri çekme ve doğrulama
- POST isteği ile veri gönderme ve response kontrolü
- Her testte status code, response body ve yanıt süresi kontrolü yapılmaktadır

## Proje Yapısı

```
src/
 └── test/
     └── java/
         └── com/
             └── chelfor/
                 └── api/
                     └── ApiTest.java  # Test sınıfları burada
```

## İletişim

Mehmet Sinan Yılmaz  
E-posta: info@chelfor.net
