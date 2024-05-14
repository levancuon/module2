public class Products {
    private int id;
    private static int increase = 0;
    private String name;
    private double cost;
    private int quantity;
    private String description;

public Products(){}

    public Products( String name, double cost, int quantity, String description) {
        this.id = ++increase;
        this.name = name;
        this.cost = cost;
        this.quantity = quantity;
        this.description = description;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Products{" +
                "id =" + id +
                ", name='" + name + '\'' +
                ", cost=" + cost +
                ", quantity=" + quantity +
                ", description='" + description + '\'' +
                '}';
    }
}
