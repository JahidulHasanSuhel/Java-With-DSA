public class Interface2 {
    public static void main(String[] args) {

    Bank b=new PNB();  
    System.out.println("ROI: "+b.rateOfInterest());  

        // Drawable d = new Circle();
        // d.draw();
    }
}

// interface Drawable{
//     void draw();
// }
// class Rectangle implements Drawable{
//   public void draw(){
//         System.out.println("Rectangle drawing");
//     }
// }

// class Circle implements Drawable{
//     public void draw(){
//         System.out.println("Circle drawing");
//     }
// }

interface Bank{  
    float rateOfInterest();  
}

class SBI implements Bank{  
    public float rateOfInterest(){
        return 9.15f;
    }   
}  
class PNB implements Bank{  
    public float rateOfInterest(){
        return 9.7f;
    }  
} 