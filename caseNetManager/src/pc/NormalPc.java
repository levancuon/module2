package pc;

public class NormalPc extends Pc {

    public NormalPc(String name) {
        super(name);
        this.quality = "normal";
        this.price = 5000;
    }

    public NormalPc(String name, double price, boolean activate) {
        super(name, price, activate);
        this.quality = "normal";
    }

    @Override
    public String toString() {
        return    super.toString()   +" {" +
                "price=" + price +
                " VND/h} " ;
    }
}
