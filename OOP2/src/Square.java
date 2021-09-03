public class Square implements Shape{
    private int side;

    public Square() {
    }

    public Square(int side) {
        this.side = side;
    }

    public int getSide() {
        return side;
    }

    public void setSide(int side) {
        this.side = side;
    }
    @Override
    public double getArea(){
        return getSide()*getSide();
    }
    @Override
    public String getShapeName(){
        return "Square";
    }
}
