package drinkandfood;

public class FoodAndWater {
    private String name;
    private double price;
    private int quantity;
    private String type;
    public FoodAndWater() {}

    public FoodAndWater(String name, double price,String type ,int quantity ) {
        this.name = name;
        this.price = price;
        this.type= type;
        this.quantity= quantity;
    }
public String toData(){
        return name+","+price+","+type+","+quantity;
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

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    @Override
    public String toString() {
        return "FoodAndWater{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", quantity=" + quantity +
                ", type='" + type + '\'' +
                '}';
    }
}
