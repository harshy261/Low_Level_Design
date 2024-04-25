public class DepPriceVisitor implements ICarVisitor{

    @Override
    public void visitScorpio(Scorpio scorpio) {
        System.out.println("I am visiting Dep Scorpio");
    }

    @Override
    public void visitAlto(Alto alto) {
        System.out.println("I am visiting Dep Alto");
    }
}
