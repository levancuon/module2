public class Point3D extends Point2D {
    private float z =0.0f;

    public Point3D() {
    }

    public Point3D(float x, float y, float z) {
        super(x, y);
        this.z = z;
    }

    public float getZ() {
        return z;
    }

    public void setZ(float z) {
        this.z = z;
    }
    public void setXYZ(float x,float y,float z){
        super.setX(x);
        super.setX(y);
        this.z=z;
    }
    public float[] getXYZ(float x,float y,float z){
        float[] arrr= new float[3];
        arrr[0]=x;
        arrr[1]=y;
        arrr[2]=z;
        return arrr;
    }

    @Override
    public String toString() {
        return "("+getX()+","+getY()+","+getZ()+")";
    }
}
