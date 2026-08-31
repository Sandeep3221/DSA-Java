package _0ProblemSolving;

public class P2 {
        public static void ProductOfElement(int[] arr){
                int product=1;
                for(int i=0;i<arr.length;i++){
                        product=product*arr[i];
                }
                System.out.println("The product is " +product);
        }
        public static void main(String[] args) {
                int[] arr = {1,3,5,6,7,7,8};
                ProductOfElement(arr);
        }
}
