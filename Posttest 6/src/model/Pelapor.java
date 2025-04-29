package model;

public abstract class Pelapor {
    private String nama;
    private String nomorTelepon;

    public Pelapor(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public String getNama() {
        return nama;
    }

    public String getNomorTelepon() {
        return nomorTelepon;
    }

    public abstract void identifikasiPelapor();

    public void tampilkanInfoPelapor() {
        System.out.println("Pelapor        : " + nama);
        System.out.println("Nomor Telepon  : " + nomorTelepon);
    }
}
