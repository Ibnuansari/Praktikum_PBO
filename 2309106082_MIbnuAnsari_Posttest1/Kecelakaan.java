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

    public void setJenisKecelakaan(String jenisKecelakaan) {
        this.jenisKecelakaan = jenisKecelakaan;
    }

    public void setTingkatKeparahan(String tingkatKeparahan) {
        this.tingkatKeparahan = tingkatKeparahan;
    }

    public void setPelapor(Pelapor pelapor) {
        this.pelapor = pelapor;
    }

    public void setLokasi(Lokasi lokasi) {
        this.lokasi = lokasi;
    }

    public void tampilkanLaporan() {
        System.out.println("===== Laporan Kecelakaan =====");
        System.out.println("ID Laporan     : " + idLaporan);
        System.out.println("Jenis          : " + jenisKecelakaan);
        System.out.println("Tingkat        : " + tingkatKeparahan);
        pelapor.tampilkanInfoPelapor();
        lokasi.tampilkanInfoLokasi();
        System.out.println("==============================");
    }
}
