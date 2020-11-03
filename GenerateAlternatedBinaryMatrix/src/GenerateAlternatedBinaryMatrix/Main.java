package GenerateAlternatedBinaryMatrix;

import IO.I_InputOutputOperations;
import IO.InputOutputOperationsDataFactory;
import ProblemSolution.IProblemSolution;
import ProblemSolution.ProblemSolutionFactory;
import Testing.ITesting;
import Testing.Testing;
import Testing.TestingFactory;

public class Main {

    private static ITesting Testing;
    private static IProblemSolution ProblemSolution;
    private static I_InputOutputOperations IO;

    public static void main(String[] args) {

        Testing = new TestingFactory().GetTestingObject();

        Testing.Test_IsEven_();

        ProblemSolution = new ProblemSolutionFactory().GetProblemSolutionObject();
        IO = new InputOutputOperationsDataFactory().GetInputOutputOperationsObject();

        IO.OutputMatrix(ProblemSolution.GetResponse_GenerateAlternatedBinaryMatrix_(5));
    }
}
