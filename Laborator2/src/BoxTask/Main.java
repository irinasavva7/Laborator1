package BoxTask;

public class Main {
    public static void main(String[] args) {
        Box box1 = new Box();
        Box box2 = new Box(5);
        Box box3 = new Box(2,3,4);
        System.out.println("Box1 sizes: "+ box1.result());
        System.out.println("Surface area of box1: " + box1.surfaceArea());
        System.out.println("Volume of box1: " + box1.volume());
        System.out.println("\nBox2 sizes: "+ box2.result());
        System.out.println("Surface of box2: " + box2.surfaceArea());
        System.out.println("Volume of box2: " + box2.volume());
        System.out.println("\nBox3 sizes: "+ box3.result());
        System.out.println("Surface of box3 " + box3.surfaceArea());
        System.out.println("Volume of box3: " + box3.volume());
    }
}
