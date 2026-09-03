package _0ProblemSolving;


public class P14 {

    public static int findMissing(int[] arr, int n) {

        int expectedSum=n*(n+1)/2;
        int arrSum=0;
        for(int i=0;i<arr.length;i++){
                
                arrSum=arrSum+arr[i];
                
        }
        int missingNumber=expectedSum-arrSum;

        return missingNumber;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 4, 5};
        System.out.println(findMissing(arr1, 5));
        // Expected: 3

        int[] arr2 = {1, 3, 4, 5, 6};
        System.out.println(findMissing(arr2, 6));
        // Expected: 2

        int[] arr3 = {2, 3, 4, 5};
        System.out.println(findMissing(arr3, 5));
        // Expected: 1

        int[] arr4 = {1, 2, 3, 4};
        System.out.println(findMissing(arr4, 5));
        // Expected: 5
    }
}