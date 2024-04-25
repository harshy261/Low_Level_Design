public class Scorpio implements IScorpioPrototype{

    //default Engine
    ScorpioEngine engine;

    public Scorpio() {
        //default engine
        this.engine = new ScorpioEngine();
    }

    private Scorpio(ScorpioEngine scorpioEngine) {
        //deep copy - copy constructor
        this.engine = new ScorpioEngine(scorpioEngine);
    }

    @Override
    public void start() {
        System.out.println("Start hogyi Scorpio");
    }

    @Override
    public IScorpioPrototype clone() {
        IScorpioPrototype clonedScorpio = new Scorpio(this.engine);
        return clonedScorpio;
    }

    @Override
    public void setEngine(ScorpioEngine eng) {
        this.engine = eng;
    }
}
