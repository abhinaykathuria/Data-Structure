package RotationAlgorithms;

import java.util.Arrays;
import java.util.Collections;

public class ArrayRotationBinarySearch {

    public static void main(String args[])
    {
        ArrayRotationBinarySearch rotate = new ArrayRotationBinarySearch();
        int arr[] = { 3, 4, 5, 6, 7,1,2};
        int found=rotate.findElement(arr,1);

        System.out.println(found);

    }

    private int findElement(int[] arr, int x) {

        int pivot=0;
        for(int i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
            {
                pivot=1;
                if(arr[0]>x)
                return Arrays.binarySearch(arr,i+1, arr.length,x);
                else
                    return Arrays.binarySearch(arr,0, i,x);

            }
        }
        if(pivot==0)
            return Arrays.binarySearch(arr,0, arr.length,x);
        return -1;
    }


}
