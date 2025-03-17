public class Lokasi {
    private String alamat;

    public Lokasi(String alamat) {
        this.alamat = alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public void setKoordinat(String koordinat) {
    }

    public void tampilkanInfoLokasi() {
        System.out.println("Lokasi         : " + alamat);
    }
}
