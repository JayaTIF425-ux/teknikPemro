package week2.restoran;

public class RestaurantMain {
    public static void main(String[] args) {
        Restaurant menu = new Restaurant();

        // 1. Menambah Menu 
        menu.tambahMenuMakanan("Pizza", 250000, 20); 
        menu.tambahMenuMakanan("Spaghetti", 80000, 20); 
        menu.tambahMenuMakanan("Tenderloin Steak", 60000, 30); 
        menu.tambahMenuMakanan("Chicken Steak", 45000, 30);

        // 2. Menampilkan menu awal
        System.out.println("=== DAFTAR MENU AWAL ===");
        menu.tampilMenuMakanan(); 
        System.out.println();

        // 3. Simulasi Fitur Pemesanan 
        System.out.println("=== PROSES PEMESANAN ===");
        
        // Skenario: (Stok Cukup)
        menu.pesanMenu("Pizza", 5); 
        
        // Skenario: (Stok Kurang)
        menu.pesanMenu("Spaghetti", 25); 
        
        // Skenario: Stok Menjadi Kosong
        menu.pesanMenu("Chicken Steak", 30); 
        
        System.out.println();

        System.out.println("=== DAFTAR MENU SETELAH PEMESANAN ===");
        menu.tampilMenuMakanan();
    }
}

