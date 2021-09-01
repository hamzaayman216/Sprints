public class Main {
    public static void main(String[] args){
        ElectricalCar c1=new ElectricalCar("Sedan",3000,2000000,2020,"Tesla");
        GasCar c2=new GasCar(95,6000000,2020,"Mercedes G63");
        GasCar c3=new GasCar("Cabriolet",95,1200000,2020,"BMW Z4");
        System.out.println(c1.getFuelType());
        System.out.println(c2.getFuelType());
        System.out.println(c3.getFuelType());
    }
}
