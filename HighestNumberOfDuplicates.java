import java.util.*;

public class HighestNumberOfDuplicates {
    public static void main(String[] args) {
        int[] numbers = {4,1,9,4,8,0,5,8,1,8,6};
        int maxValue=0;
        int maxElement=0;
        Map<Integer,Integer> numbersFrequencyCountList = new HashMap<>();


        for (int num: numbers){
            numbersFrequencyCountList.put(num,numbersFrequencyCountList.getOrDefault(num,0)+1);
        }

       for(Map.Entry<Integer,Integer> entries : numbersFrequencyCountList.entrySet())
       {
           if(entries.getValue()>maxValue)
           {
               maxValue= entries.getValue();
               maxElement = entries.getKey();


           }
       }

        System.out.println(maxElement);


    }
}
