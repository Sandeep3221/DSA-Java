package _9SortingAlgo;

public class SelectionSort {
        public static void print(int[] arr){
                for(int ele:arr){
                        System.out.print(ele+" ");
                }
                System.out.println();
        }
        public static void main(String[] args) {
                int arr[]={5,-8,54,546,8,6,7,9};
                int n=arr.length;
                print(arr);
                for(int i=0;i<=n-1;i++){
                        int minIndex=i;
                        for(int j=i+1;j<n;j++){
                                if(arr[j]<arr[minIndex]){
                                      minIndex=j;  
                                }
                        }
                        int temp=arr[i];
                        arr[i]=arr[minIndex];
                        arr[minIndex]=temp;
                }
                print(arr);
        }
}
