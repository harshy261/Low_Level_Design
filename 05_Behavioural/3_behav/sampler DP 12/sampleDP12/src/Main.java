import java.util.ArrayList;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {

        AirForce airForce = new AirForce();

        CustomIterator allPlanes = airForce.createIterator();

        while(allPlanes.hasNext()){
            System.out.println( allPlanes.next());
        }




//        ArrayList<String> companyList = new ArrayList<>();
//        companyList.add("MS");
//        companyList.add("Amzn");
//
//        //traversal - > iterator ka use karke
//        Iterator<String> it = companyList.iterator();
//        while(it.hasNext()) {
//            System.out.println(it.next());
//        }
    }
}