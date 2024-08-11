public class biToDecimal {

    public static void biToDec(int biNum){
        int pow = 0;
        int decNum = 0;
        int myNum = biNum;

        while(biNum > 0){
            int lastdig = biNum % 10;
            decNum += (lastdig * (int) Math.pow(2, pow));

            pow++;
            biNum = biNum/10;
        }
        System.out.println("decimal of " + myNum +" = " + decNum);
    }
    public static void main(String[] args) {
        biToDec(1010);
    }
}
