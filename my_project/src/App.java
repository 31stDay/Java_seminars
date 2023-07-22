import java.util.HashMap;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        /***
         * Scanner in = new Scanner(System.in);
         * System.out.println("Enter your name");
         * String line = in.nextLine(); //in.next takes all before space
         * in.close();
         * System.out.println(line);
         * Integer a = 0; // int a;
         * String word = "hi";
         * Boolean flag = true; //false
         * Integer[] mass = {1,51,12,85,66,44};
         * HashMap<String, Integer> dist = new HashMap<String, Integer>
         * ();
         * for (int i = 0; i < mass.length; i++) {
         * System.out.println(i + 10);
         * }
         * System.out.println("Hello, World!");
         * for (Integer item:mass)
         * {
         * System.out.println(item)
         * if(item %2 == 0){
         * System.out.println(item +10);
         * }else{
         * System.out.println("test");
         * }
         * }
         * }
         * }
         */

        // get var type
        // Integer number=Integer.valueOf(15);
        // System.out.println(number.getClass().getName());

        // Guess the number
        Scanner in = new Scanner(System.in);
        System.out.print("Input data: ");
        int num = 5;
        int countNum = 3;
        for (int i = 0; countNum > i; countNum--) {
            Integer number = in.nextInt();
            System.out.println();
            Integer count = countNum - 1;
            if (number == num) {
                System.out.println("You guessed the number");
                break;
            }
            else if (count > i) {   
                System.out.println("Try again! You have " +count + " attempt(s)");
            } else {
                System.out.println("You didn't guess the number");  
            }    
        }
in.close();
    }
}