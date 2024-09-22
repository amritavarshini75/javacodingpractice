import java.util.ArrayList;
import java.util.List;

public class SplitAList {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        List<Integer> list1 = new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        integerList.add(4);
        integerList.add(9);
        integerList.add(8);
        integerList.add(5);
        integerList.add(0);
        integerList.add(10);
        integerList.add(12);

        for (int i = 0; i < integerList.size(); i++) {
            if(i<integerList.size()/2)
            {
                list1.add(integerList.get(i));
        }
            if(i>=integerList.size()/2)
            {
                list2.add(integerList.get(i));
            }


        }

        System.out.println("original list" + " " + integerList);
        System.out.println("first half of the list" + " " + list1);
        System.out.println("second half of the list" + " " + list2);
    }
}
