package _6Array;

public class wavyArray {
        public static void main(String[] args) {
                int[] arr = {1, 2, 3, 4, 5, 6};
                for(int i=0;i<arr.length;i+=2){
                        int temp=arr[i];
                        arr[i]=arr[i+1];
                        arr[i+1]=temp;
                }
                System.out.print("Wavy Array: ");
                for (int num : arr) {
                System.out.print(num + " ");
                }
        }
}
