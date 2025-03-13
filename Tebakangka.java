package week3;
import java.util.Scanner;
import java.util.Random;

class TebakAngka {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Random rand = new Random();
        
        int angka = rand.nextInt(15) + 1; // Angka acak 1-100
        int tebakan;
        
        System.out.println("===================");
        System.out.println("    TEBAK ANGKA   ");
        System.out.println("===================");
        System.out.println("Saya telah memilih angka antara 1-15.");
        System.out.println("Coba tebak!");

        do {
            System.out.print("Masukkan angka: ");
            tebakan = s.nextInt();

            if (tebakan > angka) {
                System.out.println("Terlalu besar! Coba lagi.");
            } else if (tebakan < angka) {
                System.out.println("Terlalu kecil! Coba lagi.");
            } else {
                System.out.println("Selamat! Tebakan kamu benar.");
            }
        } while (tebakan != angka);

        s.close();
    }
}
