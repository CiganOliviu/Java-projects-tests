package Validations;

public class Validations implements IValidations {

    public void CheckValue(int Value) {

        if (Value <= 0)
            throw new IllegalArgumentException("Unable to process Negative or Zero Number");
    }
}
