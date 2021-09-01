public class GasCar extends Car{
    private int benzine;

    public GasCar(int benzine) {
        this.benzine = benzine;
    }
    public GasCar(String type, int benzine, int price, int model, String name){
        super(type,price,model,name);
        this.benzine=benzine;
    }

    public GasCar(int benzine,int price,int model,String name){
        super(price,model,name);
        this.benzine=benzine;
    }
    public GasCar(int benzine,int model,String name){
        super(model,name);
        this.benzine=benzine;
    }
    public int getBenzine() {
        return benzine;
    }

    public void setBenzine(int benzine) {
        this.benzine = benzine;
    }
    @Override
    public String getFuelType(){
        return getBenzine()+" Benzine is preferred for this "+getName()+" car";
    }
}
