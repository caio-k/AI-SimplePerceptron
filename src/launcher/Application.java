package launcher;

import ioData.Reader;
import models.Bias;
import models.InputNeuronsPair;
import models.OutputNeuron;
import simplePerceptron.SimplePerceptron;

import java.io.IOException;
import java.util.List;

public class Application {

    public static void main(String[] args) throws IOException {
        Reader reader = new Reader();
        List<InputNeuronsPair> inputNeuronList = reader.readInputNeurons();
        double learningRate = reader.readLearningRate();

        Bias bias = new Bias();

        SimplePerceptron simplePerceptron = new SimplePerceptron(bias, learningRate, inputNeuronList);
        OutputNeuron outputNeuron = simplePerceptron.run();

        System.out.println("First Weight: " + outputNeuron.getFirstNeuronWeight());
        System.out.println("Second Weight: " + outputNeuron.getSecondNeuronWeight());
        System.out.println("Bias: " + bias.getWeight());
    }
}
