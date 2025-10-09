package _4PatternPrint;

import java.util.Scanner;

public class oddTriangle {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter the rows ");
                int n = sc.nextInt();
                for(int i=1;i<=n;i++){
                        for(int j=1;j<=i;j++){
                                System.out.print(2*j-1+" ");
                        }
                        System.out.println();
                }
        }
}
// if maths is not understood here then i can use this
// for(int i=1;i<=n;i++){
//          int a=1;
//          for(int j=1;j<=i;j++){
//                  System.out.print(a+" ");
//                  a+=2;
//          }
//          System.out.println();
// }
