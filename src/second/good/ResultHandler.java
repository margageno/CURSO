package second.good;

public class ResultHandler {
    public Result handle (ResultCreator resultCreator) {
        return resultCreator.create();
    }
}
