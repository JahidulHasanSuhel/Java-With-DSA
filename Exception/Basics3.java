

public class Basics3 {

    public static void divisiondemo(int dividend, int devisor) throws ArithmeticException{
        System.out.println("Result is : " + dividend/devisor);
    }
    public static void main(String[] args) {
        //Throws
        // it's just a message shows that function might give a error.
        
        divisiondemo(10, 0);
    }
}
