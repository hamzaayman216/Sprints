public class Main {
    public static void main(String[] args){
        // The Car Task
        ElectricalCar c1=new ElectricalCar("Sedan",3000,2000000,2020,"Tesla");
        GasCar c2=new GasCar(95,6000000,2020,"Mercedes G63");
        GasCar c3=new GasCar("Cabriolet",95,1200000,2020,"BMW Z4");
        System.out.println(c1.getFuelType());
        System.out.println(c2.getFuelType());
        System.out.println(c3.getFuelType());
        System.out.println("The total number of cars is "+Car.getNumberOfCars());
        System.out.println();// for space between two tasks
        // The Shape Task
        Shape c=new Circle(10);
        Shape s=new Square(10);
        System.out.println(displayShape(c));
        System.out.println(displayShape(s));
    }
    public static String displayShape(Shape shape){
        return "This shape is "+shape.getShapeName()+" and its area is equal to "+shape.getArea();
    }
}
