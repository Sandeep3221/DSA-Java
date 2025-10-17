package _6Array;

public class RotateanArray {
        public static void reverse(int arr[],int i,int j){
                while(i<j){
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        i++;
                        j--;
                }
        }
        public static void main(String[] args) {
                int arr[] = {3, 19, 56, 9, 83, 18, 24, 85, 14};
                int d=3;//remove first three element and put it to end
                reverse(arr, 0, d-1);
                reverse(arr, d, arr.length-1);
                reverse(arr, 0, arr.length-1);
                for(int ele:arr){
                        System.out.print(ele+" ");
                }
        }
}
