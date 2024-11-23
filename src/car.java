public class Car {
    private String name;
    private double price;
    
    public Car(){
        name = " ";
        price = 0;
    }
    
    public Car(String name, Double price2){
        this.name = name;
        this.price = price2;
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

    public void setPrice(int price) {
        this.price = price;
    }
    public String toString() {
        return "Car { name='" + name + "', price=" + price + " } ";
    }
}