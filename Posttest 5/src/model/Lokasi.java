package model;

public final class Lokasi { 
    private String alamat;

    public Lokasi(String alamat) {
        this.alamat = alamat;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void tampilkanInfoLokasi() {
        System.out.println("Lokasi Kejadian: " + alamat);
    }
}