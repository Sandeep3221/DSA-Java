package _2IfElse;

import java.util.Scanner;

public class ProfitLoss {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.print("Enter sp ");
                int sp = sc.nextInt();
                System.out.print("Enter cp ");
                int cp = sc.nextInt();
                if(sp>cp)
                        {System.out.println("The profit is "+(sp-cp));
                }
                else if(cp>sp)
                        {System.out.println("The Loss is "+(cp-sp));
                }
                if(cp==sp)
                        {System.out.println("No profit no loss");
                }
        }
}
