package _0ProblemSolving;

public class P3 {
    public static void sumOfElements(int[] arr) {
        int sum=0;
        for(int i=0;i<arr.length;i++){
                sum=sum+arr[i];
        }
        System.out.println("The sum is " +sum);
    }

    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        sumOfElements(arr);
    }
}