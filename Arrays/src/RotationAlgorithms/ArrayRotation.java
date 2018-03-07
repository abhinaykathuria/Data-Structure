package RotationAlgorithms;

public class ArrayRotation {

    public static void main(String args[])
    {
        ArrayRotation rotate = new ArrayRotation();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr,2);
        rotate.printArray(arr, 7);
    }

    private void leftRotate(int[] arr, int d) {

        int temp[]=new int[d];
        for(int i=0;i<d;i++)
        {
            temp[i]=arr[i];
        }
        int k=0;
        for(int i=2; i<arr.length;i++)
        {
            arr[k]=arr[i];
            k++;
        }
        k=0;
        for(int i= arr.length-d;i<arr.length;i++)
        {
            arr[i]=temp[k];
            k++;
        }
      //  printArray(arr,arr.length);
    }

    /* utility function to print an array */
    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
