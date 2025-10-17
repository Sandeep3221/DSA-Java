package _6Array;

public class oddEvenQuestion {
        public static void main(String[] args) {
                int[] arr={54,8,64,3,98};
                for(int i=0;i<arr.length;i++){
                        if(arr[i]%2==1){
                                arr[i]*=2;
                        }else{
                                arr[i]+=10;
                        }
                        System.out.println(arr[i]);
                }
        }
}
