import java.text.Format;
import java.util.Scanner;

public class PA03 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String jenisKelamin = input.next();

        switch (jenisKelamin) {
            case "Pria":
                double beratBadanPria = input.nextDouble();
                double tinggiBadanPria = input.nextDouble();
                System.out.println(beratPria(beratBadanPria, tinggiBadanPria));
                break;
            
            case "Wanita":
                double beratBadanWanita = input.nextDouble();
                double tinggiBadanWanita = input.nextDouble();
                System.out.println(beratWanita(beratBadanWanita, tinggiBadanWanita));
                break;
        }
    }

    public static String beratPria (double beratBadan, double tinggiBadan) {
        double tinggiBadanMeter = (tinggiBadan / 100);
        double menghitung = (beratBadan / Math.pow(tinggiBadanMeter, 2));
        String kategori = "";

        if (menghitung < 20.50) {
            kategori = "Kurus";
        }
        else if (menghitung >= 20.50 && menghitung <= 26.99) {
            kategori = "Ideal";
        }
        else {
            kategori = "Gemuk";
        }

        System.out.printf("%.2f", menghitung);
        return ", " + kategori;
    }

    public static String beratWanita (double beratBadan, double tinggiBadan) {
        double tinggiBadanMeter = (tinggiBadan / 100);
        double menghitung = (beratBadan / Math.pow(tinggiBadanMeter, 2));
        String kategori = "";

        if (menghitung < 18.50) {
            kategori = "Kurus";
        }
        else if (menghitung >= 18.50 && menghitung <= 24.99) {
            kategori = "Ideal";
        }
        else {
            kategori = "Gemuk";
        }
        
        System.out.printf("%.2f", menghitung);
        return ", " + kategori;
    }
}
