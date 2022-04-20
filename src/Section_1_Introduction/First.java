package Section_1_Introduction;

import java.util.*;

public class First {

    public static void main(String[] args) {
        String name;
        
        try (Scanner sc = new Scanner(System.in)) {
			System.out.println("What is your name?: ");
			name=sc.nextLine();
		}
        System.out.println("Welcome, " + name + ".");
    }
    
}