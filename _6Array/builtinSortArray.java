package _6Array;
import java.util.Arrays;
public class builtinSortArray {
        public static void main(String[] args) {
                int[] arr={54,8,64,3,98};
                print(arr);
                Arrays.sort(arr);
                print(arr);
        }
        public static void print(int[] arr) {
                for(int i=0;i<arr.length;i++){
                        System.out.print(arr[i]+" ");
                }
                System.out.println();
        }
}
