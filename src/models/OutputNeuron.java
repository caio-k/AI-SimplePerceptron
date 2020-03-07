package models;

public class OutputNeuron {

    private double firstNeuronWeight, secondNeuronWeight;

    public OutputNeuron() {
        this.firstNeuronWeight = generateRandomWeight();
        this.secondNeuronWeight = generateRandomWeight();
    }

    private double generateRandomWeight() {
        int min = -1, max = 1;
        return Math.random() * (max - min + 1) + min;
    }

    public double getFirstNeuronWeight() {
        return firstNeuronWeight;
    }

    public void setFirstNeuronWeight(double firstNeuronWeight) {
        this.firstNeuronWeight = firstNeuronWeight;
    }

    public double getSecondNeuronWeight() {
        return secondNeuronWeight;
    }

    public void setSecondNeuronWeight(double secondNeuronWeight) {
        this.secondNeuronWeight = secondNeuronWeight;
    }
}
