public class LinearSearch {

    public static void main(String args[])
    {
        int arr[]={1,4,6,21,32,15};
        int x=21;
        int present=linearSearch(arr,x);
        if(present!=-1)
         System.out.println("Element Present in Array at loc:"+ present );
        else
            System.out.println("Element is not Present in Array " );


    }

    private static int linearSearch(int[] arr, int x) {

        for(int i=0;i<arr.length;i++)
        {
            if(arr[i]==x)
                return (i+1);

        }
        return -1;
    }
}
