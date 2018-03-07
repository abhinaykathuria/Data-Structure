package RotationAlgorithms;

public class ArrayRotationOneByOne {

    public static void main(String args[])
    {
        ArrayRotationOneByOne rotate = new ArrayRotationOneByOne();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr,2);
        rotate.printArray(arr, 7);
    }
    private void leftRotate(int[] arr, int d) {
        for(int i=0;i<d;i++)
        {
            leftRotateOne(arr);
        }
    }

    private void leftRotateOne(int[] arr) {
        int start=arr[0];
        int k=0;
        for(int i=1;i< arr.length;i++)
        {
         arr[k]=arr[i];
         k++;
        }
        arr[arr.length-1]=start;
    }

    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
