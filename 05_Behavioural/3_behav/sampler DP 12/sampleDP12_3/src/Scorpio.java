public class Scorpio implements ICar{

    @Override
    public void accept(ICarVisitor carVisitor) {
        //V>V>V>V>V>VIMP
        System.out.println("inside scorpio accept method");
        carVisitor.visitScorpio(this);
    }
}
