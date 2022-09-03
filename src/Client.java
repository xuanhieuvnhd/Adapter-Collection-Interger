import java.util.HashSet;
import java.util.Set;

//Viết Client
public class Client {
    public static void main(String[] args) {
        Set<Integer> listNumber = new HashSet<>();
        listNumber.add(1);
        listNumber.add(2);
        listNumber.add(3);

        CollectionOperationsApdaptee apdaptee = new CollectionsOperationsApdapteeImp(listNumber);

        CollectionUtilsAdapter adapter = new CollectionUtilsAdapter(apdaptee);

        System.out.println(adapter.findMax(listNumber));

    }
}