public class GeometricBodyController {

    static GeometricBody getBiggestVolume(GeometricBody bodies[]){
        GeometricBody biggestVolumeBody= bodies[0];
        double maxVolume = bodies[0].getSurface();
        for (int i=0; i < bodies.length; i++) {
            if (bodies[i].getSurface() > maxVolume) {
                biggestVolumeBody = bodies[i];
                maxVolume = bodies[i].getSurface();
            }
        }
        return biggestVolumeBody;
    }
    static GeometricBody getBiggestArea(GeometricBody bodies[]){
        GeometricBody biggestAreaBody= bodies[0];
        double maxSurface = bodies[0].getSurface();
        for (int i=0; i < bodies.length; i++) {
            if (bodies[i].getSurface() > maxSurface) {
                biggestAreaBody = bodies[i];
                maxSurface = bodies[i].getSurface();
            }
        }
        return biggestAreaBody;
    }
}
