package model;

import java.util.List;
import java.util.ArrayList;

public class Kecelakaan implements TindakanDarurat {
    private String idLaporan;
    private String jenisKecelakaan;
    private Pelapor pelapor;
    private Lokasi lokasi;
    private List<Kendaraan> kendaraan;
    private List<Korban> korban;

    public Kecelakaan(String idLaporan, String jenisKecelakaan, Pelapor pelapor, Lokasi lokasi) {
        this.idLaporan = idLaporan;
        this.jenisKecelakaan = jenisKecelakaan;
        this.pelapor = pelapor;
        this.lokasi = lokasi;
        this.kendaraan = new ArrayList<>();
        this.korban = new ArrayList<>();
    }

    public void tambahKorban(Korban korban) {
        this.korban.add(korban);
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        this.kendaraan.add(kendaraan);
    }

    public String getIdLaporan() {
        return idLaporan;
    }

    public void setIdLaporan(String idLaporan) {
        this.idLaporan = idLaporan;
    }

    public String getJenisKecelakaan() {
        return jenisKecelakaan;
    }

    public void setJenisKecelakaan(String jenisKecelakaan) {
        this.jenisKecelakaan = jenisKecelakaan;
    }

    public void tampilkanLaporan() {
        System.out.println("ID Laporan: " + idLaporan);
        System.out.println("Jenis Kecelakaan: " + jenisKecelakaan);
        System.out.println("Jumlah Korban: " + korban.size());
        pelapor.tampilkanInfoPelapor();
        lokasi.tampilkanInfoLokasi();

        System.out.println("Informasi Kendaraan:");
        for (Kendaraan k : kendaraan) {
            k.tampilkanInfoKendaraan();
        }

        System.out.println("Informasi Korban:");
        for (Korban k : korban) {
            k.tampilkanInfoKorban();
        }
    }

    @Override
    public void hubungiAmbulans() {
        System.out.println("Ambulans segera dihubungi ke lokasi: " + lokasi.getAlamat());
    }

    @Override
    public void hubungiPolisi() {
        System.out.println("Polisi segera dihubungi ke lokasi: " + lokasi.getAlamat());
    }
}
