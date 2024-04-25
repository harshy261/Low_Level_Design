public class Alto implements ICar{


    //important function for double dispatch

    @Override
    public void accept(ICarVisitor carVisitor) {
        carVisitor.visitAlto(this);
    }
}
