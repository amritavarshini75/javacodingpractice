package org.example.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

//WAP to print the sum and average of the elements present in the list
public class ListSumAverage {
    public static void main(String args[])
    {
        List<Integer> integerList = new ArrayList<>();
        Integer[] numbers = {4,5,0,9,8,11,12};
        int sum=0;
        int average;
        integerList.addAll(Arrays.asList(numbers));
        for (Integer iterate:
             integerList) {
            sum=sum+iterate;

        }
        average=sum/integerList.size();
        System.out.println("List of elements present in the list" + integerList);
        System.out.println("Sum of all the elements in the list :"+ " " + sum);
        System.out.println("Average of all the elements in the list : "+ " " + average);


    }
}
