package week7.no2;

class Resto {
    private int chickenStock = 100;

    // SOLUSI: Menambahkan keyword 'synchronized' agar method ini bersifat atomic
    // Hanya satu kasir yang bisa masuk ke method ini dalam satu waktu.
    public synchronized void serveCustomer(String cashierName) {
        if (chickenStock > 0) {
            try { 
                // Simulasi proses tetap ada, namun sekarang aman karena thread lain harus mengantri
                Thread.sleep(10); 
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
            }

            chickenStock--; 
            System.out.println(cashierName + " berhasil menjual 1 ayam. Sisa stok: " + chickenStock);
        } else {
            // Jika stok 0, pesan gagal akan dicetak secara konsisten
            System.out.println(cashierName + " gagal: Stok Habis!");
        }
    }

    public synchronized int getRemainingStock() {
        return chickenStock;
    }
}

