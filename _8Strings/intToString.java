import java.util.Scanner;

public class intToString {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc=new Scanner(System.in);
                int n=sc.nextInt();
                String s=" ";
                s+=n;
                System.out.println(s);
        }
}
