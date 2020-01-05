public class Parallelepiped  implements GeometricBody, Printable {
    double length;
    double width;
    double height;

    public Parallelepiped(double length, double width, double height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    @Override
    public double getVolume() {
        return length*width*height;
    }

    @Override
    public double getSurface() {
        return 2*(length*height + width*height + length*width);
    }

    @Override
    public void print() {
        System.out.println("The surface of parallelepiped: " + getSurface());
        System.out.println("The volume of parallelepiped: " + getVolume());
    }
}
