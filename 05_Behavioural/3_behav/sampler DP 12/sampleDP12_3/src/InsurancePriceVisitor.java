public class InsurancePriceVisitor implements ICarVisitor {

    //mutiple viist functions specific to car type present below

    public void visitScorpio(Scorpio scorpio) {
        System.out.println("I am visiting Scorpio");
    }
    public void visitAlto(Alto alto) {
        System.out.println("I am visiting Alto");
    }
}
