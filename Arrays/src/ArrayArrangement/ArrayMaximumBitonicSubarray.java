//Given an array A[0 … n-1] containing n positive integers,
// a subarray A[i … j] is bitonic if there is a k with i <= k <= j
//such that A[i] <= A[i + 1] ... <= A[k] >= A[k + 1] >= .. A[j – 1] > = A[j].
//Write a function that takes an array as argument and returns the length of the maximum length bitonic subarray.


package ArrayArrangement;

public class ArrayMaximumBitonicSubarray {

    public static void main (String[] args)
    {
        int arr[] = {12, 4, 78, 90, 45, 23};
        int n = arr.length;
        System.out.println("Length of max length Bitnoic Subarray is " + bitonic(arr, n));
    }

    private static int bitonic(int[] arr, int n) {

        int inc[]=new int[n];
        int dec[]=new int[n];

        for(int i=1;i<n-1;i++)
        {

            if(arr[i]>arr[i+1])
            {
                inc[i]=inc[i-1]+1;
            }
            else
            {
                inc[i]=1;
            }
        }

        for(int i=n-2;i>0;i--)
        {

            if(arr[i]>arr[i+1])
            {
                dec[i]=inc[i+1]+1;
            }
            else
            {
                dec[i]=1;
            }
        }

        int max=dec[0]+inc[0]-1;
        for(int i=1;i<n;i++)
        {
            if((dec[i]+inc[i]-1)>max)
            {
                max=dec[i]+inc[i]-1;
            }
        }
        return max;
    }


}
