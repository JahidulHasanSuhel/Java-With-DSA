public class Static {
    public static void main(String[] args) {

        Stu s1 = new Stu();
        s1.schoolName = "JHS";

        Stu s2 = new Stu();
        System.out.println(s2.schoolName);
        
    }
}


class Stu{
    String name;
    int roll;

    static String schoolName;

    void setName(String name){
        this.name = name;
    }

    String getName(){
        return this.name;
    }
}

