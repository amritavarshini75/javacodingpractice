import java.util.ArrayList;
import java.util.List;

public class MergeTwoLists {
    public static void main(String[] args) {
        List<Integer> list1=new ArrayList<>();
        List<Integer> list2 = new ArrayList<>();
        List<Integer> mergedList=new ArrayList<>();
        list1.add(4);
        list1.add(9);
        list1.add(8);
        list2.add(5);
        list2.add(0);
        list2.add(10);
        mergedList.addAll(list1);
        mergedList.addAll(list2);

        System.out.println("original list 1" + " " + list1);
        System.out.println("original list 2" + " " + list2);
        System.out.println("Merged List: " + " " + mergedList);
    }
}
