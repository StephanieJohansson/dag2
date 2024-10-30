import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv ditt namn:");
        String input = scanner.nextLine();

        greetName(input);
        ifSats();



    }
     //funktion utan retur eller in parametrar/argument
    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv ditt namn:");
        String name = scanner.nextLine();


    }

    //Villkor if-sats, boolean
    public static void ifSats(){

       int x = 10;
       int y = 20;

       if(x > y){
           System.out.println("Påståendet är sant");
       }

    }


    //funktion som returnerar ett värde (aka utan void)
    public static String getNameFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv ditt namn:");
        String input = scanner.nextLine();

        return input;

    }

    //funktion MED in parametrar/argument

    public static void greetName(String name){
        System.out.println("Hej" + " " + name);


    }

}