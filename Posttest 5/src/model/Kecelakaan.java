package model;

import java.util.List;
import java.util.ArrayList;

public class Kecelakaan {
    private String idLaporan;
    private String jenisKecelakaan;
    private Pelapor pelapor;
    private Lokasi lokasi;
    private List<Kendaraan> kendaraan; 
    private List<Korban> korban; 
    
    public Kecelakaan(String idLaporan, String jenisKecelakaan, 
                        Pelapor pelapor, Lokasi lokasi, List<Kendaraan> kendaraan, List<Korban> korban) {
        this.idLaporan = idLaporan;
        this.jenisKecelakaan = jenisKecelakaan;
        this.pelapor = pelapor;
        this.lokasi = lokasi;
        this.kendaraan = kendaraan;
        this.korban = korban;
    }

    public Kecelakaan(String idLaporan, String jenisKecelakaan, 
                        Pelapor pelapor, Lokasi lokasi) {
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
    
    public void tambahKorban(List<Korban> daftarKorban) {
        this.korban.addAll(daftarKorban);
    }

    public void tambahKendaraan(Kendaraan kendaraan) {
        this.kendaraan.add(kendaraan);
    }
    
    public void tambahKendaraan(List<Kendaraan> daftarKendaraan) {
        this.kendaraan.addAll(daftarKendaraan);
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

    public Pelapor getPelapor() {
        return pelapor;
    }

    public void setPelapor(Pelapor pelapor) {
        this.pelapor = pelapor;
    }

    public Lokasi getLokasi() {
        return lokasi;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    public List<Kendaraan> getKendaraan() {
        return kendaraan;
    }

    public void setKendaraan(List<Kendaraan> kendaraan) {
        this.kendaraan = kendaraan;
    }

    public List<Korban> getKorban() {
        return korban;
    }

    public void setKorban(List<Korban> korban) {
        this.korban = korban;
    }

    public final void tampilkanLaporan() { 
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
}