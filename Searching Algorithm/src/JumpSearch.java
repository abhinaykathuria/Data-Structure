public class JumpSearch {

    public static void main(String args[])
    {
        int arr[]={1,4,6,21,32,45};
        int x=1;
        int present=JumpSearch(arr,x,arr.length);
        if(present!=-1)
            System.out.println("Element Present in Array at loc:"+ present );
        else
            System.out.println("Element is not Present in Array " );


    }

    private static int JumpSearch(int arr[],int x,int n)
    {
        int step= (int) Math.sqrt(n);
        int prev=0;

        while(arr[Math.min(step,n)-1]<x)
        {
            prev=step;
            step= (int) (prev+Math.sqrt(n));
            if(prev>=n)
                return -1;

        }

        while(arr[prev]<x)
        {
            prev++;
            if(prev==Math.min(step,n))
                return -1;
        }
        if(arr[prev]==x)
            return prev;


        return -1;
    }
}
