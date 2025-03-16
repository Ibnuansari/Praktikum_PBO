package Main;

import java.util.ArrayList;
import java.util.Scanner;

public class SistemPelaporan {
    private ArrayList<LaporanKecelakaan> daftarLaporan;
    private Scanner scanner;

    public SistemPelaporan() {
        daftarLaporan = new ArrayList<>();
        scanner = new Scanner(System.in);
    }

    public void tambahLaporan() {
        System.out.print("Masukkan Tanggal: ");
        String tanggal = scanner.nextLine();
        System.out.print("Masukkan Lokasi: ");
        String lokasi = scanner.nextLine();
        System.out.print("Masukkan Jenis Kecelakaan: ");
        String jenis = scanner.nextLine();
        System.out.print("Masukkan Jumlah Korban: ");
        int korban = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Masukkan Keterangan: ");
        String keterangan = scanner.nextLine();

        LaporanKecelakaan laporan = new LaporanKecelakaan(tanggal, lokasi, jenis, korban, keterangan);
        daftarLaporan.add(laporan);
        System.out.println("Laporan berhasil ditambahkan dengan ID: " + laporan.getIdLaporan());
    }

    public void tampilkanLaporan() {
        if (daftarLaporan.isEmpty()) {
            System.out.println("Belum ada laporan.");
        } else {
            System.out.println("\nDaftar Laporan:");
            for (LaporanKecelakaan laporan : daftarLaporan) {
                laporan.tampilkanLaporan();
            }
        }
    }

    public void perbaruiLaporan() {
        System.out.print("Masukkan ID Laporan yang ingin diperbarui: ");
        String id = scanner.nextLine();
        for (LaporanKecelakaan laporan : daftarLaporan) {
            if (laporan.getIdLaporan().equals(id)) {
                System.out.print("Masukkan Tanggal baru: ");
                laporan.setTanggal(scanner.nextLine());
                System.out.print("Masukkan Lokasi baru: ");
                laporan.setLokasi(scanner.nextLine());
                System.out.print("Masukkan Jenis Kecelakaan baru: ");
                laporan.setJenisKecelakaan(scanner.nextLine());
                System.out.print("Masukkan Jumlah Korban baru: ");
                laporan.setJumlahKorban(scanner.nextInt());
                scanner.nextLine();
                System.out.print("Masukkan Keterangan baru: ");
                laporan.setKeterangan(scanner.nextLine());
                System.out.println("Laporan berhasil diperbarui.");
                return;
            }
        }
        System.out.println("Laporan tidak ditemukan.");
    }

    public void hapusLaporan() {
        System.out.print("Masukkan ID Laporan yang ingin dihapus: ");
        String id = scanner.nextLine();
        for (int i = 0; i < daftarLaporan.size(); i++) {
            if (daftarLaporan.get(i).getIdLaporan().equals(id)) {
                daftarLaporan.remove(i);
                System.out.println("Laporan berhasil dihapus.");
                return;
            }
        }
        System.out.println("Laporan tidak ditemukan.");
    }
}
