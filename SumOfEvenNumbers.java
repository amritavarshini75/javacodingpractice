import java.util.ArrayList;
import java.util.List;

//WAP to print the sum of even elements present in the list
public class SumOfEvenNumbers {
    public static void main(String[] args) {
        int evenNumberSum=0;
        List<Integer> numberList = new ArrayList<>();
        numberList.add(4);
        numberList.add(5);
        numberList.add(0);
        numberList.add(9);
        numberList.add(8);
        numberList.add(10);

        for (int number:
             numberList) {
            if(number%2==0)
            {
                evenNumberSum=evenNumberSum+number;
            }


        }

        System.out.println("Sum of even numbers in the list:" + " " + evenNumberSum);
    }
}
