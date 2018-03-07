package RotationAlgorithms;

public class ArrayRotationMinimumElement {

    public static void main(String args[])
    {
        ArrayRotationMinimumElement rotate = new ArrayRotationMinimumElement();
        int arr[] = { 6, 8, 9, 10};
        System.out.println(rotate.findMinimum(arr));

    }

    private int findMinimum(int[] arr) {

        for(int i=0;i<arr.length-1;i++) {
            if (arr[i] > arr[i + 1])
                return arr[i + 1];
        }
        return arr[0];
    }

}
