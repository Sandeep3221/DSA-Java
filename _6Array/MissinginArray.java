package _6Array;

public class MissinginArray {
        public static void main(String[] args) {
                int arr[]={1,2,3,5};//ans should be 4 which is missing here
                int n=arr.length+1;
                int sum=n*(n+1)/2;
                int arrSum=0;
                for(int ele:arr){
                        arrSum+=ele;
                }
                int missing=sum-arrSum;
                System.out.println("The missing term is "+missing);
        }
}
