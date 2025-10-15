package _6Array;

public class maxElement {
        public static void main(String[] args) {
                int arr[]={1,3,8,9,5,120};
                int max=arr[0];
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>max){
                                max=arr[i];
                        }
                }
                System.out.println("The maximum Element is "+max);
        }
}
