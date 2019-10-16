package BoxTask;

public class Box {

     int height;
     int width;
     int depth;

    public Box(){
        height = 1;
        width = 1;
        depth = 1;
    }

    public Box(int number){
        height = number;
        width = number;
        depth = number;
    }

    public Box(int height, int width, int depth){
        this.height = height;
        this.width = width;
        this.depth = depth;
    }

    double surfaceArea(){
        return 2*depth*width + 2*depth*height + 2*height*width;
    }

    double volume(){
        return height*width*depth;
    }

    public String result() {
        return ("Height: " + height+" Width: " + width + " Depth: " + depth);
    }
}