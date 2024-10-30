import java.util.*;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        //doLoop();
        //whileLoop();
        //greetName(input);
        //ifSats();
        //switchWats();
        //forLoop();
        //arrayer();
        //forEach();
        listor();


    }
     //funktion utan retur eller in parametrar/argument
    public static void greeting(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv ditt namn:");
        String name = scanner.nextLine();


    }

    //Villkor, switch
    public static void switchWats(){
        System.out.println("välj ett alternativ:");
        System.out.println("1: säg hej");
        System.out.println("2: säg hejdå");
        System.out.println("o: avsluta");

        String choice = getStringFromUser();

        switch (choice){
            case "1":
                System.out.println("första caset stämde");
                break;

                case "2":
                    System.out.println("andra caset stämde");
                    break;
            case "0":
                System.out.println("hejdå...");
                break;
                default:
                    System.out.println("Inget alternativ passar");
        }
    }


    // /if-sats
    public static void ifSats(){

       int x = 10;
       int y = 20;
       int z = 30;

       if(x < y){
           System.out.println(" första Påståendet är sant");
           if (y < z){
               System.out.println("Bägge är sanna");
           }
       } else if(y > z) {
           System.out.println("första påståendet är falsk men det andra är sant");
       } else {
           System.out.println("Bägge är falska");
       }


        System.out.println("Detta skriver vi jämt");

    }


    //funktion som returnerar ett värde (aka utan void)
    public static String getStringFromUser(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Skriv ditt namn:");
        String input = scanner.nextLine();

        return input;

    }

    //funktion MED in parametrar/argument

    public static void greetName(String name){
        System.out.println("Hej" + " " + name);


    }

    //loopar
    // forloop, forEach <(när man vet att det finns en gräns)
    // (när man vill göra något obestämt antal gånger)> while, do-while

    public static void forLoop(){

        String text = "hejsan";
        for (int i = 0; i < text.length(); i++) {
            System.out.println(text.toCharArray()[i]);
        }

    }

    public static void whileLoop(){


        boolean running = true;

        while (running){

            System.out.println("ännu ett varv.....");
            System.out.println("vill du avsluta?");
            String input = getStringFromUser();

            if (input.equals("ja")){
                running = !running;
                //eller break;
                //eller running = false;
            }
        }
    }


    public static void doLoop(){

        //körs minst ett varv jämt

        boolean running = true;
        do {
            System.out.println("ännu ett varv.....");
            System.out.println("vill du avsluta?");
            String input = getStringFromUser();

            if (input.equals("ja")){
                running = !running; //!running = inte det den var innan aka false or true
                //eller break;
                //eller running = false;
            }

        } while (running);


    }

    //forEach, när man vill komma åt exakt index tex i listor

    public static void forEach(){

        int[] numbers ={3,41,26,37,48,15,36,57,81,92};

        char[] text = "hej".toCharArray();

        for (char i : text){ //int ist för char för att få ut dess index
            System.out.println("i =" + i);
        }
    }

    //Arrayer

    public static void arrayer(){

        int number = 15;
        int[] numbers ={0,1,2,3,4,5,6,7,8,9}; //om vi vet vilka värden vi vill ha kan vi skriva såhär

        int[] numbers2 =new int[10]; //om vi bara vet att vi vill ha 10 skriver vi såhär

        int[] numbers3 = numbers.clone();

        numbers2[5] = number;

        for(int i : numbers2){
           // System.out.println("i =" + i);
        }
        System.out.println("numbers = " + numbers); //får ut adressen till minnet
        System.out.println("numbers = " + Arrays.toString(numbers)); //så man ser innehållet och inte adressen till minnet

        System.out.println("numbers2 =" + numbers2);
        System.out.println("innehåll i numbers2 " + Arrays.toString(numbers2));

        System.out.println("numbers3 =" + numbers3);
        System.out.println("innehåll i numbers3 " + Arrays.toString(numbers3));


    }

    public static void listor(){
          //array list
        ArrayList<String> nameList = new ArrayList<>();
          //link list
        HashSet<String> nameSet = new HashSet<>(); //finns inget dublettet i ett Set, finns två lika skrivs det över
        //går inte att plocka ut per index

        HashMap<String, String> playerAsMap = new HashMap<>(); //K=key, V=value

        playerAsMap.put("name", "Stephanie");
        playerAsMap.put("STR", "199999");
        playerAsMap.put("equippedWeapon", "ett coolt vapen");




        nameSet.add("Stina");
        nameSet.add("Wingman");
        nameSet.add("Dizzy");
        nameSet.add("Dizzy");
        nameSet.add("Doodle");

        nameList.add("Stephanie");
        nameList.add("Emelie");
        nameList.add("Benny");

        nameList.size(); //för att få reda på längden på listan. length funkar ej här


        System.out.println("playerAsMap = " + playerAsMap);

        for (String k: playerAsMap.keySet()){ //keySet eller Value

            //System.out.println("k = " + k); //skriv V för att skriva ut varje value, K för keys
            System.out.println( k + " : " + playerAsMap.get(k)); // får ut key : value
        }

//        System.out.println("nameList = " + nameList);
//
//        System.out.println("nameList.get(2) = " + nameList.get(2)); //om man vill skriva ut ett specifikt index
//
//        for (String s : nameSet){
//            if (s.startsWith("D")){
//                System.out.println("D = " + s); //för varje sak i listan som börjar på D skriver vi ut
//            }
//        }
//
//        System.out.println("nameSet = " + nameSet);



    }

}