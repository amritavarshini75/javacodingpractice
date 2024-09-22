import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashSet;
import java.util.List;

public class RemoveDuplicatesFromList {
    public static void main(String[] args) {
        Integer[] numbers = {4,1,9,4,8,0,5,1,8,6};
        List<Integer> numList = new ArrayList<>();
        numList.addAll(Arrays.asList(numbers));
        LinkedHashSet<Integer> nonDupNumbers = new LinkedHashSet<>();
        nonDupNumbers.addAll(numList);
        numList.clear();
        numList.addAll(nonDupNumbers);
        System.out.println(numList);


    }
}
