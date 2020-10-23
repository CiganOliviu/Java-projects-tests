package ProblemSolution;

import DataStructures.DataStructuresFactory;
import DataStructures.IDataStructures;
import Validations.IValidations;
import Validations.ValidationsFactory;

public class ProblemSolution implements IProblemSolution {

    IDataStructures Data;
    IValidations Validation;

    public ProblemSolution() {

        Data = new DataStructuresFactory().GetOneDimensionalArrayTypeObject();
        Validation = new ValidationsFactory().GetValidationsObject();
    }

    public int GetSumOfDigitsForNumber(int Number) {

        Validation.CheckValue(Number);

        int Digit, Sum;

        Sum = 0;

        while (Number != 0) {

            Digit = Number % 10;
            Sum += Digit;
            Number /= 10;
        }

        return Sum;
    }

    public int GetControlDigitForNumber(int Number) {

        int ControlDigit = this.GetSumOfDigitsForNumber(Number);

        Validation.CheckValue(Number);

        while (ControlDigit > 9)
            ControlDigit = this.GetSumOfDigitsForNumber(ControlDigit);

        return ControlDigit;
    }
}
