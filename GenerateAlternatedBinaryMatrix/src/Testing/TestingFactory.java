package Testing;

public class TestingFactory {

    public ITesting GetTestingObject() {

        return new Testing();
    }
}
