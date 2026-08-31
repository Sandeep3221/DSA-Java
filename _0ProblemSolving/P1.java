package _0ProblemSolving;

public class P1 {
        public static void FindMaxMin(int[] arr){
                int max=arr[0];
                int min=arr[0];
                for(int i=0; i<arr.length; i++){
                        if(arr[i]>max){
                                max=arr[i];
                        }if(arr[i]<min){
                                min=arr[i];
                        }
                        
                }
                System.out.println("Maximum element is " +max);
                System.out.println("Minimum element is " +min);
        }
        public static void main(String[] args) {
                int[] arr={12, 35, 1, 10, 34, 1};
                FindMaxMin(arr);
        }
}
