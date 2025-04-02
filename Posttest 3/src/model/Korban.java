package model;

public class Korban extends Pelapor {
    private String jenisKelamin;
    private String kondisi;

    public Korban(String nama, String nomorTelepon, String jenisKelamin, String kondisi) {
        super(nama, nomorTelepon);
        this.jenisKelamin = jenisKelamin;
        this.kondisi = kondisi;
    }

    public void tampilkanInfoKorban() {
        super.tampilkanInfoPelapor();
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Kondisi         : " + kondisi);
    }
}
