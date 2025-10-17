package _6Array;

public class secondMaxinArray {
        public static void main(String[] args) {
                int[] arr={54,8,64,3,98};
                int max=Integer.MIN_VALUE;
                int smax=Integer.MIN_VALUE;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>max){
                                max=arr[i];
                        }
                }
                for(int i=0;i<arr.length;i++){
                        if(arr[i]>smax && arr[i]!=max){
                                smax=arr[i];
                        }
                }
                System.out.println("The largest is "+max);
                System.out.println("The second largest is "+smax);
        }
}
