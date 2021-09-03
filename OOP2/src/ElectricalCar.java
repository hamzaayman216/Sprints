public class ElectricalCar extends Car{
    private int electricalPower;

    public ElectricalCar(int electricalPower) {
        this.electricalPower = electricalPower;
    }
    public ElectricalCar(String type,int electricalPower,int price,int model,String name){
        super(type,price,model,name);
        this.electricalPower=electricalPower;
    }

    public ElectricalCar(int electricalPower,int price,int model,String name){
        super(price,model,name);
        this.electricalPower=electricalPower;
    }
    public ElectricalCar(int electricalPower,int model,String name){
        super(model,name);
        this.electricalPower=electricalPower;
    }
    public int getElectricalPower() {
        return electricalPower;
    }

    public void setElectricalPower(int electricalPower) {
        this.electricalPower = electricalPower;
    }
    @Override
    public String getFuelType(){
        return getElectricalPower()+" Watts are required for this "+getName()+" car";
    }
}
