public class Circle implements Shape{
    private int radius;

    public Circle(){

    }
    public Circle(int radius){

        this.radius=radius;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
@Override
    public double getArea(){
        return getRadius()*getRadius()*Math.PI;
}
   @Override
    public String getShapeName(){
        return "Circle";
   }
}