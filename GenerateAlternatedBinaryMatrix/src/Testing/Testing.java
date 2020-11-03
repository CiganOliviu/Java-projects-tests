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

        Data = new DataStructuresFactory().GetMatrixTypeObject();
        Validations = new ValidationsFactory().GetValidationsObject();
        ProblemSolution = new ProblemSolutionFactory().GetProblemSolutionObject();
    }

    public void Test_IsEven_() {

        assert(ProblemSolution.GetResponse_IsEven_(2));
        assert(!ProblemSolution.GetResponse_IsEven_(13));
        assert(ProblemSolution.GetResponse_IsEven_(86));
        assert(ProblemSolution.GetResponse_IsEven_(26));
        assert(!ProblemSolution.GetResponse_IsEven_(23));
    }
}
