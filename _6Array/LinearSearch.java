package _6Array;

public class LinearSearch {
        public static void main(String[] args) {
                int[] arr={54,8,64,3,98};
                int target=3;
                boolean flag=false;
                for(int i=0;i<arr.length;i++){
                        if(arr[i]==target){
                                flag=true;
                                System.out.println("Found in idx "+i);
                                break;
                        }
                }
                if(flag){
                        System.out.println("Target in arr");
                }else{
                        System.out.println("Not in the array ");
                }
        }
}
