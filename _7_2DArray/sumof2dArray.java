package _7_2DArray;

public class sumof2dArray {
        public static void main(String[] args) {
                int [][] arr={{6,0,7,1},{1,3,7,6},{9,6,4,8}};
                int sum=0;
                for(int i=0;i<arr.length;i++){
                        for(int j=0;j<arr[0].length;j++){
                                sum+=arr[i][j];
                        }
                }
                System.out.println("The sum of 2D arr is "+sum);
        }
}
