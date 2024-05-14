package pc;

public class VipPc extends Pc {

    public VipPc(String name) {
        super(name);
        this.price = 10000;
        this.quality = "vip";
    }

    public VipPc(String name, double price, boolean activate) {
        super(name, price, activate);
        this.quality = "vip";

    }

    public VipPc(String name, double moneyOfFood) {
        super(name, moneyOfFood);
    }

    @Override
    public String toString() {
        return super.toString()+ " {" +
                "price=" + price +
                " VND/h} " ;
    }
}
