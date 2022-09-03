import java.util.ArrayList;
import java.util.List;
import java.util.Set;

//Tạo Adapter
public class CollectionUtilsAdapter implements CollectionOperations {
    private CollectionOperationsApdaptee apdaptee;

    public CollectionUtilsAdapter(CollectionOperationsApdaptee apdaptee) {
        this.apdaptee = apdaptee;
    }

    @Override
    public List<Integer> findMax(Set<Integer> numberSet) {
        List<Integer> numberList = new ArrayList<>(numberSet);
        return apdaptee.findMax(numberList);
    }
}
