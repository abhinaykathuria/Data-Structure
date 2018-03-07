public class InterpolationSearch {


    public static void main(String args[])
    {
        int arr[]={10, 12, 13, 16, 18, 19, 20, 21, 22, 23, 24, 33, 35, 42, 47};
        int x=44;
        int present=InterpolationSearch(arr,x);
        if(present!=-1)
            System.out.println("Element Present in Array at loc:"+ present );
        else
            System.out.println("Element is not Present in Array " );
    }

    private static int InterpolationSearch(int arr[],int x)
    {
        int low=0;
        int high =arr.length-1;
        while(low<=high && (x>=arr[low]) && (x<=arr[high]))
        {
            int pos = low + (int)((double)(x-arr[low]) * (high-low))/(arr[high]-arr[low]);
            if(arr[pos]==x)
                return pos;
            else if(arr[pos]<x)
                low=pos+1;
            else
                high=pos-1;

        }
        return -1;
    }
}
