package _9SortingAlgo;

public class SelctionSortfromlast {
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
                for(int i=n-1;i>0;i--){
                        int maxIndex=0;
                        for(int j=1;j<=i;j++){
                                if(arr[j]>arr[maxIndex]){
                                        maxIndex=j;
                                }
                        }
                        
                        int temp=arr[i];
                        arr[i]=arr[maxIndex];
                        arr[maxIndex]=temp;
                }
                print(arr);
        }
}
