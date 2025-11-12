public class interningNew {
        public static void main(String[] args) {
                String s1="sandeep";
                String s2="sandeep";
                System.out.println(s1==s2);
                String t1=new String("sandy");
                String t2=new String("sandy");
                System.out.println(t1==t2);//false because their address are different 
                //new key word makes complete new character array with different address
                System.out.println(t1.equals(t2));//compare char by char
        }
}
