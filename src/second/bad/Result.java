package second.bad;

public class Result {
    private ResultType resultType;
    private final String value1, value2; //utilitzar final sempre, no podrem fer els seters i haurem de definir
                                            //uns valors unics per aquests strings

    //ALT+INSERT per fer el constructor
    public Result(String value1, String value2) {
        this.value1 = value1;
        this.value2 = value2;
    }

    public String getValue1() {
        return value1;
    }

    public String getValue2() {
        return value2;
    }
}

