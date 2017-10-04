import java.util.Scanner;

public class SayHelloAgain {
public static void main(String arg []) {
    String name, lastName;
    Scanner keyboard = new Scanner(System.in);
    System.out.println("Please Enter your name?");
    name = keyboard.next();
    System.out.println("your last name");
    lastName = keyboard.next();
    System.out.println(heyThere(name));
    System.out.println(heyThereFrench(name));
    System.out.println(heyThereTwi(name));
    System.out.println(heyThereOromo(name));
}
public static String heyThere(String name) {
    return "Hello," + name + "!";
}
public static String heyThereFrench(String name) {
    return "Bonjoure," + name + "!";
}
public static String heyThereTwi(String name){

return "Mahai," +name+ "!";}

public static String heyThereOromo(String name) {
    return "Akam," +name+ "!";}
    }
