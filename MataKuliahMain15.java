public class MataKuliahMain15 {
    public static void main(String[] args) {
        MataKuliah15 mk1 = new MataKuliah15();
        mk1.tampilInformasi();
        mk1.ubahSKS(4);
        mk1.tambahJam(1);
        mk1.kurangiJam(1);
        mk1.kurangiJam(3);

        System.out.println();

        MataKuliah15 mk2 = new MataKuliah15("MK002", "Basis Data", 3, 3);
        mk2.tampilInformasi();
        mk2.ubahSKS(5);
        mk2.tambahJam(2);
        mk2.kurangiJam(1);
        mk2.kurangiJam(5);
    }
}

