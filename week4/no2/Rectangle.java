package week4.no2;

public class Rectangle extends Shape {
    private double length;
    private double width;

    // Constructor: Mengatur rectangle dengan panjang dan lebar.
    public Rectangle(double l, double w) {
        super("Rectangle"); // Memanggil konstruktor Shape dengan nama "Rectangle" 
        length = l;
        width = w;
    }

    // Mengembalikan luas persegi panjang (panjang * lebar).
    @Override
    public double area() {
        return length * width; 
    }

    // Mengembalikan representasi rectangle sebagai String.
    @Override
    public String toString() {
        return super.toString() + " of length " + length + " and width " + width; 
    }
}
