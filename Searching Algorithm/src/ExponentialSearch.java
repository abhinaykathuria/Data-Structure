import java.util.Arrays;

public class ExponentialSearch {

    public static void main(String args[])
    {
        int arr[]={10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x=20;
        int present=ExponentialSearch(arr,x);
        if(present!=-1)
            System.out.println("Element Present in Array at loc:"+ present );
        else
            System.out.println("Element is not Present in Array " );
    }

    private static int ExponentialSearch(int arr[],int x)
    {

        if(arr[0]==x)
            return 0;
        int i=1;
        while(arr[i]<=x && i<arr.length)
            i=i*2;

        return Arrays.binarySearch(arr,i/2,i,x);



    }
}
