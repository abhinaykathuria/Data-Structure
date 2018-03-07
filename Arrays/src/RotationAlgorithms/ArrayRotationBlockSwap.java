package RotationAlgorithms;

public class ArrayRotationBlockSwap {

    public static void main(String args[])
    {
        ArrayRotationBlockSwap rotate = new ArrayRotationBlockSwap();
        int arr[] = {1, 2, 3, 4, 5, 6, 7};
        rotate.leftRotate(arr,2);
        rotate.printArray(arr, 7);
    }

    private void leftRotate(int[] arr, int i) {
    }

    void printArray(int arr[], int size)
    {
        int i;
        for (i = 0; i < size; i++)
            System.out.print(arr[i] + " ");
    }
}
