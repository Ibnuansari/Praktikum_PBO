public class Pelapor {
    private String nama;
    private String nomorTelepon;

    public Pelapor(String nama, String nomorTelepon) {
        this.nama = nama;
        this.nomorTelepon = nomorTelepon;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setNomorTelepon(String nomorTelepon) {
        this.nomorTelepon = nomorTelepon;
    }

    public void tampilkanInfoPelapor() {
        System.out.println("Pelapor        : " + nama);
        System.out.println("Nomor Telepon  : " + nomorTelepon);
    }
}
