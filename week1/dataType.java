package week1;

import java.util.Scanner;

public class dataType {
     public static void main(String[] args){
    Scanner scan = new Scanner(System.in);  // Membuat scanner
    int n; // Membuat variabel untuk ukuran array

    // Meminta user untuk menentukan ukuran array
    System.out.println("Masukan berapa banyak bilangan yang akan dieksekusi: ");
    n = scan.nextInt();
    
    // Deklarasi array dan input
    System.out.println("Masukkan bilangan: ");
    String[] Arr = new String[n];
    for(int i = 0; i < n; i++){
        Arr[i] = scan.next();
    }

    // Melakukan pengecekan
    System.out.println("Hasil Pengecekan: ");
    for(int i = 0; i < n; i++){
        try { 
           long x = Long.parseLong(Arr[i]);
            System.out.println(x + " can be fitted in: ");
            if(x >= Byte.MIN_VALUE && x <= Byte.MAX_VALUE){ // Kondisi untuk Byte
                 System.out.println("* Byte");
            }
            if(x >= Short.MIN_VALUE && x <= Short.MAX_VALUE){ // Kondisi untuk Short
                 System.out.println("* Short");
            }
            if(x >= Integer.MIN_VALUE && x <= Integer.MAX_VALUE){ // Kondisi untuk Integer
                 System.out.println("* Int");
            }
            if(x >= Long.MIN_VALUE && x <= Long.MAX_VALUE){ // Kondisi untuk Long
                 System.out.println("* long");
            }
        
        } catch(Exception e) { // Jika program mengalami error
            System.out.println(Arr[i] + " Cannot be fitted anywhere");
        }
    }
    
    scan.close(); 
    }
}
