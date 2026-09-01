package _0ProblemSolving;

public class P11 {

    public static int removeDuplicates(int[] arr) {

       int count=1;
       for(int i=0;i<arr.length-1;i++){
                if(arr[i]!=arr[i+1]){
                        count++;
                }
       }

        return count;
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 1, 2, 2, 3, 4, 4};
        System.out.println(removeDuplicates(arr1));
        // Expected: 4

        int[] arr2 = {1, 1, 1, 1};
        System.out.println(removeDuplicates(arr2));
        // Expected: 1

        int[] arr3 = {1, 2, 3, 4, 5};
        System.out.println(removeDuplicates(arr3));
        // Expected: 5

        int[] arr4 = {2, 2, 3, 3, 3, 5, 5, 7};
        System.out.println(removeDuplicates(arr4));
        // Expected: 4
    }
}