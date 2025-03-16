package Main;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        SistemPelaporan sistem = new SistemPelaporan();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("\n=== Sistem Pelaporan Kecelakaan ===");
            System.out.println("1. Tambah Laporan");
            System.out.println("2. Tampilkan Semua Laporan");
            System.out.println("3. Perbarui Laporan");
            System.out.println("4. Hapus Laporan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();

            switch (pilihan) {
                case 1:
                    sistem.tambahLaporan();
                    break;
                case 2:
                    sistem.tampilkanLaporan();
                    break;
                case 3:
                    sistem.perbaruiLaporan();
                    break;
                case 4:
                    sistem.hapusLaporan();
                    break;
                case 5:
                    System.out.println("Terima kasih telah menggunakan sistem ini.");
                    break;
                default:
                    System.out.println("Pilihan tidak valid, silakan coba lagi.");
            }
        } while (pilihan != 5);

        scanner.close();
    }
}