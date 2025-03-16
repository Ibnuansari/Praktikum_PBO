package Main;

public class LaporanKecelakaan {
    private static int idCounter = 1; 
    private String idLaporan;
    private String tanggal;
    private String lokasi;
    private String jenisKecelakaan;
    private int jumlahKorban;
    private String keterangan;

    public LaporanKecelakaan(String tanggal, String lokasi, String jenisKecelakaan, int jumlahKorban, String keterangan) {
        this.idLaporan = "lap-" + idCounter++; 
        this.tanggal = tanggal;
        this.lokasi = lokasi;
        this.jenisKecelakaan = jenisKecelakaan;
        this.jumlahKorban = jumlahKorban;
        this.keterangan = keterangan;
    }

    public String getIdLaporan() { return idLaporan; }
    public void setTanggal(String tanggal) { this.tanggal = tanggal; }
    public void setLokasi(String lokasi) { this.lokasi = lokasi; }
    public void setJenisKecelakaan(String jenisKecelakaan) { this.jenisKecelakaan = jenisKecelakaan; }
    public void setJumlahKorban(int jumlahKorban) { this.jumlahKorban = jumlahKorban; }
    public void setKeterangan(String keterangan) { this.keterangan = keterangan; }

    public void tampilkanLaporan() {
        System.out.println("ID Laporan      : " + idLaporan);
        System.out.println("Tanggal         : " + tanggal);
        System.out.println("Lokasi          : " + lokasi);
        System.out.println("Jenis Kecelakaan: " + jenisKecelakaan);
        System.out.println("Jumlah Korban   : " + jumlahKorban);
        System.out.println("Keterangan      : " + keterangan);
        System.out.println("-----------------------------");
    }
}
