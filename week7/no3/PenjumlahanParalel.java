package week7.no3;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.List;

public class PenjumlahanParalel {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // 1. Menerima Input
        System.out.print("Masukkan Jumlah Thread: ");
        int numThreads = input.nextInt();
        System.out.print("Masukkan Angka Akhir: ");
        int maxNumber = input.nextInt();

        List<SumWorker> threads = new ArrayList<>();
        
        // 2. Pembagian Tugas (Divide and Conquer)
        int rangeSize = maxNumber / numThreads;
        int remaining = maxNumber % numThreads; // Untuk menangani angka yang tidak habis dibagi
        
        int currentStart = 1;

        for (int i = 0; i < numThreads; i++) {
            int currentEnd = currentStart + rangeSize - 1;
            
            // Thread terakhir mengambil sisa pembagian agar cover semua angka
            if (i == numThreads - 1) {
                currentEnd += remaining;
            }

            SumWorker t = new SumWorker(currentStart, currentEnd, "Thread-" + (i + 1));
            threads.add(t);
            t.start(); // Menjalankan thread secara paralel
            
            currentStart = currentEnd + 1;
        }

        long totalSum = 0;

        // 3. Sinkronisasi (Join) dan Penggabungan Hasil
        try {
            for (SumWorker t : threads) {
                t.join(); // Menunggu thread selesai sebelum mengambil hasilnya
                totalSum += t.getPartialSum();
            }
        } catch (InterruptedException e) {
            System.err.println("Proses utama terinterupsi!");
        }

        // 4. Output Hasil Akhir
        System.out.println("------------------------------------");
        System.out.println("HASIL AKHIR TOTAL: " + totalSum);
        System.out.println("------------------------------------");
        
        input.close();
    }
}
