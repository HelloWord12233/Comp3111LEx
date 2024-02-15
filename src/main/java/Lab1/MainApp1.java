package Lab1;

public class MainApp1 {
    public static void main(String[] args){
        int b = 2;
        int n = 11;
        //adding new comment line
        System.out.println("Welcome to Scientific Calculator");
        System.out.println("Program started...");
        System.out.println(b+" to power " + n+" = "+ myLibrary.Power(b, n));
        System.out.println(n+"! = " + myLibrary.factorial(n));
        System.out.println("Program ..Ended ...");
    }
}
