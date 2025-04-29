package model;

public class Korban extends Pelapor {
    private String jenisKelamin;
    private String kondisi;

    public Korban(String nama, String nomorTelepon, String jenisKelamin, String kondisi) {
        super(nama, nomorTelepon);
        this.jenisKelamin = jenisKelamin;
        this.kondisi = kondisi;
    }

    @Override
    public void tampilkanInfoPelapor() {
        System.out.println("Korban         : " + getNama());
        System.out.println("Nomor Telepon  : " + getNomorTelepon());
    }

    @Override
    public void identifikasiPelapor() {
        System.out.println("Pelapor diidentifikasi sebagai korban dengan kondisi " + kondisi);
    }

    public void tampilkanInfoKorban() {
        tampilkanInfoPelapor();
        System.out.println("Jenis Kelamin   : " + jenisKelamin);
        System.out.println("Kondisi         : " + kondisi);
    }
}
