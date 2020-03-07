package models;

public class InputNeuronsPair {

    private InputNeuron XCoordinateNeuron;
    private InputNeuron YCoordinateNeuron;

    public InputNeuronsPair(InputNeuron XCoordinateNeuron, InputNeuron YCoordinateNeuron) {
        this.XCoordinateNeuron = XCoordinateNeuron;
        this.YCoordinateNeuron = YCoordinateNeuron;
    }

    public InputNeuron getXCoordinateNeuron() {
        return this.XCoordinateNeuron;
    }

    public InputNeuron getYCoordinateNeuron() {
        return this.YCoordinateNeuron;
    }
}
