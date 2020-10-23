package ControlDigitForNumber;

import IO.I_InputOutputOperations;
import IO.InputOutputOperationsDataFactory;
import Testing.ITesting;
import Testing.TestingFactory;

public class Main {

    private static ITesting Testing;

    public static void main(String[] args) {

        Testing = new TestingFactory().GetTestingObject();

        Testing.Test_GetSumOfDigitsForNumber();
        Testing.Test_GetControlDigitForNumber();
    }
}
