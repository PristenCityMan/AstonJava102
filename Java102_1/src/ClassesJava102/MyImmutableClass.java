package ClassesJava102;

public final class MyImmutableClass {

    private final StringBuilder sbMyString;

    public MyImmutableClass (StringBuilder sbMyString)
    {
        this.sbMyString =sbMyString;
    }

    public StringBuilder getSbMyString() {
        return new StringBuilder(sbMyString.toString());
    }
}
