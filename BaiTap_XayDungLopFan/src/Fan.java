public class Fan {
    public final int SLOW =1;
    public final int MEDIUM =2;
    public final int FAST =3;
    private int SPEED = SLOW;
    private boolean on = false;
    private double radius = 5;
    private String color = "blue";
    public Fan() {
    }
    public Fan(int SPEED, boolean on, double radius, String color) {
        this.SPEED = SPEED;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }







    public int getSLOW() {
        return SLOW;
    }

    public int getMEDIUM() {
        return MEDIUM;
    }

    public int getFAST() {
        return FAST;
    }

    public int getSPEED() {
        return SPEED;
    }

    public void setSPEED(int SPEED) {
        this.SPEED = SPEED;
    }

    public boolean isOn() {
        return on;
    }

    public void setOn(boolean on) {
        this.on = on;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fan{" +
                "SPEED=" + SPEED +
                ", on=" + on +
                ", radius=" + radius +
                ", color='" + color + '\'' +
                '}';
    }
}
