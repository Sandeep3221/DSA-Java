package _4PatternPrint;

import java.util.Scanner;

public class starPlus {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the rows ");
                int rows = sc.nextInt();
                System.out.print("Enter the col ");
                int cols = sc.nextInt();
                for(int i=1;i<=rows;i++){
                        for(int j=1;j<=cols;j++){
                                if(i==((rows/2)+1) || j==((cols/2)+1)){
                                        System.out.print("* ");
                                }else{
                                        System.out.print("  ");
                                }
                        }
                        System.out.println();
                }
        }
}
