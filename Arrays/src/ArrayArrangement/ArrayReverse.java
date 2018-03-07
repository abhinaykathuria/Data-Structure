package ArrayArrangement;

public class ArrayReverse {

    public static void main (String[] args)
    {
        int arr[] = {1,2,3,4};
        int n = arr.length;
        reverse(arr,n);
        System.out.println("Array after Reversing: ");
        printArray(arr,n);
    }

    private static void reverse(int[] arr, int n) {

        int j=n-1;
    for (int i=0;i<n/2;i++)
    {
        int temp=arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
        j--;
    }
    }

    static void printArray(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + "   ");
    }
}
