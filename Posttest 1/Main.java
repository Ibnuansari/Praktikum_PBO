import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static ArrayList<Kecelakaan> laporanList = new ArrayList<>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n=== Sistem Pelaporan Kecelakaan ===");
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
        }
    }

    private static void tambahLaporan() {
        System.out.print("Masukkan ID Laporan: ");
        String id = scanner.nextLine();
        System.out.print("Masukkan Jenis Kecelakaan: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan Tingkat Keparahan: ");
        String tingkat = scanner.nextLine();
        System.out.print("Masukkan Nama Pelapor: ");
        String namaPelapor = scanner.nextLine();
        System.out.print("Masukkan Nomor Telepon Pelapor: ");
        String noTelp = scanner.nextLine();
        System.out.print("Masukkan Alamat Lokasi: ");
        String alamat = scanner.nextLine();

        Pelapor pelapor = new Pelapor(namaPelapor, noTelp);
        Lokasi lokasi = new Lokasi(alamat);
        Kecelakaan kecelakaan = new Kecelakaan(id, jenis, tingkat, pelapor, lokasi);

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
                System.out.print("Masukkan Tingkat Keparahan Baru: ");
                laporan.setTingkatKeparahan(scanner.nextLine());
                System.out.println("Laporan berhasil diperbarui!");
                return;
            }
        }
        System.out.println("Laporan tidak ditemukan.");
    }

    private static void hapusLaporan() {
        System.out.print("Masukkan ID Laporan yang akan dihapus: ");
        String id = scanner.nextLine();
        for (Kecelakaan laporan : laporanList) {
            if (laporan.getIdLaporan().equals(id)) {
                laporanList.remove(laporan);
                System.out.println("Laporan berhasil dihapus!");
                return;
            }
        }
        System.out.println("Laporan tidak ditemukan.");
    }
}
