package _5Methods;

public class returnMandatory {
        //if there is return in (if) block it is mandatory to have return in else also
        public static int anamika(int a){
                if(a<5){
                        return a;
                }else return -1;
        }
        public static void main(String[] args) {
                System.out.println(anamika(9));
        }
}
