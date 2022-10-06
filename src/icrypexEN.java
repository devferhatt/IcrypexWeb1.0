import versionEN.*;

import java.util.Scanner;




public class icrypexEN{
    public static void eng() {



        Scanner scanner = new Scanner(System.in);

        Markets markets = new Markets();
        Features_Products features_products = new Features_Products();
        Features_Commissions features_commissions = new Features_Commissions();
        Features_Limits features_limits = new Features_Limits();
        DailyBulletin dailyBulletin = new DailyBulletin();
        HelpCenter helpCenter = new HelpCenter();
        CryptoCurrencyConverter cryptoCurrencyConverter = new CryptoCurrencyConverter();
        Mining mining = new Mining();
        registeredUser registeredUser = new registeredUser();
        registerUserFerhat registerUserFerhat = new registerUserFerhat();





        String olusanKullaniciAdi = "ali";
        String olusanKullanciParola = "ali123";
        String olusanKullaniciMail = "ali123@gmail.com";
        int olusanKullaniciYas;
        //Automation is required for user membership, which is normally when the 'U' command works.
        //Since I did not learn about it, I resorted to a manipulative way.

        while (true) {
            System.out.println("\n\n\n\n\n\n\n\n     ₁₉₈₇ Web 1.0  ");
            System.out.println("\n\n-      https://www.Icrypex.com/en \n");
            System.out.print("     🌐ICRYPEX ");
            System.out.println("      1- Markets       2- Easy Buy & Sell      Features              Technology            Research            Company          Help&support        8- PRO                           G - Log in     U - Sig in");
            System.out.println("                                                              3.1 Products          4.1 CM Converter      5.1 Bulletin        6.1 About us     7.1 HC");
            System.out.println("                                                              3.2 Commissions       4.2 Mining            5.2 portfolio       6.2 Sponsor      7.2 Announcements");
            System.out.println("                                                              3.3 Limits                                  5.3 Blog            6.3 Legal");
            System.out.println("                                                              3.4 Security                                                    6.4 Contact Us");
            System.out.print("\n\n\n       Enter the Desired Transaction Value➡ : ");
            String istenilenIslem = scanner.nextLine();
            String tmmDevam;



            if (istenilenIslem.equals("1")) {
                System.out.println(markets.getMarkets());
                tmmDevam = scanner.nextLine();
            }

            else if (istenilenIslem.equals("2"))
                System.out.println("null!");

            else if (istenilenIslem.equals("3.1"))
                System.out.println(features_products.getFeatures_Products());

            else if (istenilenIslem.equals("3.2"))
                System.out.println(features_commissions.getFeatures_Commissions());

            else if (istenilenIslem.equals("3.3")) {

                System.out.print("\n\n\n\n\n                ▫️ 1- Crypto Transfer Limiter\n" +
                        "                     2- Bank Transfer Limits\n" +
                        "                     3- Crypto Withdrawal Lower Limits\n" +
                        "                         Choose : ");
                String istenilenLimitIslemi = scanner.nextLine();

                if (istenilenLimitIslemi.equals("1"))
                    System.out.println(features_limits.getFeatures_Limits());

                else if (istenilenLimitIslemi.equals("2"))
                    System.out.println(features_limits.getFeatures_Limits2());

                else if (istenilenLimitIslemi.equals("3"))
                    System.out.println(features_limits.getFeatures_Limits3());

                else
                    System.out.println("\n\n                     Enter Default Transaction Value ! \n\n");


            }
            else if (istenilenIslem.equals("3.4"))
                System.out.println("null!");

            else if (istenilenIslem.equals("4.1")) {

                System.out.println(cryptoCurrencyConverter.getCryptoCurrencyConverter());
                System.out.print("\n\n                  🔸 Enter the Converted Unit : ");
                String cevirilenBirim = scanner.nextLine();

                System.out.print("                  🔸 Enter Quantity : ");
                double miktar1 = scanner.nextDouble();
                scanner.nextLine();

                System.out.print("                  🔸 Type the Unit to be Converted : ");
                String cevirilecekBirim = scanner.nextLine();


                if (cevirilenBirim.equals("BTC") && (cevirilecekBirim.equals("Lira")))
                    System.out.println("\n                  🔸 Lira Obtained as a Result of Transaction : " + miktar1 * 372686.51);

                else if (cevirilenBirim.equals("BTC") && (cevirilecekBirim.equals("Dolar")))
                    System.out.println("\n                  🔸 Dollars Obtained as a Result of Transaction : " + miktar1 * 20076.60);

                else if (cevirilenBirim.equals("Lira") && (cevirilecekBirim.equals("BTC")))
                    System.out.println("\n                  🔸 Bitcoin Obtained as a Result of Transaction : " + miktar1 / 372686.51);

                else if (cevirilenBirim.equals("Dolar") && (cevirilecekBirim.equals("BTC")))
                    System.out.println("\n                  🔸 Bitcoin Obtained as a Result of Transaction : " + miktar1 / 20076.60);

                else if (cevirilenBirim.equals("Lira") && (cevirilecekBirim.equals("Dolar")))
                    System.out.println("\n                  🔸 Dollars Obtained as a Result of Transaction : " + miktar1 / 18.3 + "😟🙈");

                else if (cevirilenBirim.equals("Dolar") && (cevirilecekBirim.equals("Lira")))
                    System.out.println("\n                  🔸 Lira Obtained as a Result of Transaction : " + miktar1 * 18.3);
                else if(cevirilenBirim.equals("ETH")){
                    System.out.println("\n\n\n                  🔸ETH Transactions Coming Soon :) ");
                    break;

                }
                else
                    System.out.println("\n                  🚫 Invalid Tracking Attempt 🚫");


            }

            else if (istenilenIslem.equals("4.2"))
                System.out.println(mining.getMining());

            else if (istenilenIslem.equals("5.1"))
                System.out.println(dailyBulletin.getDailyBulletin());

            else if (istenilenIslem.equals("5.2"))
                System.out.println("null!");

            else if (istenilenIslem.equals("5.3"))
                System.out.println("null!");

            else if (istenilenIslem.equals("6.1"))
                System.out.println("\n\n\n                  🔸 ICRYPEX, which draws attention among Turkish Cryptocurrency Exchanges with its establishment entirely with Turkish capital and coding by Turkish software developers,\n" +
                        "                     It Makes a Difference in the Ecosystem with the Projects It Implemented in Turkey and Globally.\n\n\n\n\n");

            else if (istenilenIslem.equals("6.2"))
                System.out.println("null!");

            else if (istenilenIslem.equals("6.3"))
                System.out.println("null!");

            else if (istenilenIslem.equals("6.4"))
                System.out.println("null!");

            else if (istenilenIslem.equals("7.1")) {

                System.out.print("\n\n\n                     Connecting to the Help Center ...\n\n" +
                        "                  🔸1- Questions About Cryptocurrencies\n" +
                        "                  🔸2- Blockchain Related Questions\n" +
                        "                     Choose : ");
                String istenilenSoru = scanner.nextLine();
                if (istenilenSoru.equals("1")) {
                    System.out.println(helpCenter.getQuestions1());
                    System.out.print("                     Choose : ");
                    String istenilenKriptoSoru = scanner.nextLine();
                    if (istenilenKriptoSoru.equals("1.1"))
                        System.out.println(helpCenter.getCryptocurrency());

                    else if (istenilenKriptoSoru.equals("1.2"))
                        System.out.println(helpCenter.getToken());

                    else if (istenilenKriptoSoru.equals("1.3"))
                        System.out.println(helpCenter.getBtc());

                    else if (istenilenKriptoSoru.equals("1.4"))
                        System.out.println(helpCenter.getMiner());

                    else if (istenilenKriptoSoru.equals("1.5"))
                        System.out.println(helpCenter.getBtcminer());

                    else if (istenilenKriptoSoru.equals("1.6"))
                        System.out.println(helpCenter.getFiat_money());

                    else
                        System.out.println("                     Enter Valid Question Number...");


                }
                else if (istenilenSoru.equals("2")) {

                    System.out.println(helpCenter.getQuestions2());
                    System.out.print("                     Choose : ");
                    String istenilenZincirSoru = scanner.nextLine();
                    if (istenilenZincirSoru.equals("2.1"))
                        System.out.println(helpCenter.getBlockchain());

                    else if (istenilenZincirSoru.equals("2.2"))
                        System.out.println(helpCenter.getHardfork());

                    else if (istenilenZincirSoru.equals("2.3"))
                        System.out.println(helpCenter.getHashing());

                    else if (istenilenZincirSoru.equals("2.4"))
                        System.out.println(helpCenter.getDefi());

                    else if (istenilenZincirSoru.equals("2.5"))
                        System.out.println(helpCenter.getPool());

                    else if (istenilenZincirSoru.equals("2.6"))
                        System.out.println(helpCenter.getContract());

                    else
                        System.out.println("                     Enter Valid Question Number...");


                }
            }
            else if (istenilenIslem.equals("8"))
                System.out.println("                  🔸https://www.icrypex.com/en/trading");

            else if (istenilenIslem.equals("G")) {

                System.out.print("\n\n\n                  🔸Enter Your Username : ");
                String alinanKullaniciIsmi = scanner.nextLine();

                System.out.print("\n                  🔸Enter your User Email : ");
                String alinanKullaniciMail = scanner.nextLine();

                System.out.print("\n                  🔸Enter Your User Password : ");
                String alinanKullanicParola = scanner.nextLine();

                if (alinanKullaniciIsmi.equals("dev.ferhatt") && alinanKullanicParola.equals("123456seven") && alinanKullaniciMail.equals("1@gmail.com")) {
                    System.out.println("\n                  🔸Entering the System...");
                }

                else if (alinanKullaniciIsmi.equals("dev.kaan") && alinanKullanicParola.equals("123456yedi") && alinanKullaniciMail.equals("2@gmail.com")) {
                    System.out.println("\n                  🔸Entering the System...");
                }

                else if (alinanKullaniciIsmi.equals(olusanKullaniciAdi) && alinanKullanicParola.equals(olusanKullanciParola) && alinanKullaniciMail.equals(olusanKullaniciMail)) {
                    System.out.println("\n                  🔸Entering the System...");
                }

                else{
                    System.out.println("\n                  🚫 Invalid User Information 🚫");
                    break;
                }



                operations operations = new operations();
                System.out.println(operations.getOperations());
                System.out.print("\n                    Choose : ");
                String istenilenKullaniciIslem = scanner.nextLine();






                if (istenilenKullaniciIslem.equals("Balance Inquiry")) {
                    System.out.println(registerUserFerhat.getKullaniciBakiye());
                    break;
                }

                else if (istenilenKullaniciIslem.equals("Deposit a Balance")){
                    System.out.print("\n                  🔸Enter Quantity : ");
                    double yatirilanMiktar = scanner.nextDouble();
                    registerUserFerhat.setKullaniciBakiye(yatirilanMiktar + registerUserFerhat.getKullaniciBakiye());
                    System.out.println("\n                  🔸Renewed Balance : " + registerUserFerhat.getKullaniciBakiye());
                    break;

                }

                else if (istenilenKullaniciIslem.equals("Balance Withdrawal")){
                    System.out.print("\n                  🔸Renewed Balance : ");
                    double cekilenMiktar = scanner.nextDouble();
                    registerUserFerhat.setKullaniciBakiye(cekilenMiktar - registerUserFerhat.getKullaniciBakiye());
                    System.out.println("\n                  🔸Renewed Balance : " + registerUserFerhat.getKullaniciBakiye());
                    break;
                }

                else if (istenilenKullaniciIslem.equals("BTC Buy - Sell")){
                    System.out.print("\n                  🔸1.1 - BTC Buy\n" +
                            "                  🔸1.2 - BTC Sell\n" +
                            "                    Choose : ");
                    String istenilenBtcIslem = scanner.nextLine();
                    if (istenilenBtcIslem.equals("1.1")){
                        System.out.println("\n                  🔸Balance in Your Account : " + registerUserFerhat.getKullaniciBakiye());
                        System.out.print("\n                  🔸Enter Amount to Convert to BTC : ");
                        double btcCevrilenBakiye = scanner.nextDouble();
                        double process1 = btcCevrilenBakiye/19598.43;
                        System.out.println("\n\n\n\n                  🔸" + btcCevrilenBakiye + " BTC Bought by Quantity : " + process1 );
                        double process2 = btcCevrilenBakiye - registerUserFerhat.getKullaniciBakiye();
                        System.out.println("                  🔸Amount Remaining in Your Account : " + process2);
                        double process3 =  process1 + registerUserFerhat.getKullaniciBtc();
                        System.out.println("                  🔸Total BTC in Your Account : " + process3);
                    }

                    else if (istenilenBtcIslem.equals("1.2")){
                        System.out.println("\n                  🔸BTC in Your Account : " + registerUserFerhat.getKullaniciBtc());
                        System.out.print("\n                  🔸Enter the Amount of BTC to Convert to Dollars : ");
                        double dolaraCevirilenBTC = scanner.nextDouble();
                        double process1 =  dolaraCevirilenBTC*19598.43;
                        System.out.println("\n\n\n\n                  🔸" + dolaraCevirilenBTC + " Dollars Converted by Amount : " + process1 );
                        double process2 = dolaraCevirilenBTC - registerUserFerhat.getKullaniciBtc();
                        System.out.println("                  🔸Amount of BTC Remaining in Your Account : " + process2);
                        double process3 =  process1 + registerUserFerhat.getKullaniciBakiye();
                        System.out.println("                  🔸Total Dollars in Your Account : " + process3);
                    }

                    else {
                        System.out.println("\n                  🚫 Invalid User Information 🚫\n" +
                                "                     Please Pay Attention to Caps Lock and Try Again...\n\n\n");

                    }

                    break;
                }

                else if (istenilenKullaniciIslem.equals("Ethereum Buy - Sell")){
                    System.out.println("\n\n\n                  🔸VERY SOON :) ");
                }
                else{
                    System.out.println("\n                  🚫 Invalid User Information 🚫\n" +
                            "                     Please Pay Attention to Caps Lock and Try Again...\n\n\n");
                }


            }


            else if (istenilenIslem.equals("U")) {

                System.out.print("\n\n\n                  🔸Enter your age :  : ");
                olusanKullaniciYas = scanner.nextInt();

                if (olusanKullaniciYas >= 18) {

                } else if (olusanKullaniciYas < 18) {
                    System.out.println("\n                  🔸This Site is Used for Ages 18 and Over.");
                    break;
                } else {
                    System.out.println("\n                  🔸Enter your age as a whole number...");
                }
                scanner.nextLine();

                System.out.print("                  🔸Create Your Username : ");
                olusanKullaniciAdi = scanner.nextLine();

                System.out.print("                  🔸Create Account Mail :  : ");
                olusanKullaniciMail = scanner.nextLine();


                System.out.print("                  🔸Create Your User Password : ");
                olusanKullanciParola = scanner.nextLine();
                System.out.println("\n\n\n                  🔸New User Membership Has Been Performed ✅ \n" +
                        "                    Press Enter to Login From Homepage...");
                scanner.nextLine();

            }
            else {
                System.out.println("\n\n                  🔸You Have Not Entered a Valid Transaction !");
            }
        }

    }
}