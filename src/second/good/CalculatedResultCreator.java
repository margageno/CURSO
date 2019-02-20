package second.good;

public class CalculatedResultCreator implements ResultCreator{
    @Override
    public Result create() {
        return new Result("","");
    }
}
