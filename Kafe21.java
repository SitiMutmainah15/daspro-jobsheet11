import java.util.Scanner;

public class Kafe21 {
    public static void main(String[] args) {
        Menu("Andi", true, "DISKON30");
    }

    public static void Menu(String namaPelanggan, boolean isMember, String kodePromo) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Selamat datang, " + namaPelanggan + "!");

        if (isMember) {
            System.out.println("Anda adalah member, dapatkan diskon 10% untuk setiap pembelian!");
        }

        System.out.println("==== MENU RESTO KAFE ====");
        System.out.println("1. Kopi Hitam - Rp 15,000");
        System.out.println("2. Cappucino - Rp 20,000");
        System.out.println("3. Latte - Rp 22,000");
        System.out.println("4. Teh Tarik - Rp 12,000");
        System.out.println("5. Roti Bakar - Rp 10,000");
        System.out.println("6. Mie Goreng - Rp 18,000");
        System.out.println("==========================");

        int totalHarga = 0;

        while (true) {
            System.out.println("Masukkan nomor menu (1-6) ketik 0 untuk selesai: ");
            int pilihanMenu = sc.nextInt();

            if (pilihanMenu == 0) break;

            System.out.println("Masukkan jumlah item: ");
            int banyakItem = sc.nextInt();

            totalHarga += hitungTotalHarga(pilihanMenu, banyakItem);
        }

        totalHarga = applyKodePromo(totalHarga, kodePromo);
        System.out.println("Total keseluruhan pesanan Anda: Rp" + totalHarga);
    }

    public static int hitungTotalHarga(int pilihanMenu, int banyakItem) {
        int[] hargaItems = {15000, 20000, 22000, 12000, 10000, 18000};
        return hargaItems[pilihanMenu - 1] * banyakItem;
    }

    public static int applyKodePromo(int totalHarga, String kodePromo) {
        if (kodePromo.equals("DISKON50")) {
            System.out.println("Kode promo valid: Diskon 50% diterapkan!");
            return totalHarga / 2;
        } else if (kodePromo.equals("DISKON30")) {
            System.out.println("Kode promo valid: Diskon 30% diterapkan!");
            return (int) (totalHarga * 0.7);
        } else {
            System.out.println("Kode promo invalid: Tidak ada diskon.");
        }
        return totalHarga;
    }
}
