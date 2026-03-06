package week4.no2;

// PaintThings.java
// Computes the amount of paint needed to paint various things.
// Uses the amount method of the paint class which takes any Shape as a parameter. 

import java.text.DecimalFormat; 

public class PaintThings {
    // Membuat beberapa bentuk dan objek Paint serta mencetak jumlah cat yang dibutuhkan. 
    public static void main (String[] args) {
        final double COVERAGE = 350; 
        Paint paint = new Paint(COVERAGE); 

        Rectangle deck; 
        Sphere bigBall; 
        Cylinder tank; 

        double deckAmt, ballAmt, tankAmt; 

        // 1. Instansiasi tiga bentuk yang akan dicat 
        deck = new Rectangle(20, 35);       // Persegi panjang 20 x 35 kaki 
        bigBall = new Sphere(15);           // Bola dengan radius 15 
        tank = new Cylinder(10, 30);        // Silinder dengan radius 10 dan tinggi 30 

        // 2. Hitung jumlah cat yang dibutuhkan untuk setiap bentuk 
        deckAmt = paint.amount(deck);
        ballAmt = paint.amount(bigBall);
        tankAmt = paint.amount(tank);

        // 3. Cetak jumlah cat untuk masing-masing. 
        DecimalFormat fmt = new DecimalFormat("0.#"); 
        System.out.println ("\nNumber of gallons of paint needed..."); 
        System.out.println ("Deck " + fmt.format(deckAmt)); 
        System.out.println ("Big Ball " + fmt.format(ballAmt)); 
        System.out.println ("Tank " + fmt.format(tankAmt)); 
    }
}
