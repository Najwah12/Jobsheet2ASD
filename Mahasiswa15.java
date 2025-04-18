public class Mahasiswa15 {
       
        String nama;
        String nim;
        String kelas;
        double ipk;

    public Mahasiswa15() {
        
    }
     
    public Mahasiswa15(String nama, String nim, String kelas, double ipk) {
        this.nama = nama;
        this.nim = nim;
        this.ipk =ipk;
        this.kelas = kelas;
    }
        void tampilkanInformasi() {
            System.out.println("Nama: " + nama);
            System.out.println("Nim: " + nim);
            System.out.println("Kelas:" + kelas);
            System.out.println("IPK: " + ipk);
        }

        void ubahKelas(String kelasBaru) {
            kelas = kelasBaru;
        }
    
        void updateIpk(double ipkBaru) {
            if (ipkBaru >= 0.0 && ipkBaru <= 4.0) {
                ipk = ipkBaru;
            } else {
                System.out.println("IPK tidak valid. Harus antara 0.0 dan 4.0");
            }   
        }
    public String nilaiKinerja() {
        if (ipk >= 3.5) {
            return "Kinerja sangat baik";
        } else if (ipk >= 3.0) {
            return "Kinerja baik";
        } else if (ipk >= 2.0) {
            return "Kinerja cukup";
        } else {
            return "Kinerja kurang";
        }
    }
}