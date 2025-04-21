package model;

public class Kendaraan {
    private String jenis;
    private String merk;
    
    public Kendaraan(String jenis, String merk) {
        this.jenis = jenis;
        this.merk = merk;
    }

    public String getJenis() {
        return jenis;
    }

    public void setJenis(String jenis) {
        this.jenis = jenis;
    }

    public String getMerk() {
        return merk;
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public void tampilkanInfoKendaraan() {
        System.out.println("Jenis Kendaraan: " + jenis);
        System.out.println("Merk Kendaraan: " + merk);
    }
}