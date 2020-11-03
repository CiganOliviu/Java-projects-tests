package IO;

import DataStructures.DataStructuresFactory;
import DataStructures.IDataStructures;
import Validations.IValidations;
import Validations.ValidationsFactory;

public class InputOutputOperations implements I_InputOutputOperations {

    IValidations Validation;

    public InputOutputOperations() {

        Validation = new ValidationsFactory().GetValidationsObject();
    }

    public void OutputMatrix(IDataStructures Data) {

        Validation.CheckValue(Data.GetLengthOfMatrix());

        int LengthOfArray = Data.GetLengthOfMatrix();

        for (int iterator = 0; iterator < LengthOfArray; iterator++) {
            for (int jiterator = 0; jiterator < LengthOfArray; jiterator++)
                System.out.print(Data.GetMatrix()[iterator][jiterator] + " ");
            System.out.println();
        }
    }
}
