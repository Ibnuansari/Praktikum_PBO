package main;

import model.*;
import java.util.*;

public class Main {
    private static final Scanner scanner = new Scanner(System.in); 
    private static List<Kecelakaan> laporanList = new ArrayList<>();

    public static void main(String[] args) {
        while (true) {
            System.out.print("\033[H\033[2J");  
            System.out.flush();
            
            System.out.println("\n=== Sistem Pelaporan Kecelakaan Lalu Lintas ===");
            System.out.println("1. Tambah Laporan");
            System.out.println("2. Tampilkan Semua Laporan");
            System.out.println("3. Perbarui Laporan");
            System.out.println("4. Hapus Laporan");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu: ");
            int pilihan = scanner.nextInt();
            scanner.nextLine();  

            switch (pilihan) {
                case 1:
                    tambahLaporan();
                    break;
                case 2:
                    tampilkanLaporan();
                    break;
                case 3:
                    perbaruiLaporan();
                    break;
                case 4:
                    hapusLaporan();
                    break;
                case 5:
                    System.out.println("Program selesai.");
                    System.exit(0);
                default:
                    System.out.println("Pilihan tidak valid. Coba lagi.");
            }

            System.out.println("\nTekan Enter untuk melanjutkan...");
            scanner.nextLine();  
        }
    }

    private static void tambahLaporan() {
        System.out.print("Masukkan ID Laporan: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Jenis Kecelakaan: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan Nama Pelapor: ");
        String namaPelapor = scanner.nextLine();
        System.out.print("Masukkan Nomor Telepon Pelapor: ");
        String noTelp = scanner.nextLine();
        Pelapor pelapor = new Pelapor(namaPelapor, noTelp) {
            @Override
            public void identifikasiPelapor() {
                System.out.println("Pelapor diidentifikasi sebagai saksi kejadian");
            }
        };
        System.out.print("Masukkan Alamat Lokasi: ");
        String alamat = scanner.nextLine();
        Lokasi lokasi = new Lokasi(alamat);

        Kecelakaan kecelakaan = new Kecelakaan(id, jenis, pelapor, lokasi);

        System.out.print("Masukkan jumlah kendaraan terlibat: ");
        int jumlahKendaraan = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < jumlahKendaraan; i++) {
            System.out.print("Masukkan Jenis Kendaraan: ");
            String jenisKendaraan = scanner.nextLine();
            System.out.print("Masukkan Merk Kendaraan: ");
            String merk = scanner.nextLine();
            kecelakaan.tambahKendaraan(new Kendaraan(jenisKendaraan, merk));
        }

        System.out.print("Masukkan jumlah korban: ");
        int jumlahKorban = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < jumlahKorban; i++) {
            System.out.print("Masukkan Nama Korban: ");
            String namaKorban = scanner.nextLine();
            System.out.print("Masukkan Jenis Kelamin Korban: ");
            String jenisKelamin = scanner.nextLine();
            System.out.print("Masukkan Kondisi Korban: ");
            String kondisi = scanner.nextLine();
            kecelakaan.tambahKorban(new Korban(namaKorban, "-", jenisKelamin, kondisi));
        }

        laporanList.add(kecelakaan);
        System.out.println("Laporan berhasil ditambahkan!");
    }

    private static void tampilkanLaporan() {
        if (laporanList.isEmpty()) {
            System.out.println("Belum ada laporan.");
        } else {
            for (Kecelakaan laporan : laporanList) {
                laporan.tampilkanLaporan();
            }
        }
    }

    private static void perbaruiLaporan() {
        System.out.print("Masukkan ID Laporan yang akan diperbarui: ");
        String id = scanner.nextLine();
        for (Kecelakaan laporan : laporanList) {
            if (laporan.getIdLaporan().equals(id)) {
                System.out.print("Masukkan Jenis Kecelakaan Baru: ");
                laporan.setJenisKecelakaan(scanner.nextLine());
                System.out.println("Laporan berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Laporan tidak ditemukan.");
    }

    private static void hapusLaporan() {
        System.out.print("Masukkan ID Laporan yang akan dihapus: ");
        String id = scanner.nextLine();
        laporanList.removeIf(laporan -> laporan.getIdLaporan().equals(id));
        System.out.println("Laporan berhasil dihapus!");
    }
}