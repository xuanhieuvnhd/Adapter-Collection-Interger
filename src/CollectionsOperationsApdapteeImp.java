import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//Tạo lớp AdapteeImpl implements Adaptee
public class CollectionsOperationsApdapteeImp implements CollectionOperationsApdaptee {
    private Set<Integer> numberSet;

    public CollectionsOperationsApdapteeImp(Set<Integer> numberSet) {
        this.numberSet = numberSet;
    }

    @Override
    public List<Integer> findMax(List<Integer> numberList) {
        return numberList = new ArrayList<>(numberSet);
    }
}
