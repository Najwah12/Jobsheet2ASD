public class MataKuliah15 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    public MataKuliah15() {
        this.kodeMK = "MK001";
        this.nama = "Pemrograman Dasar";
        this.sks = 3;
        this.jumlahJam = 2;
    }

    public MataKuliah15(String kodeMK, String nama, int sks, int jumlahJam) {
        this.kodeMK = kodeMK;
        this.nama = nama;
        this.sks = sks;
        this.jumlahJam = jumlahJam;
    }

    public void tampilInformasi() {
        System.out.println("Kode MK: " + kodeMK);
        System.out.println("Nama: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
    }

    public void ubahSKS(int sksBaru) {
        this.sks = sksBaru;
        System.out.println("SKS telah diubah menjadi: " + sks);
    }

    public void tambahJam(int jam) {
        this.jumlahJam += jam;
        System.out.println("Jumlah jam telah ditambahkan. Jumlah jam sekarang: " + jumlahJam);
    }

    public void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            this.jumlahJam -= jam;
            System.out.println("Jumlah jam telah dikurangi. Jumlah jam sekarang: " + jumlahJam);
        } else {
            System.out.println("Pengurangan tidak dapat dilakukan. Jumlah jam tidak mencukupi.");
        }
    }
}

