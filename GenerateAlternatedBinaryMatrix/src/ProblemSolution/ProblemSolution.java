package ProblemSolution;

import DataStructures.DataStructuresFactory;
import DataStructures.IDataStructures;
import DataStructures.MatrixType;
import Validations.IValidations;
import Validations.ValidationsFactory;

public class ProblemSolution implements IProblemSolution {

    IDataStructures Data;
    IValidations Validation;

    public ProblemSolution() {

        Data = new DataStructuresFactory().GetMatrixTypeObject();
        Validation = new ValidationsFactory().GetValidationsObject();
    }

    private boolean IsEven(int Number) {

        return Number % 2 == 0;
    }

    public boolean GetResponse_IsEven_(int Number) {

       return IsEven(Number);
    }

    private MatrixType GenerateAlternatedBinaryMatrix(int Length) {

        Validation.CheckValue(Length);

        this.Data.SetLengthOfOneDimensionalArray(Length);

        for (int iterator = 0; iterator < this.Data.GetLengthOfMatrix(); iterator++)
            for (int jiterator = 0; jiterator < this.Data.GetLengthOfMatrix(); jiterator++)
                if (this.IsEven(iterator + jiterator))
                    Data.GetMatrix()[iterator][jiterator] = 1;
                else Data.GetMatrix()[iterator][jiterator] = 0;

        return (MatrixType) this.Data;
    }

    public MatrixType GetResponse_GenerateAlternatedBinaryMatrix_(int Length) {

        return this.GenerateAlternatedBinaryMatrix(Length);
    }
}
