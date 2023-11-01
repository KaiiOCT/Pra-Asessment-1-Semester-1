import java.util.Scanner;

public class PA02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int angka1 = input.nextInt();
        int angka2 = input.nextInt();
        int hasil = (angka1 + angka2);

        int digit1 = (hasil / 100 % 10);
        int digit2 = (hasil / 10 % 10);
        int digit3 = (hasil % 10);
        
        String convertDigit1 = convert(digit1);
        String convertDigit2 = convert(digit2);
        String convertDigit3 = convert(digit3);

        System.out.printf("%s ratus %s puluh %s",convertDigit1, convertDigit2, convertDigit3);
    }
    private static String convert(int masukan){
        switch (masukan) {
            case 2:
                return "dua";
            case 3:
                return "tiga";
            case 4:
                return "empat";
            case 5:
                return "lima";               
            case 6:
                return "enam";
            case 7:
                return "tujuh";
            case 8:
                return "delapan";
            case 9:
                return "sembilan";
        }
        return null;
    }
    // public static String penjumlahan (int harga1, int harga2){
    //     int hasil = (harga1 + harga2);
    //     int hasil1 = (hasil / 100 % 10);
    //     int hasil2 = (hasil / 10 % 10);
    //     int hasil3 = (hasil / 1 % 10);

    //     String satuan =  "";
    //     String puluhan = "";
    //     String ratusan = "";
        
    //     switch (hasil1) {
    //         case 2:
    //             ratusan = "dua";
    //             break;
        
    //         case 3:
    //             ratusan = "tiga";
    //             break;

    //         case 4:
    //             ratusan = "empat";
    //             break;
        
    //         case 5:
    //             ratusan = "lima";
    //             break;

    //         case 6:
    //             ratusan = "enam";
    //             break;
        
    //         case 7:
    //             ratusan = "tujuh";
    //             break;
                
    //         case 8:
    //             ratusan = "delapan";
    //             break;
        
    //         case 9:
    //             ratusan = "sembilan";
    //             break;
    //         }       

    //     switch (hasil2) {
    //         case 2:
    //             puluhan = "dua";
    //             break;
        
    //         case 3:
    //             puluhan = "tiga";
    //             break;

    //         case 4:
    //             puluhan = "empat";
    //             break;
        
    //         case 5:
    //             puluhan = "lima";
    //             break;

    //         case 6:
    //             puluhan = "enam";
    //             break;
        
    //         case 7:
    //             puluhan = "tujuh";
    //             break;

    //         case 8:
    //             puluhan = "delapan";
    //             break;
        
    //         case 9:
    //             puluhan = "sembilan";
    //             break;
    //         }

    //     switch (hasil3) {
    //         case 2:
    //             satuan = "dua";
    //             break;
        
    //         case 3:
    //             satuan = "tiga";
    //             break;

    //         case 4:
    //             satuan = "empat";
    //             break;
        
    //         case 5:
    //             satuan = "lima";
    //             break;

    //         case 6:
    //             satuan = "enam";
    //             break;
        
    //         case 7:
    //             satuan = "tujuh";
    //             break;

    //         case 8:
    //             satuan = "delapan";
    //             break;
        
    //         case 9:
    //             satuan = "sembilan";
    //             break;        
            
    //     }
    //     return ratusan + " ratus " + puluhan + " puluh " + satuan;
    // }
}
