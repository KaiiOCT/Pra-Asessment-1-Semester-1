import java.util.Scanner;

public class PA01 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int bilangan1 = input.nextInt();
        int bilangan2 = input.nextInt();
        int bilangan3 = input.nextInt();
        System.out.println(mneghitung(bilangan1));
        System.out.println(mneghitung(bilangan2));
        System.out.println(mneghitung(bilangan3));

    }
    public static String mneghitung (int bilangan) {
        int hasil1 = ((bilangan / 1000 + 5) % 10);
        int hasil2 = ((bilangan / 100 + 5) % 10);
        int hasil3 = ((bilangan / 10 + 5) % 10);
        int hasil4 = ((bilangan / 1 + 5) % 10);
        return hasil1 + "" + hasil4 + "" + hasil3 + "" + hasil2;
    }
}