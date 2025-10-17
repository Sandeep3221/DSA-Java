package _6Array;

public class productOfElement {
        public static void main(String[] args) {
                int arr[]={54,8,64,3,98};
                int product=1;
                for(int i=1;i<arr.length;i++){
                        product*=arr[i];
                }
                System.out.println("The product of the elements is "+product);
        }
}
