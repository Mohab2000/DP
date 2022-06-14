package Prototype;

public abstract class Shape implements Cloneable{
    public String id;
    public String type;
    public abstract void draw();
    public String getId(){
        return id;
    }
    public String getType() {
        return type;
    }
    public void setId (String id)
    {
        this.id = id;
    }
    public Object clone() {
        Object clone = null;
        try {
            clone = super.clone();
        }
        catch (CloneNotSupportedException exp) {
            exp.printStackTrace();
        }
        return clone;
    }
}
