/*









 */

import java.util.Scanner;

public class icrypexHomePage {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        System.out.print("\n\n\n\n\n\n\n                ▫️ 🌐ICRYPEX\n" +
                "                ▫️ To provide better service... / Daha iyi hizmet verebilmek için...\n" +
                "                ▫️ Select Display Language / Görüntüleme Dilini Seçin\n" +
                "                ▫️ EN or TR : ");

        String languagePreference = scanner.nextLine();

        if (languagePreference.equals("TR")) {
            icrypexTR.tr();
        }
        else if (languagePreference.equals("EN")){
          icrypexEN.eng();
        }
        else {
            System.out.println("\n                ▫️ Unsupported Language Preference / Desteklenmeyen Dil Tercihi 🚫");
        }
    }
}

