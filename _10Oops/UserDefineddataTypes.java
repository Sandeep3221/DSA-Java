package _10Oops;

public class UserDefineddataTypes {
        public static class Students {//this is class
                String name;
                int rollnum;
                double cgpa;
        }
        //Object is a real life entity
        //class is a blue print
        public static void main(String[] args) {
                Students s1=new Students();//s1 is an object out here and declaring
                s1.name="Khushi";
                s1.rollnum=23;
                s1.cgpa=8.5;


                Students s2=new Students();//s2 is an object out here 
                s2.name="Elvish";
                s2.cgpa= 9.5;
                s2.rollnum=33;

                Students s3=new Students();//s3 is an object out here
                s3.name="Anagha";
                s3.cgpa=9.3;
                s3.rollnum=13;
                System.out.println(s1.name+" "+s2.cgpa+" "+s3.rollnum);
        }
}
