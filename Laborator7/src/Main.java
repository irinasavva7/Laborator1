public class Main {
    public static void main(String[] args) {

        Cub cub=new Cub(2);
        Sphere sphere=new Sphere(3.5);
        Parallelepiped parallelepiped= new Parallelepiped(4,5,12);
        GeometricBody[] geometricBody={cub, sphere, parallelepiped};
        System.out.println("Biggest volume: " + GeometricBodyController.getBiggestVolume(geometricBody));
        System.out.println("Biggest Surface: " + GeometricBodyController.getBiggestArea(geometricBody));
        cub.print();
        sphere.print();
        parallelepiped.print();
    }
}
