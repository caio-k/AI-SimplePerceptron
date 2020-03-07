package models;

public class InputNeuron {

    private int value, expectedResponse;

    public InputNeuron(int value, int expectedResponse) {
        this.value = value;
        this.expectedResponse = expectedResponse;
    }

    public int getValue() {
        return value;
    }

    public int getExpectedResponse() {
        return expectedResponse;
    }
}
