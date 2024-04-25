public interface ICar {

    //ye bhot important function  hai, double dispatch k  poV se
    public void accept(ICarVisitor carVisitor);
}
