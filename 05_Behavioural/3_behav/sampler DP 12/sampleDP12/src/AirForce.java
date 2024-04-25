import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class AirForce {
    List<IAircraft> jets = new ArrayList<>();
    IAircraft[] helis = new IAircraft[1];
    LinkedList<Boeing> cargo = new LinkedList<>();

    public AirForce() {
        jets.add(new Tejas());
        helis[0] = new Chinook();
        cargo.add(new Boeing());
    }

    //getters
    public List<IAircraft> getJets() {
        return jets;
    }
    public IAircraft[] getHelis() {
        return helis;
    }
    public LinkedList<Boeing> getCargo() {
        return cargo;
    }

    //create a Airforce level ka Iterator
    public CustomIterator createIterator() {
        return new AirforceIterator(this);
    }


}
