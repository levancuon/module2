package pc;

public abstract class Pc {
    private String name;

    protected String quality;
    protected double price;
    private boolean activate = false;
    protected double moneyOfFood;

    protected long startTime;
    protected long endTime;

    public Pc(String name) {
        this.name = name;
    }
    public Pc(String name,double price, boolean activate) {
        this.name = name;
        this.price=price;
        this.activate= activate;
    }
    public Pc(String name, double moneyOfFood){
        this.name = name;
        this.moneyOfFood = moneyOfFood;
    }

    public double getMoneyOfFood() {
        return moneyOfFood;
    }

    public void setMoneyOfFood(double money) {
        this.moneyOfFood = money;
    }

    public long getEndTime() {
        return endTime;
    }


    public void setEndTime(long endTime) {
        this.endTime = endTime;
    }

    public long getStartTime() {
        return startTime;
    }

    public void setStartTime(long startTime) {
        this.startTime = startTime;
    }

    public String getName() {
        return name;
    }
    public Integer getIntName(){
        return Integer.parseInt(getName());
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getQuality() {
        return quality;
    }

    public void setQuality(String quality) {
        this.quality = quality;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public boolean isActivate() {
        return activate;
    }

    public void setActivate(boolean activate) {
        this.activate = activate;
    }



    public String toData() {
        return name + "," + getQuality() + "," +getPrice() + "," + activate+","+getMoneyOfFood();
    }

    @Override
    public String toString() {
        return "Pc{" +
                "name = '" + name + '\'' +
                ", quality = '" + quality + '\'' +
                ", activate = " + activate +
                ", money of food = " + moneyOfFood +
                '}';
    }


}
