package simplePerceptron;

import models.Bias;
import models.InputNeuron;
import models.InputNeuronsPair;
import models.OutputNeuron;

import java.util.List;

public class SimplePerceptron {

    private Bias bias;
    private double learningRate;
    private OutputNeuron outputNeuron;
    private List<InputNeuronsPair> inputNeuronsPairList;

    public SimplePerceptron(Bias bias, double learningRate, List<InputNeuronsPair> inputNeuronsPairList) {
        this.bias = bias;
        this.learningRate = learningRate;
        this.outputNeuron = new OutputNeuron();
        this.inputNeuronsPairList = inputNeuronsPairList;
    }

    private double calculateY_in(InputNeuron XCoordinateNeuron, InputNeuron YCoordinateNeuron) {
        return bias.getWeight() + (outputNeuron.getFirstNeuronWeight()*XCoordinateNeuron.getValue())
                + (outputNeuron.getSecondNeuronWeight()*YCoordinateNeuron.getValue());
    }

    private int bipolarStepFunction(double value) {
        return value >= 0 ? 1 : -1;
    }

    private void updateWeights(InputNeuron XCoordinateNeuron, InputNeuron YCoordinateNeuron, int expectedResponse) {
        outputNeuron.setFirstNeuronWeight(outputNeuron.getFirstNeuronWeight() + learningRate*expectedResponse*XCoordinateNeuron.getValue());
        outputNeuron.setSecondNeuronWeight(outputNeuron.getSecondNeuronWeight() + learningRate*expectedResponse*YCoordinateNeuron.getValue());
    }

    private void updateBias(int expectedResponse) {
        bias.setWeight(bias.getWeight() + learningRate*expectedResponse);
    }

    public OutputNeuron run() {
        boolean hasAnyWeightChanged = true;
        double yIn;

        // While there are changes in weights, continue in the loop until you find weights that satisfy the problem
        while (hasAnyWeightChanged) {
            hasAnyWeightChanged = false;

            // For each input neuron pair (X and Y coordinate)
            for (InputNeuronsPair inputNeuronsPairList : inputNeuronsPairList) {

                // Calculate y_in
                yIn = calculateY_in(inputNeuronsPairList.getXCoordinateNeuron(), inputNeuronsPairList.getYCoordinateNeuron());

                // Checks whether the result of the activation function is not as expected
                if (bipolarStepFunction(yIn) != inputNeuronsPairList.getExpectedResponse()) {

                    // As it is not the expected value, update the weights
                    hasAnyWeightChanged = true;
                    updateWeights(inputNeuronsPairList.getXCoordinateNeuron(), inputNeuronsPairList.getYCoordinateNeuron(), inputNeuronsPairList.getExpectedResponse());
                    updateBias(inputNeuronsPairList.getExpectedResponse());
                }
            }
        }

        return this.outputNeuron;
    }
}
