package _6Array;

public class arrayTwoSum {
        public static void main(String[] args) {
        int[] arr = {5, 4, 6, 3, 11};
        int target = 7;
        boolean flag = false;

        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if ((arr[i] + arr[j]) == target) {
                    System.out.println("Pair found: " + arr[i] + " + " + arr[j] + " = " + target);
                    flag = true;
                }
            }
        }

        if (!flag) {
            System.out.println("No pair found for target " + target);
        }
    }
}

