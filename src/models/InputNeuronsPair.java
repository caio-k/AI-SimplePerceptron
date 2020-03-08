package models;

public class InputNeuronsPair {

    private InputNeuron XCoordinateNeuron;
    private InputNeuron YCoordinateNeuron;
    private int expectedResponse;

    public InputNeuronsPair(InputNeuron XCoordinateNeuron, InputNeuron YCoordinateNeuron, int expectedResponse) {
        this.XCoordinateNeuron = XCoordinateNeuron;
        this.YCoordinateNeuron = YCoordinateNeuron;
        this.expectedResponse = expectedResponse;
    }

    public InputNeuron getXCoordinateNeuron() {
        return this.XCoordinateNeuron;
    }

    public InputNeuron getYCoordinateNeuron() {
        return this.YCoordinateNeuron;
    }

    public int getExpectedResponse() {
        return expectedResponse;
    }
}
