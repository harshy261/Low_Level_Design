import java.util.LinkedList;
import java.util.List;

public class AirforceIterator implements CustomIterator{

    // main logic yaha rahega, k kaise different type of data
    // joki airforce k andar hai, usko same iterator se traverse kia
    //jaa sake

    List<IAircraft> jets;
    IAircraft[] helis;
    LinkedList<Boeing> cargo;
    int jetsPos = 0;
    int helisPos = 0;
    int cargoPos = 0;


    public AirforceIterator(AirForce airForce) {
        jets = airForce.getJets();
        helis = airForce.getHelis();
        cargo = airForce.getCargo();
    }

    @Override
    public IAircraft next() {
        if(helisPos < helis.length) {
            return helis[helisPos++];
        }

        if(jetsPos < jets.size()) {
            return jets.get(jetsPos++);
        }

        if(cargoPos < cargo.size()) {
            return cargo.get(cargoPos++);
        }

        //next element not available
        throw new RuntimeException("No more elements");
    }


    @Override
    public boolean hasNext() {
        return helis.length > helisPos || jets.size() > jetsPos || cargo.size() > cargoPos;
    }
}
