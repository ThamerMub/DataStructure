public class Car {
    private String name;
    private double price;
    
    public Car(){
        name = " ";
        price = 0;
    }
    
    public Car(String name, double price){
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public String toString() {
        return "Car{ name = '" + name + "', price = " + price + " }";
    }
}
