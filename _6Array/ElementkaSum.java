package _6Array;

public class ElementkaSum {
        public static void main(String[] args) {
                int[] arr={1,3,-8,9,5,120,9};
                int sum=0;
                for(int i=0;i<arr.length;i++){
                        sum+=arr[i];
                }
                System.out.println("The sum of Elements is "+sum);
        }
}
