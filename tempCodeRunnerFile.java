public class Kafe21 {
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON50");
    } 
    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        System.out.println("Selamat datang, " + namaPelanggan + "!");
    
        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        if (kodePromo.equals("DISKON50")) {
            System.out.println("Anda mendapatkan diskon 50%.");
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Anda mendapatkan diskon 30%.");
        } else {
            System.out.println("Kode promo INVALID");
        }
        
        public static int hitungTotalHarga21(int pilihanmenu, int banyakItem) {
            int [] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};

            int hargaTotal = hargaItems[pilihanMenu - 1] * banyakItem;
        }


    System.out.println("==== MENU RESTO KAFE ====");
    System.out.println("1. Kopi Hitam - Rp 15,000");
    System.out.println("2. Cappucino - Rp 20,000");
    System.out.println("3. Latte - Rp 22,000");
    System.out.println("4. Teh Tarik - Rp 12,000");
    System.out.println("5. Roti Bakar - Rp 10,000");
    System.out.println("6. Mie Goreng - Rp 18,000");
    System.out.println("==========================");
    System.out.println("Silahkan pilih menu yang Anda inginkan.");

    System.out.println("\nMaasukkan noor menu yang ingin Anda pesan: ");
    int pilihanMenu = sc.nextInt();
    System.out.println("Masukkan jumlah item yang ingin dipesan: ");
    int banyakItem = sc.nextInt();

    int totalHarga = hitungTotalHarga21(pilihanMenu, banyakItem);

    System.out.println("Total harga untuk pesanan Anda: Rp" + totalHarga);
}
}