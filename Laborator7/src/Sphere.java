public class Sphere implements GeometricBody,Printable {
    double radius;

    public Sphere(double radius) {
        this.radius = radius;
    }

    @Override
    public double getVolume() {
        return 4*Math.PI*Math.pow(radius,3)/3;
    }

    @Override
    public double getSurface() {
        return 4*Math.PI*Math.pow(radius,2);
    }

    @Override
    public void print() {
        System.out.println("The surface of sphere: " + getSurface());
        System.out.println("The volume of sphere: " + getVolume());
    }
}
