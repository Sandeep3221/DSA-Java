package _0ProblemSolving;

public class P4 {
    public static int missingNumber(int[] arr) {
        int arraySum=0;
        for(int i=0;i<arr.length;i++){
                arraySum=arraySum+arr[i];
        }
        int n=arr.length;
        int totalSum=n*(n+1)/2;
        int result = totalSum-arraySum;
        System.out.println(result);
        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {3, 0, 1};
        System.out.println(missingNumber(arr));
    }
}