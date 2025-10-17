package _6Array;

public class ReversePartofArray {
        public static void main(String[] args) {
                int arr[]={3,19,56,9,83,18,24,85,14};
                int i=2,j=5;//kaha se kaha tak chiye wo likha hai ye
                while (i<j) {
                        int temp=arr[i];
                        arr[i]=arr[j];
                        arr[j]=temp;
                        i++;
                        j--;
                }
                for(int ele:arr){
                        System.out.print(ele+" ");
                }
        }
}
