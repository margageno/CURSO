package second.bad;

public class ResultHandler {
    public Result handle (ResultType resultType){
        switch(resultType){
            case AON:
                return new Result("", "");
            case REGULAR:
                return new Result("", "");
            default:
                break;
        }
        return null;
    }
}
