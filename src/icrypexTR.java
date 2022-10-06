
import versionTR.*;
import versionTR.OzelliklerUrunler;

import java.util.Scanner;

public class icrypexTR {
    public static void tr() {

        Scanner scanner = new Scanner(System.in);

        Piyasalar piyasalar = new Piyasalar();
        OzelliklerUrunler ozelliklerurunler = new OzelliklerUrunler();
        OzelliklerKomisyonlar ozelliklerkomisyonlar = new OzelliklerKomisyonlar();
        OzelliklerLimitler ozelliklerlimitler = new OzelliklerLimitler();
        Bulten bulten = new Bulten();
        YardimMerkezi yardimMerkezi = new YardimMerkezi();
        KriptoParaCevirici kriptoParaCevirici = new KriptoParaCevirici();
        Madencilik madencilik = new Madencilik();
        registeredUser registeredUser = new registeredUser();
        registerUserFerhat registerUserFerhat = new registerUserFerhat();




        String olusanKullaniciAdi = "ali";
        String olusanKullanciParola = "ali123";
        String olusanKullaniciMail = "ali123@gmail.com";
        int olusanKullaniciYas;
        //Normalde 'U' komutu calisinca olan kullanici uyeligi icin otomasyon gerek.
        // Suan o olmadigi icin manipulatif bir cozum olusturdum.


        while (true) {
            System.out.println("\n\n\n\n\n\n\n\n     ₁₉₈₇ Web 1.0  ");
            System.out.println("\n\n-      https://www.Icrypex.com/tr \n");
            System.out.print("     🌐ICRYPEX ");
            System.out.println("      1- Piyasalar       2- Kolay Al Sat       Ozellikler          Teknoloji          Arastirma       Sirket             Yardim&Destek        8- PRO                           G - Giris Yap     U - Uye Ol ");
            System.out.println("                                                              3.1 Urunler         4.1 KP Ceviri      5.1 Bulten      6.1 Hakkimizda     7.1 YM");
            System.out.println("                                                              3.2 Komisyonlar     4.2 Madencilik     5.2 Portfoy     6.2 Sponsor        7.2 Duyurular");
            System.out.println("                                                              3.3 Limitler                           5.3 Blog        6.3 Yasal");
            System.out.println("                                                              3.4 Guvenlik                                           6.4 Bize Ulas");
            System.out.print("\n\n\n       Istenilen Islem Degerini Giriniz➡ : ");
            String istenilenIslem = scanner.nextLine();
            String tmmDevam;



            if (istenilenIslem.equals("1")) {
                System.out.println(piyasalar.getVeriler());
                tmmDevam = scanner.nextLine();
            }

            else if (istenilenIslem.equals("2"))
                System.out.println("null!");

            else if (istenilenIslem.equals("3.1"))
                System.out.println(ozelliklerurunler.getOzelliklerUrunler());

            else if (istenilenIslem.equals("3.2"))
                System.out.println(ozelliklerkomisyonlar.getOzelliklerKomisyonlar());

            else if (istenilenIslem.equals("3.3")) {

                System.out.print("\n\n\n\n\n                ▫️ 1- Kripto Transfer Limitler\n" +
                        "                     2- Banka Transfer Limitler\n" +
                        "                     3- Kripto Para Cekim Alt Limitleri\n" +
                        "                         Seciniz : ");
                String istenilenLimitIslemi = scanner.nextLine();

                if (istenilenLimitIslemi.equals("1"))
                    System.out.println(ozelliklerlimitler.getOzelliklerLimitler());

                else if (istenilenLimitIslemi.equals("2"))
                    System.out.println(ozelliklerlimitler.getOzelliklerLimitler2());

                else if (istenilenLimitIslemi.equals("3"))
                    System.out.println(ozelliklerlimitler.getOzelliklerLimitler3());

                else
                    System.out.println("\n\n                     Varsayilan Islem Degeri Giriniz ! \n\n");


            }
            else if (istenilenIslem.equals("3.4"))
                System.out.println("null!");

            else if (istenilenIslem.equals("4.1")) {

                System.out.println(kriptoParaCevirici.getKriptoParalar());
                System.out.print("\n\n                  🔸 Cevirilen Birimi Yaziniz : ");
                String cevirilenBirim = scanner.nextLine();

                System.out.print("                  🔸 Miktar Giriniz : ");
                double miktar1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("                  🔸 Cevirilecek Birimi Yaziniz : ");
                String cevirilecekBirim = scanner.nextLine();


                if (cevirilenBirim.equals("BTC") && (cevirilecekBirim.equals("Lira")))
                    System.out.println("\n                  🔸 Islem Sonucu Elde Edilen Lira : " + miktar1 * 372686.51);

                else if (cevirilenBirim.equals("BTC") && (cevirilecekBirim.equals("Dolar")))
                    System.out.println("\n                  🔸 Islem Sonucu Elde Edilen Dolar : " + miktar1 * 20076.60);

                else if (cevirilenBirim.equals("Lira") && (cevirilecekBirim.equals("BTC")))
                    System.out.println("\n                  🔸 Islem Sonucu Elde Edilen Bitcoin : " + miktar1 / 372686.51);

                else if (cevirilenBirim.equals("Dolar") && (cevirilecekBirim.equals("BTC")))
                    System.out.println("\n                  🔸 Islem Sonucu Elde Edilen Bitcoin : " + miktar1 / 20076.60);

                else if (cevirilenBirim.equals("Lira") && (cevirilecekBirim.equals("Dolar")))
                    System.out.println("\n                  🔸 Islem Sonucu Elde Edilen Dolar : " + miktar1 / 18.3 + "😟🙈");

                else if (cevirilenBirim.equals("Dolar") && (cevirilecekBirim.equals("Lira")))
                    System.out.println("\n                  🔸 Islem Sonucu Elde Edilen Lira : " + miktar1 * 18.3);
                else if(cevirilenBirim.equals("ETH")){
                    System.out.println("\n\n\n                  🔸ETH Islemleri Cok Yakinda... :) ");
                    break;
                }
                else
                    System.out.println("\n                  🚫 Gecersiz Izlem Denemesi 🚫");


            }

            else if (istenilenIslem.equals("4.2"))
                System.out.println(madencilik.getMadencilik());

            else if (istenilenIslem.equals("5.1"))
                System.out.println(bulten.getBulten());

            else if (istenilenIslem.equals("5.2"))
                System.out.println("null!");

            else if (istenilenIslem.equals("5.3"))
                System.out.println("null!");

            else if (istenilenIslem.equals("6.1"))
                System.out.println("\n\n\n                  🔸 Türkiye Kripto Para Borsaları Arasında Tamamen Türk Sermayesi Ile Kurulması ve Türk Yazılımcılar Tarafından Kodlanması Ile 🧑‍💻  Dikkat Ceken ICRYPEX,\n" +
                        "                     Türkiye’de ve Küreselde Gerçekleştirdiği Projelerle Ekosistemde Farklılık Yaratıyor.\n\n\n\n\n");

            else if (istenilenIslem.equals("6.2"))
                System.out.println("null!");

            else if (istenilenIslem.equals("6.3"))
                System.out.println("null!");

            else if (istenilenIslem.equals("6.4"))
                System.out.println("null!");

            else if (istenilenIslem.equals("7.1")) {

                System.out.print("\n\n\n                     Yardim Merkezine Baglaniliyor ...\n\n" +
                        "                  🔸1- Kripto Paralar Ile Ilgili Sorular\n" +
                        "                  🔸2- Blokzinciri Ile Ilgili Sorular\n" +
                        "                     Seciniz : ");
                String istenilenSoru = scanner.nextLine();
                if (istenilenSoru.equals("1")) {
                    System.out.println(yardimMerkezi.getSorular1());
                    System.out.print("                     Seciniz : ");
                    String istenilenKriptoSoru = scanner.nextLine();
                    if (istenilenKriptoSoru.equals("1.1"))
                        System.out.println(yardimMerkezi.getKriptoParaNe());

                    else if (istenilenKriptoSoru.equals("1.2"))
                        System.out.println(yardimMerkezi.getTokenNe());

                    else if (istenilenKriptoSoru.equals("1.3"))
                        System.out.println(yardimMerkezi.getBtcNe());

                    else if (istenilenKriptoSoru.equals("1.4"))
                        System.out.println(yardimMerkezi.getMadenciNe());

                    else if (istenilenKriptoSoru.equals("1.5"))
                        System.out.println(yardimMerkezi.getBtcmadenciligiNe());

                    else if (istenilenKriptoSoru.equals("1.6"))
                        System.out.println(yardimMerkezi.getItibariParaNe());

                    else
                        System.out.println("                     Gecerli Soru Numarasi Giriniz...");


                }
                else if (istenilenSoru.equals("2")) {

                    System.out.println(yardimMerkezi.getSorular2());
                    System.out.print("                     Seciniz : ");
                    String istenilenZincirSoru = scanner.nextLine();
                    if (istenilenZincirSoru.equals("2.1"))
                        System.out.println(yardimMerkezi.getZincirNe());

                    else if (istenilenZincirSoru.equals("2.2"))
                        System.out.println(yardimMerkezi.getHardforkNe());

                    else if (istenilenZincirSoru.equals("2.3"))
                        System.out.println(yardimMerkezi.getHashingNe());

                    else if (istenilenZincirSoru.equals("2.4"))
                        System.out.println(yardimMerkezi.getDefiNe());

                    else if (istenilenZincirSoru.equals("2.5"))
                        System.out.println(yardimMerkezi.getHavuzNe());

                    else if (istenilenZincirSoru.equals("2.6"))
                        System.out.println(yardimMerkezi.getKontratNe());

                    else
                        System.out.println("                     Gecerli Soru Numarasi Giriniz...");


                }
            }
            else if (istenilenIslem.equals("8"))
                System.out.println("                  🔸https://www.icrypex.com/tr/alis-satis");

            else if (istenilenIslem.equals("G")) {

                System.out.print("\n\n\n                  🔸Kullanici Adinizi Giriniz : ");
                String alinanKullaniciIsmi = scanner.nextLine();

                System.out.print("\n                  🔸Kullanici Mailinizi Giriniz : ");
                String alinanKullaniciMail = scanner.nextLine();

                System.out.print("\n                  🔸Kullanici Parolanizi Giriniz : ");
                String alinanKullanicParola = scanner.nextLine();

                if (alinanKullaniciIsmi.equals("dev.ferhatt") && alinanKullanicParola.equals("123456seven") && alinanKullaniciMail.equals("1@gmail.com")) {
                    System.out.println("\n                  🔸Sisteme Giriliyor...");
                }

                else if (alinanKullaniciIsmi.equals("dev.kaan") && alinanKullanicParola.equals("123456yedi") && alinanKullaniciMail.equals("2@gmail.com")) {
                    System.out.println("\n                  🔸Sisteme Giriliyor...");
                }

                else if (alinanKullaniciIsmi.equals(olusanKullaniciAdi) && alinanKullanicParola.equals(olusanKullanciParola) && alinanKullaniciMail.equals(olusanKullaniciMail)) {
                    // Veri tabanindan gelseydi...
                    System.out.println("\n                  🔸Sisteme Giriliyor...");

                }

                else{
                    System.out.println("\n                  🚫 Gecersiz Kullanici Bilgileri 🚫");
                    break;
                }



                Operasyonlar operasyonlar = new Operasyonlar();
                System.out.println(operasyonlar.getProcess());
                System.out.print("\n                    Seciniz : ");
                String istenilenKullaniciIslem = scanner.nextLine();






                if (istenilenKullaniciIslem.equals("Bakiye Sorgulama")) {
                    System.out.println(registerUserFerhat.getKullaniciBakiye());
                    break;
                }

                else if (istenilenKullaniciIslem.equals("Bakiye Yatirma")){
                    System.out.print("\n                  🔸Miktar Giriniz : ");
                    double yatirilanMiktar = scanner.nextDouble();
                    registerUserFerhat.setKullaniciBakiye(yatirilanMiktar + registerUserFerhat.getKullaniciBakiye());
                    System.out.println("\n                  🔸Yenilenen Bakiye : " + registerUserFerhat.getKullaniciBakiye());
                    break;

                }

                else if (istenilenKullaniciIslem.equals("Bakiye Cekim")){
                    System.out.print("\n                  🔸Miktar Giriniz : ");
                    double cekilenMiktar = scanner.nextDouble();
                    registerUserFerhat.setKullaniciBakiye(cekilenMiktar - registerUserFerhat.getKullaniciBakiye());
                    System.out.println("\n                  🔸Yenilenen Bakiye : " + registerUserFerhat.getKullaniciBakiye());
                    break;
                }

                else if (istenilenKullaniciIslem.equals("BTC Alim - Satim")){
                    System.out.print("\n                  🔸1.1 - BTC Almak\n" +
                            "                  🔸1.2 - BTC Satmak\n" +
                            "                    Seciniz : ");
                    String istenilenBtcIslem = scanner.nextLine();
                    if (istenilenBtcIslem.equals("1.1")){
                        System.out.println("\n                  🔸Hesabinizdaki Bakiye : " + registerUserFerhat.getKullaniciBakiye());
                        System.out.print("\n                  🔸Btc'ye Cevirilecek Miktari Giriniz : ");
                        double btcCevrilenBakiye = scanner.nextDouble();
                        double process1 = btcCevrilenBakiye/19598.43;
                        System.out.println("\n\n\n\n                  🔸" + btcCevrilenBakiye + " Miktar Ile Alinan BTC : " + process1 );
                        double process2 = btcCevrilenBakiye - registerUserFerhat.getKullaniciBakiye();
                        System.out.println("                  🔸Hesabinizda Kalan Miktar : " + process2);
                        double process3 =  process1 + registerUserFerhat.getKullaniciBtc();
                        System.out.println("                  🔸Hesabinizda Bulunan Toplam BTC : " + process3);
                    }

                    else if (istenilenBtcIslem.equals("1.2")){
                        System.out.println("\n                  🔸Hesabinizdaki BTC : " + registerUserFerhat.getKullaniciBtc());
                        System.out.print("\n                  🔸Dolara Cevirilecek BTC Miktarini Giriniz : ");
                        double dolaraCevirilenBTC = scanner.nextDouble();
                        double process1 =  dolaraCevirilenBTC*19598.43;
                        System.out.println("\n\n\n\n                  🔸" + dolaraCevirilenBTC + " Miktar Ile Cevirilen Dolar : " + process1 );
                        double process2 = dolaraCevirilenBTC - registerUserFerhat.getKullaniciBtc();
                        System.out.println("                  🔸Hesabinizda Kalan BTC Miktari : " + process2);
                        double process3 =  process1 + registerUserFerhat.getKullaniciBakiye();
                        System.out.println("                  🔸Hesabinizda Bulunan Toplam Dolar : " + process3);
                    }

                    else {
                        System.out.println("\n                  🚫 Gecersiz Deger 🚫\n" +
                                "                     Lutfen Caps Lock'a Dikkat Ediniz ve Tekrar Deneyiniz...\n\n\n");

                    }

                    break;
                }

                else if (istenilenKullaniciIslem.equals("Ethereum Alim - Satim")){
                    System.out.println("\n\n\n                  🔸COK YAKINDA :) ");
                }
                else{
                    System.out.println("\n                  🚫 Gecersiz Deger 🚫\n" +
                            "                     Lutfen Caps Lock'a Dikkat Ediniz ve Tekrar Deneyiniz...\n\n\n");
                }


            }


            else if (istenilenIslem.equals("U")) {

                System.out.print("\n\n\n                  🔸Yasinizi Giriniz :  : ");
                olusanKullaniciYas = scanner.nextInt();

                if (olusanKullaniciYas >= 18) {

                } else if (olusanKullaniciYas < 18) {
                    System.out.println("\n                  🔸Bu Site 18 Yas ve Uzeri Icin Kullanilmaktadir.");
                    break;
                } else {
                    System.out.println("\n                  🔸Yasinizi Tam Sayi Olarak Giriniz...");
                }
                scanner.nextLine();

                System.out.print("                  🔸Kullanici Adinizi Olusturunuz : ");
                olusanKullaniciAdi = scanner.nextLine();

                System.out.print("                  🔸Hesap Mail'i Olusturunuz :  : ");
                olusanKullaniciMail = scanner.nextLine();


                System.out.print("                  🔸Kullanici Parolanizi Olusturunuz : ");
                olusanKullanciParola = scanner.nextLine();
                System.out.println("\n\n\n                  🔸Yeni Kullanici Uyeligi Gerceklestirildi ✅ \n" +
                        "                    Anasayfa'dan Giris Yapmak Icin Enter'i Tuslayiniz...");
                scanner.nextLine();

            }
            else {
                System.out.println("\n\n                  🔸Gecerli Bir Islem Girmediniz !");
            }
        }

    }
}
