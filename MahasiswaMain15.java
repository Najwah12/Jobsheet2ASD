public class MahasiswaMain15 {
    public static void main(String[] args) {
       
        Mahasiswa15 mhs1 = new Mahasiswa15();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas ("SI 2K");
        mhs1.updateIpk (3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa15 mhs2 = new Mahasiswa15("Annisa Nabila", "2141720160", "TI 2L",3.25);
        mhs2.updateIpk(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa15 mhsNajwah = new Mahasiswa15("Najwah Syihab", "244107060068","SIB 1C",3.66);
        mhsNajwah.tampilkanInformasi();

    }
}

