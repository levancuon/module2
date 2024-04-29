package Products;

import java.io.Serializable;

public class Product implements Serializable {
    private int id;
    private String name;
    private double money;
    private String hangSanXuat;
    private String description;

    public Product(int id, String name, double money, String hangSanXuat, String description) {
        this.id = id;
        this.name = name;
        this.money = money;
        this.hangSanXuat = hangSanXuat;
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

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }

    public String getHangSanXuat() {
        return hangSanXuat;
    }

    public void setHangSanXuat(String hangSanXuat) {
        this.hangSanXuat = hangSanXuat;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", money=" + money +
                ", hangSanXuat='" + hangSanXuat + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
