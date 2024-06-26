package object1;

public class Dog {
    private String name;
    private int age;
    private String breed;
    private String color;
    private Boolean goodBoy;

    public Dog(String name, int age, String breed, String color, Boolean goodBoy) {
        this.name = name;
        this.age = age;
        this.breed = breed;
        this.color = color;
        this.goodBoy = goodBoy;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBreed() {
        return breed;
    }

    public void setBreed(String breed) {
        this.breed = breed;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Boolean getGoodBoy() {
        return goodBoy;
    }

    public void setGoodBoy(Boolean goodboy) {
        this.goodBoy = goodBoy;
    }
}
