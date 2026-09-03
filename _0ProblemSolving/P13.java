package _0ProblemSolving;


public class P13 {

    public static boolean isSorted(int[] arr) {

        // Your logic goes here:
        for(int i=0;i<arr.length-1;i++){
                if(arr[i]>arr[i+1]){
                        return false;
                }
        }
        return true;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 3, 4, 5};
        System.out.println(isSorted(arr1));
        // Expected: true

        int[] arr2 = {1, 2, 2, 4, 5};
        System.out.println(isSorted(arr2));
        // Expected: true

        int[] arr3 = {1, 3, 2, 4, 5};
        System.out.println(isSorted(arr3));
        // Expected: false

        int[] arr4 = {10, 20, 30, 25, 40};
        System.out.println(isSorted(arr4));
        // Expected: false
    }
}