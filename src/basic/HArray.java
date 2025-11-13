package basic;

import java.util.Arrays;

public class HArray {
    public static void main(String[] args) {
        int[] arr = new int[3];
        int[] arr1 = new int[]{1, 2, 3};
        int[][] multipleDimensions    = {{1}, {1}};
        // Declaration style
//        int[] arr3;
//        int[] nums;
//        int [] nums;
//        int []nums;
//        int nums[];
//        int nums [];
        System.out.println(search(arr1, 4));
        System.out.println(Arrays.compare(arr, arr1));

    }

    public static int search(int[] arr, int key) {
        // works only when the arr was sorted
        return Arrays.binarySearch(arr,  key);
    }
}
