package RotationAlgorithms;

public class ArrayRotationPairSum {

    public static void main(String args[])
    {
        ArrayRotationPairSum rotate = new ArrayRotationPairSum();
        int arr[] = { 11, 15, 6, 8, 9, 10};
        System.out.println(rotate.findSum(arr,16));

    }

    private boolean findSum(int[] arr, int sum) {

        int n=arr.length;
        int i=0;
        for(i=0;i<arr.length-1;i++)
        {
            if(arr[i]>arr[i+1])
                break;
        }
        int l=(i+1)%n;
        int r=i;
        while(l!=r)
        {
            if(arr[l]+arr[r]==sum)
                return true;
            else if(arr[l]+arr[r]<sum)
                l=(l+1)%n;
            else
                r=(n+r-1)%n;

        }
    return false;
    }
}
