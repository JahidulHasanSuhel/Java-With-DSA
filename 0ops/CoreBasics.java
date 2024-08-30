

public class CoreBasics {
    public static void main(String[] args) {
        Pen p1 = new Pen();
        p1.setColor("green");
        System.out.println(p1.getColor());
        p1.setTip(5);
        System.out.println(p1.getTip());

        //this is also possible
        p1.setColor("red"); 
        System.out.println(p1.getColor());

        //Access Modifiers Examples
        BankAc MyAc = new BankAc();
        MyAc.username = "suhel";
        MyAc.setPw(1234);

    }
}


//Encasulation is also applied here
class Pen{
   private String color;
    private int tip;

    //Getter
    String getColor(){
        return this.color;
    }
    
    int getTip(){
        return this.tip;
    }

    //Setter
    void setColor(String newcolor){
        color = newcolor;
    }

    void setTip(int newTip){
        tip = newTip;
    }

}

//Access Modifiers
class BankAc{
   public String username;
   private int pw;

   public void setPw(int pwd){
    pw = pwd;
   }
}