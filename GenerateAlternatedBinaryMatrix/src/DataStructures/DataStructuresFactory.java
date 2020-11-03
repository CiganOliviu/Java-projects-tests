package DataStructures;

public class DataStructuresFactory {

    public IDataStructures GetMatrixTypeObject() {

        return new MatrixType();
    }
}
