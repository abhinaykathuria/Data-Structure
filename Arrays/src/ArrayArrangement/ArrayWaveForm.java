package ArrayArrangement;

import java.util.Arrays;

public class ArrayWaveForm {

    public static void main (String[] args)
    {
        int arr[] = {4,1,5,2,10,23,12};
        int n = arr.length;
        waveForm(arr,n);
        System.out.println("Array after Reversing: ");
        printArray(arr,n);
    }

    private static void waveForm(int[] arr, int n) {

        Arrays.sort(arr);
        int i=0;
        while (i<n-1){
            int temp=arr[i];
            arr[i]=arr[i+1];
            arr[i+1]=temp;
            i+=2;

        }

    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
    }
}
