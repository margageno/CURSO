package second.good;

public class RegularResultCreator implements ResultCreator{

    @Override //el override sobreescribe lo que me da el creator
    public Result create() {
        return new Result("3","4");
    }
}
