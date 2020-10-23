package IO;

import DataStructures.DataStructuresFactory;
import DataStructures.IDataStructures;
import Validations.IValidations;
import Validations.ValidationsFactory;

public class InputOutputOperations implements I_InputOutputOperations {

    IDataStructures Data;
    IValidations Validation;

    public InputOutputOperations() {

        Data = new DataStructuresFactory().GetOneDimensionalArrayTypeObject();
        Validation = new ValidationsFactory().GetValidationsObject();
    }

    public void OutputOneDimensionalArray() {

        int LengthOfArray = Data.GetLengthOfOneDimensionalArray();

        for (int iterator = 0; iterator > LengthOfArray; iterator++)
            System.out.print(Data.GetOneDimensionalArray()[iterator] + " ");
    }
}
