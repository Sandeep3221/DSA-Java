package _0ProblemSolving;

public class P6 {
    public static int findDuplicate(int[] arr) {
        boolean[] isVisited = new boolean[arr.length];

        for (int i = 0; i < arr.length; i++) {
            int currentNum = arr[i];

            if (isVisited[currentNum]) {
                return currentNum;
            }

            isVisited[currentNum] = true;
        }

        return -1;
    }

    public static void main(String[] args) {
        int[] arr = {1, 3, 4, 2, 2};
        System.out.println(findDuplicate(arr)); // Output: 2
    }
}