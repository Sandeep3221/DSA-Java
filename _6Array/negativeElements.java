package _6Array;

public class negativeElements {
        public static void main(String[] args) {
                int[] arr={1,3,-8,-9,5,-120,9};
                for(int i=0;i<arr.length;i++){
                        if(arr[i]<0){
                                System.out.print(arr[i]+" ");
                        }
                }
        }
}
