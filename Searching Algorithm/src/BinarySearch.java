public class BinarySearch {

    public static void main(String args[])
    {
        int arr[]={1,3,6,8,15,20,25,30};
        int x=0;
         long startTime=System.currentTimeMillis();
        int present=BinarySearch(arr,x);
         long endTime=System.currentTimeMillis();

        if(present!=-1)
            System.out.println("Element Present in Array at loc:"+ present );
        else
            System.out.println("Element is not Present in Array " );
System.out.println("Time Taken is " + (endTime-startTime));

    }

    private static int BinarySearch(int[] arr, int x) {
        int low=0;
        int high=arr.length-1;
        int mid=0;
        while(low<=high)
        {
            mid=(low+high)/2;
            if(arr[mid]==x)
                return mid+1;
            else if(x<arr[mid])
                high=mid-1;
            else
                low=mid+1;
        }

        return -1;
    }


}
