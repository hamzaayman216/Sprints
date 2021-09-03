public abstract class Car {
    private String type;
    private int price;
    private int model;
    private String name;
    private static int numberOfCars;

    public Car() {
        numberOfCars++;
    }

    public Car(String type, int price, int model, String name) {
        this.type = type;
        this.price = price;
        this.model = model;
        this.name = name;
        numberOfCars++;
    }

    public Car(int price, int model, String name) {
        this.price = price;
        this.model = model;
        this.name = name;
        numberOfCars++;
    }

    public Car(int model, String name) {
        this.model = model;
        this.name = name;
        numberOfCars++;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public abstract String getFuelType();

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public static int getNumberOfCars() {
        return numberOfCars;
    }

    public int getModel() {
        return model;
    }

    public void setModel(int model) {
        this.model = model;
    }
}
