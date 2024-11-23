public class car {
    private String name;
    private int price;

    public car() {
        name = " ";
        price = 0;
    }

    public car(String name) {
        this.name = name;
        price = 0;
    }

    public car(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}