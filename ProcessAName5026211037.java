import java.util.Scanner;

public class ProcessAName5026211037 {

    public static void main (String [] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Type your name: ");

        String name = input.nextLine();
        input.close();

        String[] sn = name.split(" ");
        String fn = sn[0].substring(0,1).toUpperCase();
        String ln = sn[sn.length-1];

        System.out.println("Your name is: "+fn +", "+ ln+".");

    }
}