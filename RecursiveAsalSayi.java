import java.util.Scanner;

public class RecursiveAsalSayi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sayı Giriniz: ");
        int sayi = scanner.nextInt();

        if (asalSayiMi(sayi, sayi / 2)) {
            System.out.println(sayi + " sayısı ASALDIR!");
        } else {
            System.out.println(sayi + " sayısı ASAL değildir!");
        }
    }

    public static boolean asalSayiMi(int sayi, int bölen) {
        if (bölen == 1) {
            return true;
        } else {
            if (sayi % bölen == 0) {
                return false;
            } else {
                return asalSayiMi(sayi, bölen - 1);
            }
        }
    }
}