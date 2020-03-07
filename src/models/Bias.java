package models;

public class Bias {

    private double weight;

    public Bias() {
        this.weight = generateRandomWeight();
    }

    private double generateRandomWeight() {
        int min = -1, max = 1;
        return Math.random() * (max - min + 1) + min;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
