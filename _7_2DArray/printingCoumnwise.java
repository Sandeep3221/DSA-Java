package _7_2DArray;

public class printingCoumnwise {
        public static void main(String[] args) {
                int [][] arr={{6,0,7,1},{1,3,7,6},{9,6,4,8}};
                for(int j=0;j<arr[0].length;j++){
                        for(int i=0;i<arr.length;i++){
                                System.out.print(arr[i][j]+" ");
                        }
                        System.out.println();
                }
        }
}
