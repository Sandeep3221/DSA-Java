package _4PatternPrint;

import java.util.Scanner;

public class binaraTriangle {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the rows ");
                int rows = sc.nextInt();
                for(int i=1;i<=rows;i++){
                        for(int j=1;j<i;j++){
                                if((i+j)%2==0){
                                        System.out.print(1+" ");
                                }else{
                                        System.out.print(0+" ");
                                }
                        }
                        System.out.println();
                }
        }
}
