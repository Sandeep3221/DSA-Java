package _6Array;
public class segrate0and1 {
        public static void main(String[] args) {
                int[] arr = {0, 1, 1, 0, 1, 0, 0, 1};
                int i=0,j=arr.length-1;
                while (i<j) {
                        if(arr[i]==1 && arr[j]==0){
                                int temp=arr[i];
                                arr[i]=arr[j];
                                arr[j]=temp;
                                i++;
                                j--;
                        }else if(arr[i]==0){
                                i++;
                        }else if(arr[j]==1){
                                j--;
                        }
                }
                System.out.println("segrated Array ");
                for(int ele:arr){
                        System.out.print(ele+" ");
                }
        }
}
