package ArrayArrangement;

public class ArrayThreeWayPartitioning {

    public static void main (String[] args)
    {
        int arr[] = {1, 14, 5, 20, 4, 2, 54, 20, 87, 98, 3, 1, 32};
        threeWayPartition(arr, 10, 20);
        System.out.println("Modified array ");
        for (int i=0; i < arr.length; i++)
        {
            System.out.print(arr[i] + " ");

        }
    }

    private static void threeWayPartition(int[] arr, int lowVal, int highVal) {
        int low=0;
        int high=arr.length-1;
        for(int i=0;i<high;)
        {
            if(arr[i]<lowVal)
            {
                int temp=arr[i];
                arr[i]=arr[low];
                arr[low]=temp;
                low++;
                i++;
            }
            else if(arr[i]>highVal)
            {
                int temp=arr[i];
                arr[i]=arr[high];
                arr[high]=temp;
                high--;
            }
            else
                i++;
        }


    }


}
