package _10Oops;

        class Students {
                String name;
                int rollnum;
                double cgpa;
                void print(){
                        System.out.println(name+" "+rollnum+" "+cgpa);
                }
        }
public class UserdefinedTheingSame {
        public static void main(String[] args) {
                Students s1=new Students();
                s1.name="Khushi";
                s1.rollnum=23;
                s1.cgpa=8.5;


                Students s2=new Students();
                s2.name="Elvish";
                s2.cgpa= 9.5;
                s2.rollnum=33;

                Students s3=new Students();
                s3.name="Anagha";
                s3.cgpa=9.3;
                s3.rollnum=13;
                s1.print();
                s2.print();
                s3.print();
        }
}
