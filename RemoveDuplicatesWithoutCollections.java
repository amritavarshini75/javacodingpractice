package org.example.opprac;// Java program to remove duplicates

class RemoveDuplicatesWithoutCollections
{ public static void main (String[] args)
    {
        int [] arr={1,1,2,2,3};
        int n=arr.length;
        int j=0;
        for (int i = 0; i < n-1; i++)
        {if (arr[i] != arr[i+1]){
                arr[j++] = arr[i];}}

        arr[j++] = arr[n-1];

        for (int i = 0; i < j; i++) {
            System.out.print(arr[i]);
        }
        System.out.println();
    }
}


