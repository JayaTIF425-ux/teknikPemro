package week2.restoran;

public class Restaurant {
    private String[] nama_makanan;
    private double[] harga_makanan;
    private int[] stok;
    private static byte id = 0;

    public Restaurant() {
        nama_makanan = new String[10];
        harga_makanan = new double[10];
        stok = new int[10];
    }

    public void tambahMenuMakanan(String nama, double harga, int stok) {
        if (id < 10) {
            this.nama_makanan[id] = nama;
            this.harga_makanan[id] = harga;
            this.stok[id] = (stok < 0) ? 0 : stok; // Validasi stok tidak boleh negatif
            id++;
        }
    }

    // Fitur Pemesanan 
    public void pesanMenu(String nama, int jumlah) {
        for (int i = 0; i < id; i++) {
            if (nama_makanan[i].equalsIgnoreCase(nama)) {
                if (stok[i] >= jumlah) {
                    stok[i] -= jumlah; // Stok otomatis berkurang
                    System.out.println("Berhasil memesan " + jumlah + " " + nama);
                } else {
                    System.out.println("Gagal! Stok " + nama + " tidak mencukupi.");
                }
                return;
            }
        }
        System.out.println("Menu tidak ditemukan.");
    }

    public void tampilMenuMakanan() {
        for (int i = 0; i < id; i++) {
            if (!isOutOfStock(i)) {
                System.out.println(nama_makanan[i] + "[" + stok[i] + "]\tRp. " + harga_makanan[i]);
            }
        }
    }

    public boolean isOutOfStock(int id) {
        return stok[id] == 0;
    }
}
 