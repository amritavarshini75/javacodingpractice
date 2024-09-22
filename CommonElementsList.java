import java.util.ArrayList;
import java.util.List;

public class CommonElementsList {
    public static void main(String[] args) {
        List<Integer> list1 = new ArrayList<>();
        list1.add(4);list1.add(9);list1.add(8);list1.add(5);

        List<Integer> list2 = new ArrayList<>();
        list2.add(1);list2.add(8);list2.add(0);list2.add(5);list2.add(1);list2.add(6);

        List<Integer> commonEleList = new ArrayList<>();

        for (int n : list1)
        {
            if(list2.contains(n)) {
                commonEleList.add(n);
            }
        }

        System.out.println(commonEleList);
    }
}
