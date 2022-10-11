package Entities;

public class Fruit {
    private String fruitName;

    private double kg;

    public Fruit() {
    }

    public Fruit(String fruitName, double kg) {
        this.fruitName = fruitName;
        this.kg = kg;
    }

    public String getFruitName() {
        return fruitName;
    }

    public void setFruitName(String fruitName) {
        this.fruitName = fruitName;
    }

    public double getKg() {
        return kg;
    }

    public void setKg(double kg) {
        this.kg = kg;
    }
}
