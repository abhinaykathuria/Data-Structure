package RotationAlgorithms;

public class ArrayRotationReversalAlgorithm {

    public static void main(String args[])
    {
        ArrayRotationReversalAlgorithm rotate = new ArrayRotationReversalAlgorithm();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr,2);
        rotate.printArray(arr, 7);
    }

    private void leftRotate(int[] arr, int d) {
        reverse(arr,0,d);
        reverse(arr,d, arr.length);
        reverse(arr,0, arr.length);
    }

    private void reverse(int[] arr, int j, int length) {
        int k=length-1;
        for(int i=j;i<j+(length-j)/2;i++)
        {
            int temp=arr[i];
            arr[i]=arr[k];
            arr[k]=temp;
            k--;
        }
    }

    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }

}

