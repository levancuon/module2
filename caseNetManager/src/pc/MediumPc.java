package pc;

public class MediumPc extends Pc {


    public MediumPc(String name) {
        super(name);
        this.quality = "medium";
        this.price = 7500;
    }

    public MediumPc(String name, double price, boolean activate) {
        super(name, price, activate);
        this.quality = "medium";
    }

    @Override
    public String toString() {
        return super.toString()+ " {" +
                "price=" + price +
                " VND/h} " ;
    }
}
