class TestClass5026211037   {
    public static void main(String args[]) {
        ComputeMethods5026211037 cm = new ComputeMethods5026211037();

        //Konversi Celcius ke Fahrenheit
        System.out.println("Temp in celcius is " +cm.fToC(100.4));

        //Penghitung sisi miring (hypotenuse)
        System.out.println("Hypotenuse is " +cm.hypotenuse(7.64852927, 7.64852927));

        //Penghitung lemparan jumlah mata dadu
        System.out.println("The sum of the dice values is " +cm.roll());
    }
}