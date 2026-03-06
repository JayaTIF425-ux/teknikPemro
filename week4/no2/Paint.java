package week4.no2;

// Paint.java
// Represents a type of paint that has a fixed area covered by a gallon.
// All measurements are in feet.

public class Paint {
    private double coverage; // jumlah kaki persegi per galon 

    // Constructor: Menyiapkan objek paint. 
    public Paint(double c) {
        coverage = c; 
    }

    // Mengembalikan jumlah cat (jumlah galon) yang
    // dibutuhkan untuk mengecat bentuk yang diberikan sebagai parameter. 
    public double amount(Shape s) {
        System.out.println("Computing amount for " + s); 
        
        // Perbaikan: Jumlah cat = luas bentuk dibagi daya sebar 
        return s.area() / coverage; 
    }
}
