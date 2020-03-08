package ioData;

import models.InputNeuron;
import models.InputNeuronsPair;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Reader {

    private String filePath = "src/dataFiles/";

    public List<InputNeuronsPair> readInputNeurons() throws IOException {

        Scanner scanner = new Scanner(new File(filePath + "ANDProblem.txt"));
        List<InputNeuronsPair> inputNeuronsPairList = new ArrayList<>();

        while (scanner.hasNextLine()) {
            List<String> content = Arrays.asList(scanner.nextLine().split(","));
            InputNeuron XCoordinateNeuron = new InputNeuron(Integer.parseInt(content.get(0)));
            InputNeuron YCoordinateNeuron = new InputNeuron(Integer.parseInt(content.get(1)));
            InputNeuronsPair inputNeuronsPair = new InputNeuronsPair(XCoordinateNeuron, YCoordinateNeuron, Integer.parseInt(content.get(2)));
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
