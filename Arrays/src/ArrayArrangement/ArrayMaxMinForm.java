package ArrayArrangement;

import java.util.Arrays;

public class ArrayMaxMinForm {

    public static void main(String[] args)
    {
        int arr[] = new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println("Original Array ");
        System.out.println(Arrays.toString(arr));

        rearrange(arr,arr.length);



    }

    private static void rearrange(int[] arr, int length) {

        int low=0;
        int high=arr.length-1;
        int temp[]=new int[length];

        for(int i=0;i<length;i++)
        {
            if(i%2==0)
            {
               temp[i]=arr[high];
               high--;
            }
            else
            {
                temp[i]=arr[low];
                low++;
            }
        }
        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(temp));

    }
}
