package week4.no2;

// Cylinder.java
// Represents a cylinder.

public class Cylinder extends Shape {
    private double radius;
    private double height;

    // Constructor: Mengatur cylinder dengan radius dan height.
    public Cylinder(double r, double h) {
        super("Cylinder"); // Memanggil konstruktor Shape dengan nama "Cylinder" 
        radius = r;
        height = h;
    }

    // Mengembalikan luas (surface area) cylinder sesuai instruksi di PDF.
    @Override
    public double area() {
        return Math.PI * radius * radius * height;
    }

    // Mengembalikan representasi cylinder sebagai String.
    @Override
    public String toString() {
        return super.toString() + " of radius " + radius + " and height " + height; // Format serupa dengan Sphere 
    }
}
