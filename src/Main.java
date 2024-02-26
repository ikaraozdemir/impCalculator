import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);

    static void sum() {
        System.out.print("Kaç sayı gireceksiniz? ");
        int howMany = inp.nextInt();
        int sum = 0;
        for (int i = 1; i <= howMany; i++) {
            System.out.print(i + ". sayı: ");
            int number = inp.nextInt();
            sum += number;

        }
        System.out.println("Girdiğiniz sayıların toplamı: " + sum);
    }

    static void sub() {
        System.out.print("Kaç sayı gireceksiniz? ");
        int howMany = inp.nextInt();
        int sum = 0;
        for (int i = 1; i <= howMany; i++) {
            System.out.print(i + ". sayı: ");
            int number = inp.nextInt();
            if (i == 1) {
                sum = number;
                continue;
            }
            sum -= number;
        }
        System.out.println("Sonuç: " + sum);
    }

    static void multip() {
        System.out.print("Kaç sayı gireceksiniz? ");
        int howMany = inp.nextInt();
        int multip = 1;
        for (int i = 1; i <= howMany; i++) {
            System.out.print(i + ". sayı: ");
            int number = inp.nextInt();
            multip *= number;

        }
        System.out.println("Girdiğiniz sayıların çarpımı: " + multip);
    }

    static void div() {
        System.out.print("Bölünen sayıyı giriniz: ");
        int dividend = inp.nextInt();
        System.out.print("Bölen sayıyı giriniz: ");
        int divisor = inp.nextInt();
        if (divisor == 0) {
            System.out.println("Hata! İkinci sayıyı sıfırdan farklı bir sayı giriniz.");
        } else {
            double quotient =(dividend / divisor);
            System.out.print("Sonuç: " + (quotient));
        }
    }

    static void exp() {
        System.out.print("Sayıyı giriniz: ");
        int number = inp.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int pow = inp.nextInt();
        int result = 1;
        for (int i = 1; i <= pow; i++) {
            result *= number;
        }
        System.out.println("Sonuç: " + result);
    }

    static void fact(int a) {
        int result = 1;

        for (int i = 1; i <= a; i++) {
            result *= i;
        }
        System.out.println("Sonuç: " + result);
    }

    static void mod() {
        System.out.print("Sayıyı giriniz: ");
        int number = inp.nextInt();
        System.out.print("Mod değerini giriniz: ");
        int modValue = inp.nextInt();
        System.out.println("Sonuç: " + number % modValue);
    }

    static void rectangleCalc() {
        System.out.print("Kısa kenarı giriniz: ");
        int width = inp.nextInt();
        System.out.print("Uzun kenarı giriniz: ");
        int length = inp.nextInt();
        System.out.println("Alan: " + (width * length));
        System.out.println("Çevre: " + (2 * (width + length)));
    }

    public static void main(String[] args) {
        int selection;

        Scanner inp = new Scanner(System.in);
        System.out.println("1) Toplama\n" + "2) Çıkarma\n" + "3) Çarpma\n" + "4) Bölme\n"
                + "5) Kuvvet Alma\n" + "6) Faktoriyel Hesaplama\n"
                + "7) Mod Alma\n" + "8) Dikdörtgen Alan ve Çevresi Hesaplama\n");

        do {
            System.out.print("Lütfen bir işlem seçiniz: ");
            selection = inp.nextInt();
            switch (selection) {
                case 1:
                    sum();
                    break;
                case 2:
                    sub();
                    break;
                case 3:
                    multip();
                    break;
                case 4:
                    div();
                    break;
                case 5:
                    exp();
                    break;
                case 6:
                    System.out.print("Sayıyı giriniz :");
                    int a = inp.nextInt();
                    fact(a);
                    break;
                case 7:
                    mod();
                    break;
                case 8:
                    rectangleCalc();
                    break;
                case 0:
                    System.out.print("Çıkış yapılıyor...");
                    break;
                default:
                    System.out.println("Hatalı giriş yaptınız, lütfen tekrar deneyin.");
            }
        } while (selection != 0);
    }

}