package _6Array;


public class ElementKaProduct {
        public static void main(String[] args) {
                int[] arr={1,2,3,4,5};
                int prod=1;
                for(int i=0;i<arr.length;i++){
                        prod*=arr[i];
                }
                System.out.println("The product of elements is "+prod);
        }
}
