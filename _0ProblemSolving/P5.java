package _0ProblemSolving;

public class P5 {
    public static int findDuplicate(int[] arr) {
        for(int i=0;i<arr.length;i++){
                for(int j=i+1;j<arr.length;j++){
                        if(arr[i]==arr[j]){
                                return arr[i];
                        }
                }
        }

        return 0;
    }

    public static void main(String[] args) {
        int[] arr = {2, 3, 4, 5, 2};
        System.out.println(findDuplicate(arr));
    }
}