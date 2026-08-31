package _0ProblemSolving;

public class P10 {
    public static boolean hasTwoSum(int[] arr, int target) {
        int i = 0;
        int j = arr.length - 1;

        while (i < j) {
            // Your logic goes here:
            // 1. Calculate sum of arr[i] + arr[j]
            // 2. If sum == target -> return true
            // 3. If sum < target -> which pointer should move?
            // 4. If sum > target -> which pointer should move?
            int sum=arr[i]+arr[j];
            if(sum==target){
                return true;
            }else if(sum<target){
                i++;
            }else{
                j--;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {2, 7, 11, 15};
        System.out.println(hasTwoSum(arr1, 9));  // Expected: true

        int[] arr2 = {1, 2, 4, 8};
        System.out.println(hasTwoSum(arr2, 50)); // Expected: false
    }
}