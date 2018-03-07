package ArrayArrangement;

public class PositiveNegativeAlternate {

    public static void main (String[] args)
    {
        int arr[] = {-1, -2, -3, 4, -5, -6, -7, 8, 9};
        int n = arr.length;
        rearrange(arr,n);
        System.out.println("Array after rearranging: ");
        //printArray(arr,n);
    }

    private static void rearrange(int[] arr, int n) {

        int i=-1;
        for(int j=0;j<n;j++)
        {
            if(arr[j]<0)
            {
                i++;
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
            }
        }


        int neg=0;
        int positive=i+1;
        while(neg<positive && arr[neg]<0 && positive <n)
        {
            int temp=arr[neg];
            arr[neg]=arr[positive];
            arr[positive]=temp;
            positive++;
            neg+=2;
        }
        printArray(arr,n);
    }


    static void printArray(int arr[], int n)
{
    for (int i = 0; i < n; i++)
        System.out.print(arr[i] + "   ");
}
}
