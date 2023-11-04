import java.util.Random;

abstract class BasicCar implements Cloneable {

    protected String modelName;
    int price;
    String getModelName() {return this.modelName;}
    void setModelName(String modelName) {
        this.modelName = modelName;
    }

    static int setPrice() {
        Random r = new Random();
        return r.nextInt(1000000);
    }

    public BasicCar clone() {
        BasicCar clone = null;
        try{
            clone = (BasicCar)super.clone();
        }catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return clone;
    }

}

class Ford extends BasicCar implements Cloneable {
    public Ford(String m) {modelName = m;}

    @Override
    public BasicCar clone() {
        return (Ford) super.clone();
    }
}
class Nano extends BasicCar implements Cloneable {
    public Nano(String m) {modelName = m;}

    @Override
    public BasicCar clone() {
        return (Nano) super.clone();
    }
}