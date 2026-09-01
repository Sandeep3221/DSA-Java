package _0ProblemSolving;

public class P12 {

    public static int secondLargest(int[] arr) {

        int max=arr[0];
        int secondLargest=Integer.MIN_VALUE;
        for(int i=0; i<arr.length;i++){
                if(arr[i]>max){
                        secondLargest=max;
                        max=arr[i];
                }else if(arr[i]>secondLargest && arr[i]!=max){
                        secondLargest=arr[i];
                }
        }

        return secondLargest;
    }

    public static void main(String[] args) {

        int[] arr1 = {10, 5, 20, 8, 20, 15};
        System.out.println(secondLargest(arr1));
        // Expected: 15

        int[] arr2 = {5, 2, 8, 3, 7};
        System.out.println(secondLargest(arr2));
        // Expected: 7

        int[] arr3 = {10, 10, 9, 8};
        System.out.println(secondLargest(arr3));
        // Expected: 9

        int[] arr4 = {4, 4, 4, 4};
        System.out.println(secondLargest(arr4));
        // Expected: -1
    }
}