package DataStructures;

public class MatrixType implements IDataStructures {

    private int LengthOfMatrix;
    private int[][] Matrix = new int[25][25];


    public int GetLengthOfMatrix() {

        return this.LengthOfMatrix;
    }


    public void SetLengthOfOneDimensionalArray(int NewValueLength) {

        this.LengthOfMatrix = NewValueLength;
    }

    public int[][] GetMatrix() {

        return this.Matrix;
    }

    public void SetValueForMatrix(int PositionOfLine, int PositionOfColumn, int NewValueForElement) {

        this.Matrix[PositionOfLine][PositionOfColumn] = NewValueForElement;
    }

}
