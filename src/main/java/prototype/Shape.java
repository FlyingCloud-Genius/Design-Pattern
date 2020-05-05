package prototype;

/**
 * @fileName: Shape
 * @author: Cloud
 * @create: 2020-05-05
 * @description:
 **/
public abstract class Shape implements Cloneable {

    private String id;

    protected String type;

    abstract void draw();

    public String getType(){
        return type;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}
