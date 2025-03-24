package com.laporan.kecelakaan;

public class Kecelakaan {
    private String idLaporan;
    private String jenisKecelakaan;
    private String tingkatKeparahan;
    private Pelapor pelapor;
    private Lokasi lokasi;

    public Kecelakaan(String idLaporan, String jenisKecelakaan, String tingkatKeparahan, Pelapor pelapor, Lokasi lokasi) {
        this.idLaporan = idLaporan;
        this.jenisKecelakaan = jenisKecelakaan;
        this.tingkatKeparahan = tingkatKeparahan;
        this.pelapor = pelapor;
        this.lokasi = lokasi;
    }

    public String getIdLaporan() {
        return idLaporan;
    }

    public String getJenisKecelakaan() {
        return jenisKecelakaan;
    }

    public void setJenisKecelakaan(String jenisKecelakaan) {
        this.jenisKecelakaan = jenisKecelakaan;
    }

    public String getTingkatKeparahan() {
        return tingkatKeparahan;
    }

    public void setTingkatKeparahan(String tingkatKeparahan) {
        this.tingkatKeparahan = tingkatKeparahan;
    }

    public void tampilkanLaporan() {
        System.out.println("ID Laporan: " + idLaporan);
        System.out.println("Jenis Kecelakaan: " + jenisKecelakaan);
        System.out.println("Tingkat Keparahan: " + tingkatKeparahan);
        System.out.println("Pelapor: " + pelapor.getNama() + " (" + pelapor.getNoTelp() + ")");
        System.out.println("Lokasi: " + lokasi.getAlamat());
        System.out.println("----------------------------------");
    }
}
