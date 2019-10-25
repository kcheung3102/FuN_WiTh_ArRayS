import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String s;
        String toAdd ="";
	    ArrayList<String> colors = new ArrayList<String>();

	    while(!toAdd.equalsIgnoreCase("q")) {
            System.out.println("Add a new color: ");
            s = input.nextLine();
            colors.add(s);
            System.out.println("Another color?(y/q)");
            toAdd = input.nextLine().toLowerCase();
        }
        System.out.println(colors);
        //keeps adding colors until you q....then prints out the array of colors.

    }
}
