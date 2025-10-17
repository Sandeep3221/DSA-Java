package _6Array;

public class arrayInMethods {
        public static void main(String[] args) {
                int[] arr={10,20,30};
                int[] x=arr;//x is shallow copy of arr
                x[1]=100;
                System.out.println(arr[1]);
        }
}
