import java.awt.*;

public class ThreeDPoint extends Point {
    public int z_coordinate;

    ThreeDPoint(int x_coordinate, int y_coordinate, int z_coordinate){
        super(x_coordinate,y_coordinate);
        this.z_coordinate = z_coordinate;
    }

    public int getZ_coordinate() {
        return z_coordinate;
    }

    public void displaypoint(){
        System.out.println("The new point is: (" + getX() + ", " + getY() + ", " + z_coordinate + ")");
    }

    public static void main(String[] args){
        ThreeDPoint p = new ThreeDPoint(2,4,3);
        p.displaypoint();
    }
}
