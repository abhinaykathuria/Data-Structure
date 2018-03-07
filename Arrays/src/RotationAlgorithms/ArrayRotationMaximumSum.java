package RotationAlgorithms;

public class ArrayRotationMaximumSum {

    public static void main(String args[])
    {
        ArrayRotationMaximumSum rotate = new ArrayRotationMaximumSum();
        int arr[] = {8, 3, 1, 2};
        rotate.maximumSum(arr);

    }

    private void maximumSum(int[] arr) {

        int res=0;
        for(int i=0;i<arr.length;i++)
        {


            int curr_sum=0;
            for(int j=0;j<arr.length;j++)
            {
                int pos=(i+j)%arr.length;
                curr_sum+=j*arr[pos];
            }

            res=Math.max(res,curr_sum);
        }
        System.out.println(res);
    }
}
