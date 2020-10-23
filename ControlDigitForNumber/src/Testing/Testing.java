package Testing;

import DataStructures.DataStructuresFactory;
import DataStructures.IDataStructures;
import ProblemSolution.IProblemSolution;
import ProblemSolution.ProblemSolutionFactory;
import Validations.IValidations;
import Validations.ValidationsFactory;

public class Testing implements ITesting {

    IDataStructures Data;
    IValidations Validations;
    IProblemSolution ProblemSolution;

    public Testing() {

        Data = new DataStructuresFactory().GetOneDimensionalArrayTypeObject();
        Validations = new ValidationsFactory().GetValidationsObject();
        ProblemSolution = new ProblemSolutionFactory().GetProblemSolutionObject();
    }

    public void Test_GetSumOfDigitsForNumber() {

        assert(ProblemSolution.GetSumOfDigitsForNumber(1234) == 10);
        assert(ProblemSolution.GetSumOfDigitsForNumber(5678) == 26);
        assert(ProblemSolution.GetSumOfDigitsForNumber(12) == 3);
        assert(ProblemSolution.GetSumOfDigitsForNumber(8) == 8);
    }

    public void Test_GetControlDigitForNumber() {

        assert(ProblemSolution.GetControlDigitForNumber(1234) == 1);
        assert(ProblemSolution.GetControlDigitForNumber(5678) == 8);
        assert(ProblemSolution.GetControlDigitForNumber(987) == 6);
    }
}
