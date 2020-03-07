package ioData;

import models.InputNeuron;
import models.InputNeuronsPair;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Reader {

    private String filePath = "src/dataFiles/";

    public List<InputNeuronsPair> readInputNeurons() throws IOException {

        Scanner scanner = new Scanner(new File(filePath + "ANDProblem.txt"));
        List<InputNeuronsPair> inputNeuronsPairList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            String[] content = scanner.nextLine().split(",");
            InputNeuron XCoordinateNeuron = new InputNeuron(Integer.parseInt(content[0]), Integer.parseInt(content[2]));
            InputNeuron YCoordinateNeuron = new InputNeuron(Integer.parseInt(content[1]), Integer.parseInt(content[2]));
            InputNeuronsPair inputNeuronsPair = new InputNeuronsPair(XCoordinateNeuron, YCoordinateNeuron);
            inputNeuronsPairList.add(inputNeuronsPair);
        }
        scanner.close();

        return inputNeuronsPairList;
    }

    public double readLearningRate() throws IOException {
        Scanner scanner = new Scanner(new File(filePath + "LearningRate.txt"));
        double learningRate = scanner.nextDouble();
        scanner.close();

        return learningRate;
    }
}
