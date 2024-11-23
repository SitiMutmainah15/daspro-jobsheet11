public class PengunjungCafe21 {
    public static void main(String[] args) {
        tampilkanData("Ali", "Budi", "Citra", 1, 2, 3);
    }

    public static void tampilkanData(String... namaPengunjung, int... nomorMeja) { 
        for (String nama : namaPengunjung) {
            System.out.println("Nama Pengunjung: " + nama);
        }
        for (int meja : nomorMeja) {
            System.out.println("Nomor Meja: " + meja);
        }
    }
}
