package _3Loops;

public class table17 {
        public static void main(String[] args) {
                // for(int i=1;i<=170;i++){
                //         if(i%17 ==0){
                //                 System.out.println(i+" ");
                //         }
                // }this loops runs 154 times which is really bad instead we can do this
                // below this runs 10 times only
                // for(int i=17;i<170;i=i+17){
                //         System.out.println(i);
                // }
                // this is way more optimized
                for(int i=1;i<=10;i++){
                        System.out.println(i*16+" ");
                }
        }
}
