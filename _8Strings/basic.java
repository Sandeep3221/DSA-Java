import java.util.Scanner;

public class basic {
        public static void main(String[] args) {
                @SuppressWarnings("resource")
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the string");
                String str=sc.nextLine();//here sc.next() ignores the text after the space
                System.out.println(str);
        }
}
