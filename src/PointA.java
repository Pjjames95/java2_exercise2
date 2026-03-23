class PointA{
    public int x_coordinate;
    public int y_coordinate;


    PointA(int x_coordinate, int y_coordinate){
        this.x_coordinate = x_coordinate;
        this.y_coordinate = y_coordinate;
    }

    public void displayPoint(){
        System.out.println("X coordinate: " + x_coordinate + " Y coordinate: " + y_coordinate);
    }

    public int getx(){
        return this.x_coordinate;
    }
    public int gety(){
        return this.y_coordinate;
    }

    public void translate(int dx, int dy){
        System.out.println("Translated new point: (" + (this.x_coordinate += dx ) + ',' + (this.y_coordinate += dy) + ')');
    }

    public static void main( String [] args ){
        PointA pointA = new PointA(1,3);
        pointA.displayPoint();
        System.out.println("x coordinate from the get method: " + pointA.getx());
        System.out.println("y coordinate from the get method: " + pointA.gety());
        pointA.translate(3,4);
    }
}