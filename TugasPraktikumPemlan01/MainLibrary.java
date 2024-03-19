package TugasPraktikumPemlan01;

import java.util.*;

public class MainLibrary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean keluar = false;
        Library perpustakaan = new Library(); 

        do {
            System.out.println("_____________________[Perpustakaan WoW]_____________________");
            System.out.print("Selamat datang di Perpustakaan WoW ^_^\n"
                    + "Berikut menu daftar kategori buku yang tersedia :\n"
                    + "1.Teknologi\n2.Filsafat\n3.Sejarah\n4.Agama\n5.Psikologi\n6.Politik\n7.Fiksi\n8.Tampilkan semua buku\n"
                    + "Silakan masukkan nomor yang sesuai dengan kategori yang Anda inginkan (0 untuk keluar) : ");
            int inputan = input.nextInt();

            if (inputan > 0 && inputan <= 7) {
                perpustakaan.getBuku(inputan);
            } else if (inputan == 0) {
                keluar = true;
            } else if (inputan == 8) {
                perpustakaan.tampilkanSemua();
            } else {
                System.out.println("Input tidak valid");
            }

            if (inputan != 0) {
                System.out.println("\nApakah Anda ingin kembali ke menu?");
                String kembali = input.next();
                if (kembali.equalsIgnoreCase("y")) {
                    keluar = false;
                } else {
                    keluar = true;
                }
            }
        } while (!keluar);

        System.out.println("Terima kasih karena telah berkunjung di Perpustakaan WoW");

        input.close();
    }
}