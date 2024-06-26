package object1;

public class Chair {
    private String material;
    private String color;
    private int legs;
    private String shape;

    public Chair(String material, String color, int legs, String shape) {
        this.material = material;
        this.color = color;
        this.legs = legs;
        this.shape = shape;
    }

    public String getMaterial() {
        return material;
    }

    public void setMaterial(String material) {
        this.material = material;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getLegs() {
        return legs;
    }

    public void setLegs(int legs) {
        this.legs = legs;
    }

    public String getShape() {
        return shape;
    }

    public void setShape(String shape) {
    }
}
