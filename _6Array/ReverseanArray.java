package _6Array;

public class ReverseanArray {
        public static void swap(int arr[],int i,int j){
                int temp;
                temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
        }
        public static void main(String[] args) {
                int[] arr={54,8,64,3,98};
                int i=0;
                int j=arr.length-1;
                while(i<j){
                        swap(arr,i,j);
                        i++;
                        j--;
                }
                for(int ele:arr){
                        System.out.print(ele+" ");
                }
        }
}
