import java.util.Scanner;

class Student{
    Scanner input = new Scanner(System.in);
    int marks,attendance;
    String name,rollno;
    public Student(){
        name = "";
        rollno = "";
        marks = 0;
        attendance = 0;
    }
    
        void set()
        {
            if(marks<0)
            {
                marks = 0;
            }
            else if(marks>100)
            {
                marks = 100;
            }
            if(attendance>75)
            {
                marks = (110*marks/100);
            }
            if(marks>100)
            {
                marks = 100;
            }
        }
        void get()
        {
            name = input.next();
            rollno = input.next();
            marks = input.nextInt();
            attendance = input.nextInt();
        }

}

public class StudentTest{
    public static void main(String[] args){
        
        Student s1 = new Student();
        Student s2 = new Student();
        s1.get();s2.get();
        s1.set();s2.set();
        System.out.println(s1.name+" "+s1.rollno+" "+s1.marks+" "+s1.attendance);
        System.out.println(s2.name+" "+s2.rollno+" "+s2.marks+" "+s2.attendance);
    }
}

