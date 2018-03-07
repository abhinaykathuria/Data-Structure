package RotationAlgorithms;

public class ArrayRotationCount {

    public static void main(String args[])
    {
        ArrayRotationCount rotate = new ArrayRotationCount();
        int arr[] = {8, 9, 10, 11};
        int count=rotate.rotationCount(arr);
        System.out.println(count);

    }

    private int rotationCount(int[] arr) {
    for(int i=0;i<arr.length-1;i++)
    {
        if(arr[i]>arr[i+1])
            return i+1;
    }

return 0;
    }
}
