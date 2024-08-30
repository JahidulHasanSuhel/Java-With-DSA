

public class Constructor {
    public static void main(String[] args) {
        Student s1 = new Student();
        // Student s2 = new Student("suhel");
        // Student s3 = new Student(123);
        s1.name = "suhel";
        s1.roll = 123;
        s1.pwd = 456;
        s1.marks[0] = 100;
        s1.marks[1] = 90;
        s1.marks[2] = 80;
        
        Student s2 = new Student(s1); //copy s1 to s2;
        s1.marks[2] = 100;
        for(int i = 0; i<3; i++){
            System.out.println(s2.marks[i]);
        }

    }
}

class Student{
    String name;
    int roll;
    int pwd;
    int marks[];

    //shallow copy Constructor
    // Student(Student s1){
    //     this.name = s1.name;
    //     this.roll = s1.roll;

    // }

    //deep copy constructor
    Student(Student s1){
        marks = new int[3];
        this.name = s1.name;
        this.roll = s1.roll;
        for(int i = 0; i<marks.length; i++){
            this.marks[i] = s1.marks[i]; 
        }
    }

    //Non-parameterized
    Student(){
        System.out.println("Constructor is called..");
    }

    //parameterized
    Student(String name){
        this.name = name;
    }

    Student(int roll){
        this.roll = roll;
    }
}

//types of Constructor
// 1. copy Constructor
// 2. parameterized 
// 3. Non-parameterized