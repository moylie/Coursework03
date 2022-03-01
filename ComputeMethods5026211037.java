import java.util.Random;

public class ComputeMethods5026211037 {

    public double fToC (double Fahrenheit) {
        return 5 / 9.0 * (Fahrenheit - 32);
    }

    public double hypotenuse (double a, double b) {
        return Math.sqrt(a*a + b*b);
    }

    public int roll () {
        Random dice = new Random();
        int dadu1 = dice.nextInt(6)+1;
        int dadu2 = dice.nextInt(6)+2;
        return(dadu1+dadu2);
    }
    public static void main(String[]args){

    }
}