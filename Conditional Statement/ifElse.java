

public class ifElse {
    public static void main(String[] args) {
        // int a = 23; 
        // if( a >= 33){
        //     System.out.println("you've pass the exam");
        // }
        // else{
        //     System.out.println("you've failed");
        // }

        int age = 16;
        if(age >= 18){
            System.out.println("adult, vote, drive");
        }
        if(age >13 && age < 18){
            System.out.println("teenager");
        }

        else{
            System.out.println("not adult");
        }
    }
}
