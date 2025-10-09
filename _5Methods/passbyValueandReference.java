package _5Methods;

public class passbyValueandReference {
        public static void change(int x){
                x=10;
                System.out.println(x);
        }
        public static void main(String[] args) {
                int x=6;
                System.out.println(x);
                change(x);//isse bass value jayega uppar or uppar naya dabba banega int x or jo ki chnage hoke 10 ho gaya lekin wo hame print nahi karna hai
                System.out.println(x);
        }
}
