import java.util.Scanner;

public class Que2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String n;
        System.out.println("Name = ");                 
        n = sc.nextLine();   

        System.out.println("Roll No. = ");                 
        int r = sc.nextInt(); 

        Student s = new Student(n,r);
        System.out.println("Name = " + s.getname());
        System.out.println("Roll No = "+ s.getrollno()); 
    }
}
    class Student {
    private String name;
    private int rollno;
   
    public Student(String name , int rollno) {  
            this.name = name;
            this.rollno = rollno;
        }
        public String getname() {
            return this.name;
        }
        public int getrollno() {
            return this.rollno;
    }     
}        